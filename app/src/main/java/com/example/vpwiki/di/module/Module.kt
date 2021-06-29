package com.example.vpwiki.di.module

import com.example.vpwiki.di.component.Repository
import com.example.vpwiki.di.component.UseCase
import com.example.vpwiki.repository.RepositoryImpl
import com.example.vpwiki.usecase.UseCaseImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.FragmentComponent
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class Module {

    @Binds
    abstract fun bindTestDataRepository(
            repositoryImpl: RepositoryImpl
    ): Repository

    @Binds
    abstract fun bindUseCase(
        useCaseImpl: UseCaseImpl
    ): UseCase

}