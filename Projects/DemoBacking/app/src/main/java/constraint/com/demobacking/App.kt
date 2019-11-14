package constraint.com.demobacking

import constraint.com.demobacking.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class App : DaggerApplication(){
    override fun applicationInjector(): AndroidInjector<App> {
        return DaggerAppComponent.factory()
            .create(this)
    }
}