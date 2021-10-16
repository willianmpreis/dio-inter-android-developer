package br.com.wmpr.diointerandroiddeveloper.data.repositories

import br.com.wmpr.diointerandroiddeveloper.data.model.Repo
import kotlinx.coroutines.flow.Flow

interface RepoRepository {
    suspend fun listRepositories(user: String): Flow<List<Repo>>
}