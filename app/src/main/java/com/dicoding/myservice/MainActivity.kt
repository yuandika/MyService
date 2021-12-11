package com.dicoding.myservice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStartService: Button = findViewById(R.id.btn_start_service)
        btnStartService.setOnClickListener{
            val mStartServiceIntent = Intent(this, MyService::class.java)
            startService(mStartServiceIntent)
        }

        val btnStartJobIntentService: Button = findViewById(R.id.btn_start_job_intent_service)
        btnStartJobIntentService.setOnClickListener {
            val mStartIntentService = Intent(this, MyJobIntentService::class.java)
            mStartIntentService.putExtra(MyJobIntentService.EXTRA_DURATION, 5000L)
            MyJobIntentService.enqueueWork(this, mStartIntentService)
        }

        val btnStartBoundService: Button = findViewById(R.id.btn_start_bound_service)
        btnStartBoundService.setOnClickListener {

        }

        val btnStopBoundService: Button = findViewById(R.id.btn_stop_bound_service)
        btnStopBoundService.setOnClickListener {

        }
    }
}