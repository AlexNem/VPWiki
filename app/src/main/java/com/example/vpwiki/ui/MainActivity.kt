package com.example.vpwiki.ui

import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import androidx.navigation.fragment.NavHostFragment
import com.example.vpwiki.R
import com.example.vpwiki.databinding.ActivityMainBinding
import com.example.vpwiki.di.component.UseCase
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

//    @Inject lateinit var useCase: UseCase

    private val viewModel: MainViewModel by viewModels()
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

//        Log.d("hiltImpl", "test activity ${useCase.invoke()}" )

        viewModel.test()
        val navHostFragment = supportFragmentManager.findFragmentById(binding.NavHostFragment.id) as NavHostFragment
        val navController = navHostFragment.navController


    }

}