package br.com.wmpr.diointerandroiddeveloper.domain

import br.com.wmpr.diointerandroiddeveloper.core.UseCase
import br.com.wmpr.diointerandroiddeveloper.data.model.Repo
import br.com.wmpr.diointerandroiddeveloper.data.repositories.RepoRepository
import kotlinx.coroutines.flow.Flow

class ListUserRepositoriesUseCase(private val repository: RepoRepository) :
    UseCase<String, List<Repo>>() {

    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }

}