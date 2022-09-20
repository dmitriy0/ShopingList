package com.example.shopinglist.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.example.shopinglist.R

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        var a = 0
        viewModel.shopList.observe(this) {
            Toast.makeText(this@MainActivity, it.toString(), Toast.LENGTH_LONG).show()
            if (a == 0){
                viewModel.changeEnableState(it[0])
                a++
            }

        }



    }
}