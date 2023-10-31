package com.ncodes.ecommerce.di

import android.app.Application
import androidx.room.Room
import com.ncodes.ecommerce.landing.data.repository.ProductRepositoryImpl
import com.ncodes.ecommerce.common.EcommerceDatabase
import com.ncodes.ecommerce.landing.domain.repository.ProductRepository
import com.ncodes.ecommerce.landing.domain.usecases.GetAllProducts
import com.ncodes.ecommerce.landing.domain.usecases.ProductUseCases
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideEcommerceDatabase(app: Application) : EcommerceDatabase {
        return Room.databaseBuilder(
            app,
            EcommerceDatabase::class.java,
            EcommerceDatabase.DATABASE_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun provideProductRepository(database: EcommerceDatabase): ProductRepository {
        return ProductRepositoryImpl(database.productDao)
    }

    @Provides
    @Singleton
    fun providesProductUseCases(providedProductRepository: ProductRepository): ProductUseCases {
        return ProductUseCases(
            getAllProducts = GetAllProducts(providedProductRepository),
        )
    }
}