package com.example.lesson3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    val TAG="MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.d(TAG,"onCreate .")
        setContentView(R.layout.activity_main)

        // 增加按钮事件
        val btn=findViewById<Button>(R.id.button)

        btn.setOnClickListener{
            Log.i(TAG,"on Click Button .")
            val intent = Intent(this,SecondeActivity::class.java)

            // 传递数据
            intent.putExtra("name","Jack")
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG,"onStart .")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG,"onResum .")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG,"onPause .")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG,"onStop .")
    }

}