package com.example.lesson3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class SecondeActivity : AppCompatActivity() {
    val TAG="SecondActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d(TAG,"$TAG onCreate .")
        this.setContentView(R.layout.activity_seconde)

        // 接收数据
        val name=intent.getStringExtra("name")
        val txtName=findViewById<TextView>(R.id.text_name)
        txtName.text=name
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG,"$TAG onStart .")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG,"$TAG onResum .")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG,"$TAG onPause .")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG,"$TAG onStop .")
    }
}