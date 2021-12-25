package com.example.androidbdd.utils

import io.qameta.allure.android.allureScreenshot

fun screenshot() {
    allureScreenshot(name = "screenshot_${currentDateTime()}", quality = 50, scale = 1.0f)
}