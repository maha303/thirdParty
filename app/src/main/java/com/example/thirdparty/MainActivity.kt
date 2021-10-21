package com.example.thirdparty

import `is`.arontibo.library.ElasticDownloadView
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    private lateinit var e:ElasticDownloadView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        e=findViewById(R.id.ee)
        e.startIntro()
        e.setProgress(25F)
        e.success()
        e.fail()

    }
}