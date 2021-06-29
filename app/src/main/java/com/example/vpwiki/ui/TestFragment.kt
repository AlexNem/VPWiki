package com.example.vpwiki.ui

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.vpwiki.databinding.TestLayoutBinding
import com.example.vpwiki.di.component.UseCase
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class TestFragment: Fragment() {

//    @Inject
//    lateinit var useCase: UseCase

    lateinit var binding: TestLayoutBinding
    private val viewModel by viewModels<TestViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = TestLayoutBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.test()
//        Log.d("hiltImpl", "test activity ${useCase.invoke()}" )

    }
}