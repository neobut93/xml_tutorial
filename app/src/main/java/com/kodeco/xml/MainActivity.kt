package com.kodeco.xml

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonTakePhoto = findViewById<Button>(R.id.btnTakePhoto)
        buttonTakePhoto.setOnClickListener {
            Intent(Intent.ACTION_GET_CONTENT).also {
                it.type = "image/*"
                startActivityForResult(it, 0)
            }
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        val imageHolder = findViewById<ImageView>(R.id.ivPhoto)
        if(resultCode == Activity.RESULT_OK && requestCode == 0) {
            val uri = data?.data
            imageHolder.setImageURI(uri)
        }
    }
}