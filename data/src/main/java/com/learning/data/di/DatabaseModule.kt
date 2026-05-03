package com.learning.data.di

import android.content.Context
import androidx.room.Room
import com.learning.data.db.AppDatabase
import com.learning.data.db.DAOElement
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DatabaseModule {
    @Provides
    @Singleton
    fun provideDatabase(context: Context): AppDatabase {
        return Room.databaseBuilder(
            context,
            AppDatabase::class.java,
            "database"
        ).build()
    }
    @Provides
    fun provideMockDao(db: AppDatabase): DAOElement {
        return db.mockDao()
    }
}