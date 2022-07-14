package com.example.debugging

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "this is where the app crashed before")
        val helloTextView: TextView = findViewById(R.id.hello_world)
        Log.d(TAG, "this should be logged if the bug is fixed")
        helloTextView.text = "Hello, debugging!"
        setContentView(R.layout.activity_main)

        logging()
        division()
        first()
    }

    fun logging() {
        Log.v(TAG, "Hello, world!")
    }

    fun division() {
        val numerator = 60
        var denominator = 4
        repeat(5) {
            Thread.sleep(1)
            Log.d(TAG, "$denominator")
            Log.v(TAG, "${numerator / denominator}")
            denominator--
        }
    }

    fun first() {
        second()
        Log.v(TAG, "1")
    }

    fun second() {
        third()
        Log.v(TAG, "2")
        fourth()
    }

    fun third() {
        Log.v(TAG, "3")
    }

    fun fourth() {
        Log.v(TAG, "4")
    }

}