package br.com.wmpr.diointerandroiddeveloper.data.services

import br.com.wmpr.diointerandroiddeveloper.data.model.Repo
import retrofit2.http.GET
import retrofit2.http.Path

interface GitHubService {
    @GET("users/{user}/repos")
    suspend fun listRepositories(@Path("user") user: String): List<Repo>
}