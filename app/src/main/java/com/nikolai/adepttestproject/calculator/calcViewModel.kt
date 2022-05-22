package com.nikolai.adepttestproject.calculator
class calcViewModel {
    private var currentFirstString: String = ""
    private var currentSecondString: String = ""



    fun plus(): Int {
        checkParameters()
        return currentFirstString.toInt() + currentSecondString.toInt()
    }
    fun minus(): Int {
        checkParameters()
        return currentFirstString.toInt() - currentSecondString.toInt()
    }
    fun multiply(): Int {
        checkParameters()
        return currentFirstString.toInt() * currentSecondString.toInt()
    }
    fun divide(): Int {
        checkParameters()
        val second = currentSecondString.toInt()
        if (second != 0) {
            return currentFirstString.toInt() / currentSecondString.toInt()
        }
        else {
            throw Exception("dividing by 0")
        }
    }

    fun updateFirstNumber(number: String) {
        currentFirstString = number

    }
    fun updateSecondNumber(number: String) {
        currentSecondString = number
    }
    fun checkParameters() {
        if (currentFirstString == "" || currentSecondString == ""){
            throw Exception("One or more fields are empty")
        }
    }

}