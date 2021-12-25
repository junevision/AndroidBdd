package com.example.androidbdd.ui.login

import androidx.test.espresso.Espresso.closeSoftKeyboard
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import com.example.androidbdd.R
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class LoginActivityTest {

    @get:Rule
    val activityRule = ActivityTestRule(LoginActivity::class.java)

    @Test
    fun loginWithEmailAndPassword() {
        onView(withId(R.id.username)).perform(typeText("bdd@test.com"))
        onView(withId(R.id.password)).perform(typeText("test123"))
        closeSoftKeyboard()
        onView(withId(R.id.login)).perform(click())
    }
}