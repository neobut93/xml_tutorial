package com.kodeco.xml

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startButton = findViewById<Button>(R.id.btnStart)
        val stopButton = findViewById<Button>(R.id.btnStop)
        val text = findViewById<TextView>(R.id.textView)

        startButton.setOnClickListener {
            Intent(this, MyIntentService::class.java).also {
                startService(it)
                text.text = "Service running"
            }
        }

        stopButton.setOnClickListener {
            MyIntentService.stopService()
            text.text = "Service stopped"
        }
    }
}