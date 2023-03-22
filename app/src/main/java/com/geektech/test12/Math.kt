package com.geektech.test12

import android.annotation.SuppressLint
import androidx.core.util.PatternsCompat

class Math {

    fun plus(a: String, b:String): String{
        var result=" "
        if(a.isEmpty()||b.isEmpty())
        {
            result="Одно из полей является пустым"
        }else if(a.toIntOrString()&&b.toIntOrString()){
            val numberA=a.toInt()
            val numberB=b.toInt()
            result=(numberA+numberB).toString()
        }
        else if(a.toDoubleOrString()&&b.toDoubleOrString()){
            result=(a.toDouble()+b.toDouble()).toString()}
        else{
            result="нельзя сложить буквы"
        }
        return result
    }

    fun checkEmail(email: String):Boolean{
        return PatternsCompat.EMAIL_ADDRESS.matcher(email).matches()
    }

    fun numberCheck(number:String):Boolean{
        return number.length==9&&number.toIntOrString()
    }

    fun String.toDoubleOrString():Boolean{
        val d=this.toDoubleOrNull()
        return when(d){
            null -> false
            else -> true
        }
    }
    @SuppressLint("SuspiciousIndentation")
    fun String.toIntOrString():Boolean{
    val v=this.toIntOrNull()
        return when(v){
            null -> false
            else -> true
        }
    }
}