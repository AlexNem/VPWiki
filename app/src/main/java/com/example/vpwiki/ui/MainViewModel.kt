package com.example.vpwiki.ui

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.vpwiki.di.component.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class MainViewModel @Inject constructor(
    private val repository: Repository
) : ViewModel() {


    fun test(): String {
        val data = repository.getDataSource()
        Log.d("hiltimpl", " data = $data")
        return data
    }
}