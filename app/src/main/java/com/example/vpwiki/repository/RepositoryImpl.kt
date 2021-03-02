package com.example.vpwiki.repository

import com.example.vpwiki.datasource.DataSourceImpl
import com.example.vpwiki.di.component.Repository
import javax.inject.Inject

class RepositoryImpl @Inject constructor(
    private val dataSource: DataSourceImpl
) : Repository {

    override fun getDataSource(): String = dataSource.getData()

}