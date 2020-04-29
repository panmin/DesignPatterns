package com.panmin.designpatterns

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.panmin.designpatterns.singleton.SingletonActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnSingleton.setOnClickListener {
            startActivity(Intent(this,SingletonActivity::class.java))
        }
    }
}
