package edu.temple.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    // Declare view properties
    lateinit var displayTextView: TextView
    lateinit var nameEditText: EditText
    lateinit var clickMeButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize views
        displayTextView = findViewById(R.id.displayTextView)
        nameEditText = findViewById(R.id.nameEditText)
        clickMeButton = findViewById(R.id.clickMeButton)

        // Set click listener for the button
        clickMeButton.setOnClickListener {
            val name = nameEditText.text.toString().trim()

            if (name.isNotEmpty()) {
                // Only display greeting if name is entered
                displayTextView.text = "Hello, $name"
            } else {
                // Do nothing (no "Hello," displayed)
                displayTextView.text = ""
            }
        }
    }
}
