package com.example.androidbdd.pageobjects

import androidx.test.espresso.Espresso.closeSoftKeyboard
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.matcher.ViewMatchers.withId
import com.example.androidbdd.R
import com.example.androidbdd.utils.screenshot

class LoginScreen {

    val emailText = R.id.username
    val passwordText = R.id.password
    val loginButton = R.id.login

    fun enterEmail(email: String) {
        onView(withId(emailText)).perform(typeText(email))
        screenshot()
    }

    fun enterPassword(password: String) {
        onView(withId(passwordText)).perform(typeText(password))
        screenshot()
    }

    fun closeKeyboard() {
        closeSoftKeyboard()
    }

    fun clickOnLoginButton() {
        onView(withId(loginButton)).perform(click())
        screenshot()
    }

    fun isSuccessfulLogin() {
        // The success toast message locates out of application cannot be checked
        // Need to change the app develop code to test this
    }
}