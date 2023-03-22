package com.geektech.test12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.geektech.test12.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var binding:ActivityMainBinding?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding!!.root)
        simpleAdd()
        emailCheck()
        numberCheck()
    }

    fun simpleAdd()=with(binding!!){
        btnPlus.setOnClickListener {
            val result=(etOne.text.toString().toInt()+etTwo.text.toString().toInt()).toString()
            tvResult.text=result
        }

    }

    fun emailCheck()=with(binding!!){
        btnCheckEmail.setOnClickListener {
            val result=Math().checkEmail(etEmail.text.toString())
            tvResult.text=result.toString()
        }
    }

    fun numberCheck()=with(binding!!){
        btnCheckNumber.setOnClickListener {
            val result=Math().numberCheck(etNumber.text.toString())
            tvResult.text=result.toString()
        }
    }
}