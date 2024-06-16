package com.kodeco.xml

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstFragmentButton = findViewById<Button>(R.id.btnFragment1)
        val secondFragmentButton = findViewById<Button>(R.id.btnFragment2)

        val firstFragment = FirstFragment()
        val secondFragment = SecondFragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment, firstFragment)
            commit()
        }

        firstFragmentButton.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment, firstFragment)
                //is used to add fragment in stack
                addToBackStack(null)
                commit()
            }
        }

        secondFragmentButton.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment, secondFragment)
                //is used to add fragment in stack
                addToBackStack(null)
                commit()
            }
        }
    }
}