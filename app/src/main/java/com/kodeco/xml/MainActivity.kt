package com.kodeco.xml

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startButton = findViewById<Button>(R.id.btnStart)
        val stopButton = findViewById<Button>(R.id.btnStop)
        val sendButton = findViewById<Button>(R.id.btnSendData)
        val serviceStatus = findViewById<TextView>(R.id.textView)
        val editTextField = findViewById<EditText>(R.id.etField)

        startButton.setOnClickListener {
            Intent(this, MyService::class.java).also {
                startService(it)
                serviceStatus.text = "Service running"
            }
        }

        stopButton.setOnClickListener {
            Intent(this, MyService::class.java).also {
                stopService(it)
                serviceStatus.text = "Service stopped"
            }
        }

        sendButton.setOnClickListener {
            Intent(this, MyService::class.java).also {
                val dataString = editTextField.text.toString()
                it.putExtra("EXTRA_DATA", dataString)
                startService(it)
            }
        }
    }
}