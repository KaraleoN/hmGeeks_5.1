package com.geeks.hmgeeks_51

class CounterModel {

    private var count = 0

    fun increment() {
        count++
    }

    fun decrement() {
        count--
    }

    fun getResult() = count

}