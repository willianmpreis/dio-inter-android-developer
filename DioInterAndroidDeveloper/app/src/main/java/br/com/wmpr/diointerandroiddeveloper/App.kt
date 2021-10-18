package br.com.wmpr.diointerandroiddeveloper

import android.app.Application
import br.com.wmpr.diointerandroiddeveloper.data.di.DataModule
import br.com.wmpr.diointerandroiddeveloper.domain.di.DomainModule
import br.com.wmpr.diointerandroiddeveloper.presentation.di.PresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        DataModule.load()
        DomainModule.load()
        PresentationModule.load()
    }
}