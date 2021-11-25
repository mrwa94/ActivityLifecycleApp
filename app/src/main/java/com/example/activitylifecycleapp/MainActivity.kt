package com.example.activitylifecycleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        print("onCreate")
    }

    override fun onStart() {
        super.onStart()
       print("onStart")
            }

    override fun onStop() {
        super.onStop()
        print("onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        print("onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        print("onRestart")
    }

    override fun onResume() {
        super.onResume()
        print("onResume")

    }

    override fun onPause() {
        super.onPause()
        print("onPause")
    }
}