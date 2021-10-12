package br.com.wmpr.diointerandroiddeveloper

import android.app.Application
import br.com.wmpr.diointerandroiddeveloper.data.AppDatabase
import br.com.wmpr.diointerandroiddeveloper.data.BusinessCardRepository

class App : Application() {
    val database by lazy { AppDatabase.getDatabase(this) }
    val repository by lazy { BusinessCardRepository (database.businessDao()) }
}