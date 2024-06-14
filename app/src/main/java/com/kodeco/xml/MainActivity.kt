package com.kodeco.xml

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val addContactDialog = AlertDialog.Builder(this)
            .setTitle("Add contact")
            .setMessage("Do you want to add Mt.Smith to your contact list?")
            .setIcon(R.drawable.ic_add_contact)
            .setPositiveButton("Yes") { _, _ ->
                Toast.makeText(this, "You added Mr.Smith to your contact list", Toast.LENGTH_SHORT)
                    .show()
            }
            .setNegativeButton("No") { _, _ ->
                Toast.makeText(
                    this,
                    "You didn't add Mr.Smith to your contact list",
                    Toast.LENGTH_SHORT
                ).show()
            }.create()

        val buttonDialog1 = findViewById<Button>(R.id.btnDialog1)
        buttonDialog1.setOnClickListener {
            addContactDialog.show()
        }

        val options = arrayOf("First Item", "Second Item", "Third Item")
        val singleChoiceDialog = AlertDialog.Builder(this)
            .setTitle("Choose one of these options")
            .setSingleChoiceItems(options, 0) { dialogInterface, i ->
                Toast.makeText(this, "You clicked on ${options[i]}", Toast.LENGTH_SHORT).show()
            }
            .setPositiveButton("Accept") { _, _ ->
                Toast.makeText(this, "You accepted the SingleChoiceDialog", Toast.LENGTH_SHORT)
                    .show()
            }
            .setNegativeButton("Decline") { _, _ ->
                Toast.makeText(this, "You declined the SingleChoiceDialog", Toast.LENGTH_SHORT)
                    .show()
            }.create()

        val buttonDialog2 = findViewById<Button>(R.id.btnDialog2)
        buttonDialog2.setOnClickListener {
            singleChoiceDialog.show()
        }

        val multiChoiceDialog = AlertDialog.Builder(this)
            .setTitle("Choose one of these options")
            .setMultiChoiceItems(options, booleanArrayOf(false, false, false)) { _, i, isChecked->
                if (isChecked) {
                    Toast.makeText(this, "You checked on ${options[i]}", Toast.LENGTH_SHORT).show()
                } else {
                    Toast.makeText(this, "You unchecked on ${options[i]}", Toast.LENGTH_SHORT).show()
                }

            }
            .setPositiveButton("Accept") { _, _ ->
                Toast.makeText(this, "You accepted the MultiChoiceDialog", Toast.LENGTH_SHORT)
                    .show()
            }
            .setNegativeButton("Decline") { _, _ ->
                Toast.makeText(this, "You declined the MultiChoiceDialog", Toast.LENGTH_SHORT)
                    .show()
            }.create()

        val buttonDialog3 = findViewById<Button>(R.id.btnDialog3)
        buttonDialog3.setOnClickListener {
            multiChoiceDialog.show()
        }
    }
}