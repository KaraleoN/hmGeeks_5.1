package com.geeks.hmgeeks_51

class CounterPresenter {

    private val model = CounterModel()
    private var counterContract: CounterContract? = null

    fun attachCounterContract(counterContract: CounterContract) {
        this.counterContract = counterContract
        counterContract.showResult(model.getResult())
    }

    fun onIncrement() {
        model.increment()
        val result = model.getResult()
        counterContract?.showResult(result)
        handleSpecialCases(result)
    }

    fun onDecrement() {
        model.decrement()
        val result = model.getResult()
        counterContract?.showResult(result)
        handleSpecialCases(result)
    }

    private fun handleSpecialCases(result: Int) {
        when (result) {
            10 -> counterContract?.showToast("Поздравляем!")
            15 -> counterContract?.changeTextColor(android.graphics.Color.GREEN)
        }
    }
}