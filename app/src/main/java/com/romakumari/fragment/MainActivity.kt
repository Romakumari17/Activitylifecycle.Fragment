package com.romakumari.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var  tvhello:TextView
    lateinit var activityinterface: ActivityInterface
    lateinit var btnbutton: Button
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnbutton=findViewById(R.id.btnbutton)
        tvhello=findViewById(R.id.tvhello)
        btnbutton.setOnClickListener {
            activityinterface.changeFragmentText()
        }
    }
    fun changeText(){

        tvhello.setText("change to hello")


    }
}