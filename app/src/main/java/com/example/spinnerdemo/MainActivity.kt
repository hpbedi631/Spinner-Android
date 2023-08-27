package com.example.spinnerdemo

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val personNames = arrayOf("Anna", "Alex", "Chris", "Richard", "Vlad", "Willy")
        val arrayAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, personNames)
        // attached arrayAdapter to spinner
        spinner.adapter = arrayAdapter
        spinner.onItemSelectedListener = object :

            AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                spinnerResult.text = personNames[p2]
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }

        }
    }
}
