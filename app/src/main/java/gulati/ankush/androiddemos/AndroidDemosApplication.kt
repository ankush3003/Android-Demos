package gulati.ankush.androiddemos

import android.app.Application
import gulati.ankush.androiddemos.di.koinModule
import org.koin.android.ext.android.startKoin

class AndroidDemosApplication: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin(this,
            listOf(koinModule))
    }
}