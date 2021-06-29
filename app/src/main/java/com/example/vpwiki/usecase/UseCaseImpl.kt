package com.example.vpwiki.usecase

import com.example.vpwiki.di.component.Repository
import com.example.vpwiki.di.component.UseCase
import javax.inject.Inject

class UseCaseImpl @Inject constructor(private val repository: Repository) : UseCase {

    override fun invoke(): String {
        return repository.getDataSource()
    }
}