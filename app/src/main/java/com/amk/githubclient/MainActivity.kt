package com.amk.githubclient

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.amk.githubclient.databinding.ActivityMainBinding
import com.amk.githubclient.presenter.Presenter
import com.amk.githubclient.view.MainView

class MainActivity : AppCompatActivity(), MainView {

    private var _binding: ActivityMainBinding? = null
    private val binding: ActivityMainBinding get() = _binding!!


    private val presenter: Presenter by lazy {
        Presenter(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initView()
    }

    private fun initView() {
        with(binding) {
            btnCounter1.setOnClickListener { presenter.counterClickFirsButton() }
            btnCounter2.setOnClickListener { presenter.counterClickSecondButton() }
            btnCounter3.setOnClickListener { presenter.counterClickThirdButton() }
        }
    }

    override fun setFirstButtonText(text: String) {
        binding.btnCounter1.text = text
    }

    override fun setSecondButtonText(text: String) {
        binding.btnCounter2.text = text
    }

    override fun setThirdButtonText(text: String) {
        binding.btnCounter3.text = text
    }
}