package br.com.wmpr.diointerandroiddeveloper.data.repositories

import br.com.wmpr.diointerandroiddeveloper.core.RemoteException
import br.com.wmpr.diointerandroiddeveloper.data.services.GitHubService
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException

class RepoRepositoryImpl(private val service: GitHubService) : RepoRepository {

    override suspend fun listRepositories(user: String) = flow {
        try {
            val repoList = service.listRepositories(user)
            emit(repoList)
        } catch (ex: HttpException) {
            throw RemoteException(ex.message ?: "Não foi possível realizar a busca no momento")
        }
    }

}