package constraint.com.demobacking.di

import android.app.Application
import constraint.com.demobacking.App
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        BaseUiModule::class,
        FeedUiModule::class
    ]
)

interface AppComponent : AndroidInjector<App> {

    @Component.Factory
    interface Factory {

        fun create(@BindsInstance app: Application): AppComponent
    }
}