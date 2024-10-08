package com.example.kotlinset

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val tuba = "tuba"
        println(tuba)

        println(MyClass2().mynmb)

    }
}
open class Myclass {
    var mynmb = 1234555
}

class MyClass2 : Myclass(){

}
