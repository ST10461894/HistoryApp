package com.mawasa.historyapp

import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {

    private lateinit var ageEditText: EditText
    private lateinit var btnGenerate: MaterialButton
    private lateinit var btnClear: MaterialButton
    private lateinit var txtOutput: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Initialize views
        initViews()
    }

    private fun initViews() {
        ageEditText = findViewById(R.id.ageEditText)
        btnGenerate = findViewById(R.id.btn_generate)
        btnClear = findViewById(R.id.btn_clear)
        txtOutput = findViewById(R.id.txt_output)

        // Set click listeners
        btnGenerate.setOnClickListener { generateInfo() }
        btnClear.setOnClickListener { clearAge() }
    }

    private fun generateInfo() {
        val ageText = ageEditText.text.toString()
        val age = ageText.toIntOrNull()

        if (age != null && age in 20..100) {
            txtOutput.text = getPersonInfo(age) ?: "No Data Found"
        } else {
            txtOutput.text = when (age) {
                null -> "Invalid format"
                !in 20..100 -> "Age is out of range"
                else -> "Invalid format" // This case is when age is not an integer
            }
        }
    }

    private fun clearAge() {
        ageEditText.text = null
    }

    private fun getPersonInfo(age: Int): String? {
        return when (age) {
            36 -> "Bob Marley - Jamaican reggae singer, songwriter, guitarist known as “The King of Reggae Music”"
            95 -> "Stan Lee - American Comic book writer, editor, publisher & producer. He rose up the ranks from a family run business called Timely Comics which would later become Marvel Comics."
            40 -> "Paul Walker - American Hollywood actor most known from his role as Brian O’Conner from the fast and furious series"
            68 -> "Akira Toriyama - Japanese manga artist, character designer and Creator of the Dragon ball anime series"
            60 -> "Diego Maradona - Argentine professional football player and manager who is widely regarded as one of the greatest players in the history of football"
            50 -> "Michael Jackson - American singer, dancer, songwriter and philanthropist notably known as the “King of Pop”"
            97 -> "Kenneth Kaunda - Zambian politician who had served as the first president of the republic of Zambia from 1964 to 1991 being at the forefront in the struggle for Independence against British colonel rule"
            41 -> "Kobe Bryant - American professional basketball player for the Los Angeles Lakers and winner of five NBA championships, two-time NBA finals MVP and is widely regarded as being one of the greatest players in the history of Basketball."
            44 -> "Steve Irwin - Australian zookeeper, television personality, conservationist, animal wildlife educator and environmentalist most notably known as “The crocodile hunter”."
            25 -> "Tupac Shakur - American rapper and actor who is regarded by many as being one of the best rappers of all time."
            39 -> "Martin Luther King Junior - American Christian minister, political philosopher and activist who was one of the most prominent leaders of the civil rights movement from 1955 to 1968."
            81 -> "Winnie Mandela - South African politician, anti-apartheid activist, and second wife of Nelson Mandela."
            else -> null
        }
    }
}
