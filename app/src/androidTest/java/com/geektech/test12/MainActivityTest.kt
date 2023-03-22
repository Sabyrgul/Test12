package com.geektech.test12

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Rule

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @Rule
    @JvmField
    val rule:ActivityScenarioRule<*> =ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun simpleAdd(){
        Espresso.onView(withId(R.id.et_one)).perform(ViewActions.typeText("5"))
        Espresso.onView(withId(R.id.et_two)).perform(ViewActions.typeText("5"))
        Espresso.onView(withId(R.id.btn_plus)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.tv_result)).check(
            ViewAssertions.matches(ViewMatchers.withText("10")))

    }

    @Test
    fun emailCheckFalse(){
        Espresso.onView(withId(R.id.et_email)).perform(ViewActions.typeText("test"))
        Espresso.onView(withId(R.id.btn_check_email)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.tv_result)).check(
            ViewAssertions.matches(ViewMatchers.withText("false")))
    }

    @Test
    fun emailCheckTrue(){
        Espresso.onView(withId(R.id.et_email)).perform(ViewActions.typeText("test@mail.ru"))
        Espresso.onView(withId(R.id.btn_check_email)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.tv_result)).check(
            ViewAssertions.matches(ViewMatchers.withText("true")))
    }

    @Test
    fun numberCheck(){
        Espresso.onView(withId(R.id.et_number)).perform(ViewActions.typeText("test"))
        Espresso.onView(withId(R.id.btn_check_number)).perform(ViewActions.click())
        Espresso.onView(withId(R.id.tv_result)).check(
            ViewAssertions.matches(ViewMatchers.withText("true")))
    }
}