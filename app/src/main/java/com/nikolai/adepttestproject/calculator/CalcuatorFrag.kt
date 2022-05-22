package com.nikolai.adepttestproject.calculator

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.Fragment
import com.nikolai.adepttestproject.R

class CalcuatorFrag: Fragment() {
    private val viewModel: calcViewModel = calcViewModel()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_calculator, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val firstNumber = view.findViewById<EditText>(R.id.FirstNum)
        val SecondNumber = view.findViewById<EditText>(R.id.SecondNum)
        val resultText = view.findViewById<TextView>(R.id.Result)

        val buttonPlus = view.findViewById<Button>(R.id.plus)
        buttonPlus.setOnClickListener {
            val summ = viewModel.plus()
            resultText.text = summ.toString()
        }

        val buttonMinus = view.findViewById<Button>(R.id.minus)
        buttonMinus.setOnClickListener {
            val diff = viewModel.minus()
            resultText.text = diff.toString()

        val buttonMultiply = view.findViewById<Button>(R.id.multiply)
        buttonMultiply.setOnClickListener {
            val res = viewModel.multiply()
            resultText.text = res.toString()
        }
        val buttonDivide = view.findViewById<Button>(R.id.divide)
        buttonDivide.setOnClickListener {
            try {
                val res = viewModel.divide()
                resultText.text = res.toString()
            } catch(error: Exception) {
                resultText.text = error.message
            }            }
        }
        firstNumber.addTextChangedListener {fieldValue ->
            viewModel.updateFirstNumber(fieldValue.toString())
        }
        SecondNumber.addTextChangedListener {fieldValue ->
            viewModel.updateSecondNumber(fieldValue.toString())

        }

    }
}