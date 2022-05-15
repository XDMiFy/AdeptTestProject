package com.nikolai.adepttestproject.calculator

class calcViewModel {
    private var currentFirstString: String = ""
    private var currentSecondString: String = ""



    fun plus(x: Int, y: Int): Int {
        return x + y
    }
    fun minus(x: Int, y: Int): Int {
        return x - y
    }

    fun updateFirstNumber(number: String) {
        currentFirstString = number

    }
    fun updateSecondNumber(number: String) {
        currentSecondString = number
    }

}