package com.example.davaleba__1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        buttonClick.setOnClickListener {
            val numberStr = editTextNumber2.text.toString()
            if (numberStr.isNotEmpty()) {
                val number = numberStr.toInt() - 1
                editTextNumber2.setText(number.toString())
            }
        }
    }
}