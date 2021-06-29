package com.example.vpwiki.ui

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.vpwiki.di.component.Repository
import com.example.vpwiki.di.component.UseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class MainViewModel @Inject constructor(
//    private val useCase: UseCase
) : ViewModel() {

    fun test(): String {
//        val data = useCase.invoke()
//        Log.d("hiltimpl", " data = $data")
//        return data
        return "empty string"
    }
}