package com.kodeco.xml

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonApply = findViewById<Button>(R.id.btnApply)
        val nameField = findViewById<EditText>(R.id.etName)
        val ageField = findViewById<EditText>(R.id.etAge)
        val countryField = findViewById<EditText>(R.id.etCountry)

        buttonApply.setOnClickListener {
            val name = nameField.text.toString()
            val age = ageField.text.toString().toInt()
            val country = countryField.text.toString()
            val person = Person(
                name, age, country
            )
            Intent(this, SecondActivity::class.java).also {
                it.putExtra("EXTRA_PERSON", person)
                startActivity(it)
            }
        }
    }
}