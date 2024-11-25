package com.example.rgm34295071

import android.app.Application
import com.example.rgm34295071.data.AppContainer
import com.example.rgm34295071.data.AppDataContainer

class InventoryApplication : Application() {

    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
        container = AppDataContainer(this)
    }
}
