package com.geektech.test12

import android.provider.ContactsContract.CommonDataKinds.Email
import androidx.core.util.PatternsCompat
import org.junit.After
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before


class MathTest {

    var math: Math? = null

    @Before
    fun install() {
        math = Math()
    }

    @Test
    fun simpleAddCase() {
        assertEquals("4", math?.plus("2", "2"))
    }

    @Test
    fun checkEmpty() {
        assertEquals("Одно из полей является пустым", math?.plus("", ""))
    }

    @Test
    fun symbol(){
        assertEquals("нельзя сложить буквы",math?.plus("d","e"))
    }

    @Test
   fun checkEmail(){
       assertEquals(true,math?.checkEmail("sabyr@mail.ru"))
   }

    @Test
    fun checkNumberByRightLength(){
        assertEquals(true,math?.numberCheck("555555555"))
    }

    @Test
    fun checkNumberByWrongLength(){
        assertEquals(false,math?.numberCheck("dgfghgjhkjgkgk"))
    }

    @Test
    fun simpleDoubleAdd(){
        assertEquals("4.0",math?.plus("2.0","2.0"))
    }
    @After
    fun after() {
        math = null
    }
}