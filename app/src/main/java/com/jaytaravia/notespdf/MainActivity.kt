package com.jaytaravia.notespdf

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var showBtn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        showBtn = findViewById(R.id.showBtn)

        showBtn.setOnClickListener {
            val intent = Intent(this@MainActivity,ViewPDFActivity::class.java)
            startActivity(intent)
        }
    }
}