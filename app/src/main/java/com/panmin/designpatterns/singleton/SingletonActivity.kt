package com.panmin.designpatterns.singleton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.panmin.designpatterns.R
import kotlinx.android.synthetic.main.activity_singleton.*

class SingletonActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_singleton)
        btn1.setOnClickListener {
            Singleton1Java.getInstance().test()
        }
        btn2.setOnClickListener {
            Singleton2Java.getInstance().test()
        }
        btn3.setOnClickListener {
            Singleton3Java.getInstance().test()
        }
        btn4.setOnClickListener {
            Singleton4Java.getInstance().test()
        }
        btn5.setOnClickListener {
            Singleton5Java.Instance.test()
        }
    }
}
