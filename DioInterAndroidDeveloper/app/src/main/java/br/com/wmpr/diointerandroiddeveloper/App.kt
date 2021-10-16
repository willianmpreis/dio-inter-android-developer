package br.com.wmpr.diointerandroiddeveloper

import android.app.Application
import br.com.wmpr.diointerandroiddeveloper.data.di.DataModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        DataModule.load()

    }
}