package com.example.vpwiki.datasource

import com.example.vpwiki.di.component.DataSource
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DataSourceImpl @Inject constructor() : DataSource {

    override fun getData(): String {
        return "Test Data!!!!!!!!!!!"
    }

}