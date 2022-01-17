package com.example.kotlintopics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var option = findViewById(R.id.sp_option) as Spinner
        var result = findViewById(R.id.tv_result) as TextView
        val options = arrayOf("Kirana", "Shashi", "Vishnu", "Sairam")
        option.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,options)

        option.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                result.text = options.get(p2)
                Toast.makeText(this@MainActivity,"You have selected option"+ " " +options.get(p2),Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                result.text = "Please select option"
            }
        }
    }
}