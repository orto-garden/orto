package coop.uwutech.orto.android

import android.app.Application
import coop.uwutech.orto.android.di.viewModelModule
import coop.uwutech.orto.shared.di.initKoin
import org.koin.android.BuildConfig
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.logger.Level

class OrtoApplication: Application() {
    override fun onCreate() {
        super.onCreate()

        initKoin {
            androidLogger(if (BuildConfig.DEBUG) Level.ERROR else Level.NONE)
            androidContext(this@OrtoApplication)
            modules(
                viewModelModule
            )
        }
    }
}