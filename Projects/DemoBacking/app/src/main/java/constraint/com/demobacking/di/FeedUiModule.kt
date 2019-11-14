package constraint.com.demobacking.di

import androidx.lifecycle.ViewModel
import constraint.com.demobacking.FeedFragment
import constraint.com.demobacking.FeedViewModel
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.IntoMap

@Module
abstract class FeedUiModule {

    @ContributesAndroidInjector
    abstract fun feedFragment(): FeedFragment


    @Binds
    @IntoMap
    @ViewModelKey(FeedViewModel::class)
    abstract fun feedViewModel(viewModel: FeedViewModel) : ViewModel
}