package com.apptualizer.pinview.demo

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.apptualizer.pinview.OnPinCompletionListener
import com.apptualizer.pinview.PinView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val pinView: PinView = findViewById(R.id.pin_view_line)
        pinView.setPinCompletionListener(object : OnPinCompletionListener {
            override fun onCodeCompletion(otp: String) {
                Toast.makeText(this@MainActivity, otp, Toast.LENGTH_LONG).show()
            }
        })
    }
}