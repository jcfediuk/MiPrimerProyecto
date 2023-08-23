package com.example.miprimerproyecto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: ComparisonViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this)[ComparisonViewModel::class.java]

        val compareButton = findViewById<Button>(R.id.compareButton)
        val resultTextView = findViewById<TextView>(R.id.resultTextView)
        val editText1 = findViewById<EditText>(R.id.editText1)
        val editText2 = findViewById<EditText>(R.id.editText2)

        compareButton.setOnClickListener {

            val value1 = editText1.text.toString().toDoubleOrNull() ?: 0.0
            val value2 = editText2.text.toString().toDoubleOrNull() ?: 0.0

            val comparisonResult = viewModel.compareValues(value1, value2)

            resultTextView.text = getString(R.string.result_format, comparisonResult)
        }
    }
}
