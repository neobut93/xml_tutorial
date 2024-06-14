package com.kodeco.xml

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val textWithData = findViewById<TextView>(R.id.tvPerson)

        val person = intent.getSerializableExtra("EXTRA_PERSON") as Person
        textWithData.text = "${person.name} is from ${person.country} and ${person.age} years old"
    }
}