package com.example.alertdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Button1 - Add contact dialog box.
        // Single choice dialog box with yes or no.
        val addContactDialog = AlertDialog.Builder(this)
            .setTitle("Add contact")
            .setMessage("Do you want to add Mr.Poop to your contacts list?")
            .setIcon(R.drawable.ic_add_contact)
            // CTRL+SPACE to see the documents.
            // .setPositiveButton("Yes") { dialog, i ->
            .setPositiveButton("Yes") { _, _ ->
                Toast.makeText(this, "You added Mr.Poop to your contact list", Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("No") { _, _ ->
                Toast.makeText(this, "You didn't added Mr.Poop to your contact list", Toast.LENGTH_SHORT).show()
            }.create()

        btnDialog1.setOnClickListener {
            addContactDialog.show()
        }

        // Button2 - Choose one option.
        // Single choice dialog box with several options to choose from but you can only choose one of them.
        val options = arrayOf("First Item", "Second Item", "Third Item") // array of strings that define different options.
        val singleChoiceDialog = AlertDialog.Builder(this)
            .setTitle("Choose one of these options")
            .setSingleChoiceItems(options, 0) { DialogInterface, i ->
                // 'i' here refers to lambda function, which is the index of the item that was currently checked.
                Toast.makeText(this, "You clicked on ${options[i]}", Toast.LENGTH_SHORT).show()
            }
            .setPositiveButton("Accept") { _, _ ->
                Toast.makeText(this, "You accepted the SingleChoiceDialog", Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("Decline") { _, _ ->
                Toast.makeText(this, "You declined the SingleChoiceDialog", Toast.LENGTH_SHORT).show()
            }.create()

        btnDialog2.setOnClickListener {
            singleChoiceDialog.show()
        }

        // Button3 - Choose one option.
        // Multi choice dialog
        val multiChoiceDialog = AlertDialog.Builder(this)
            .setTitle("Choose one of these options")
            // .setMultiChoiceItems(options, booleanArrayOf(false, false, false)) {DialogInterface, i, b ->}

            // DialogInterface can be eliminated because we have a positive and negative button which dismiss that dialog.
            // Variable i which refers to the current index of the item that is either checked or unchecked.
            // Variable b which is a boolean that says whether that item was checked or unchecked.
            .setMultiChoiceItems(options, booleanArrayOf(false, false, false)) {_, i, isChecked ->
                if (isChecked) {  // (false, false, false) to leave all 3 options unchecked here.
                    Toast.makeText(this, "You checked ${options[i]}", Toast.LENGTH_SHORT).show()
                } else  {
                    Toast.makeText(this, "You unchecked ${options[i]}", Toast.LENGTH_SHORT).show()
                }
            }
            .setPositiveButton("Accept") { _, _ ->
                Toast.makeText(this, "You accepted the MultiChoiceDialog", Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("Decline") { _, _ ->
                Toast.makeText(this, "You declined the MultiChoiceDialog", Toast.LENGTH_SHORT).show()
            }.create()

        btnDialog3.setOnClickListener {
            multiChoiceDialog.show()
        }
    }
}