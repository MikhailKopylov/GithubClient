package com.amk.githubclient.presenter

import com.amk.githubclient.model.Model
import com.amk.githubclient.view.MainView

const val FIRST_ELEMENT = 0
const val SECOND_ELEMENT = 1
const val THIRD_ELEMENT = 2

class Presenter(private val view: MainView) {

    private val model = Model()

    fun counterClickFirsButton() {
        view.setFirstButtonText(model.incrementAndGetCounter(FIRST_ELEMENT).toString())
    }

    fun counterClickSecondButton() {
        view.setSecondButtonText(model.incrementAndGetCounter(SECOND_ELEMENT).toString())
    }

    fun counterClickThirdButton() {
        view.setThirdButtonText(model.incrementAndGetCounter(THIRD_ELEMENT).toString())
    }

}