package br.edu.up.rgm34295071

import android.app.Application
import br.edu.up.rgm34295071.data.AppContainer
import br.edu.up.rgm34295071.data.AppDataContainer

class InventoryApplication : Application() {

    lateinit var container: AppContainer

    override fun onCreate() {
        super.onCreate()
        container = AppDataContainer(this)
    }
}
