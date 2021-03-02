package com.example.vpwiki.di.module

import com.example.vpwiki.di.component.Repository
import com.example.vpwiki.repository.RepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class Module {

    @Binds
    abstract fun bindTestDataRepository(
            repositoryImpl: RepositoryImpl
    ): Repository

}