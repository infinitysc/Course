package com.learning.data.di

import com.learning.data.RepositoryImpl
import com.learning.data.network.NetworkRepositoryImpl
import com.learning.domain.usecases.MainRepository
import com.learning.domain.usecases.NetworkRepository
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
interface RepositoryModule {

    @Binds
    @Singleton
    fun bindNetworkRepository(impl : NetworkRepositoryImpl) : NetworkRepository
    @Binds
    @Singleton
    fun bindMainRep(impl : RepositoryImpl) : MainRepository
}