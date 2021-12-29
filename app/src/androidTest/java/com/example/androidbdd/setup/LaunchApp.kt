package com.example.androidbdd.setup

import android.content.Intent
import androidx.test.rule.ActivityTestRule
import com.example.androidbdd.ui.login.LoginActivity

class LaunchApp {

    fun startActivity() {
        val mActivityRule = ActivityTestRule(LoginActivity::class.java, false, false)
        mActivityRule.launchActivity(Intent())
    }
}