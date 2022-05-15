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
            val x = firstNumber.text.toString().toInt()
            val y = SecondNumber.text.toString().toInt()
            val summ = viewModel.plus(x, y)
            view.findViewById<TextView>(R.id.Result).text = summ.toString()
        }

        val buttonMinus = view.findViewById<Button>(R.id.minus)
        buttonMinus.setOnClickListener {
            val x = firstNumber.text.toString().toInt()
            val y = SecondNumber.text.toString().toInt()
            val diff = viewModel.minus(x, y)
            view.findViewById<TextView>(R.id.Result).text = diff.toString()

        }
        firstNumber.addTextChangedListener {fieldValue ->
            viewModel.updateFirstNumber(fieldValue.toString())
        }
        SecondNumber.addTextChangedListener {fieldValue ->
            viewModel.updateSecondNumber(fieldValue.toString())

        }

    }
}