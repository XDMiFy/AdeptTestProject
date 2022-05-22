package com.nikolai.adepttestproject.calculator

class calcViewModel {
    private var currentFirstString: String = ""
    private var currentSecondString: String = ""



    fun plus(): Int {
        return currentFirstString.toInt() + currentSecondString.toInt()
    }
    fun minus(): Int {
        return currentFirstString.toInt() - currentSecondString.toInt()
    }
    fun multiply(): Int {
        return currentFirstString.toInt() * currentSecondString.toInt()
    }
    fun divide(): Int {
        val second = currentSecondString.toInt()
        if (second != 0) {
            return currentFirstString.toInt() / currentSecondString.toInt()
        }
        else {
            throw Exception("NOT 0")
        }
    }

    fun updateFirstNumber(number: String) {
        currentFirstString = number

    }
    fun updateSecondNumber(number: String) {
        currentSecondString = number
    }

}