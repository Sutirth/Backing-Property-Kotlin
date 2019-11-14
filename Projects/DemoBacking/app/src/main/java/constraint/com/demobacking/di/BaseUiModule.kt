package constraint.com.demobacking.di

import dagger.Module

/**
 * Dagger module for declaring UI layer dependencies for base module.
 */
@Module(includes = [ViewModelFactoryModule::class])
class BaseUiModule