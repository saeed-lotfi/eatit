package ir.alirezaiyan.cache.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import ir.alirezaiyan.cache.Database
import ir.alirezaiyan.cache.FoodDBModel
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(): Database<FoodDBModel> = Database()

}