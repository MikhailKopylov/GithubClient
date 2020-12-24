package com.amk.githubclient.model

class Model {

    private val counters = mutableListOf(0, 0, 0)

    private fun getCounter(index: Int): Int {
        if (isIndexCorrect(index)) {
            return counters[index]
        } else throw IllegalArgumentException("Index does not match the size of the list")
    }


    fun incrementAndGetCounter(index: Int): Int {
        if (isIndexCorrect(index)) {
            return ++counters[index]
        } else throw IllegalArgumentException("Index does not match the size of the list")
    }

    private fun isIndexCorrect(index: Int) = index >= 0 && index < counters.size
}