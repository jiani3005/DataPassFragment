package com.mykotlinapplication.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), DataPass {
    override fun dataPassMethod(data: String) {
        var fragment2 = supportFragmentManager.findFragmentById(R.id.fragment2) as FragmentTwo
        fragment2.displayData(data)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
