package br.com.wmpr.diointerandroiddeveloper.domain.di

import br.com.wmpr.diointerandroiddeveloper.domain.ListUserRepositoriesUseCase
import org.koin.core.context.loadKoinModules
import org.koin.core.module.Module
import org.koin.dsl.module

object DomainModule {

    fun load() {
        loadKoinModules(useCaseModules())
    }

    private fun useCaseModules(): Module {
        return module {
            factory { ListUserRepositoriesUseCase(get()) }
        }
    }
}