package com.example.androidbdd.utils

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

fun currentDateTime(): String? {
    val currentTime = LocalDateTime.now()

    val formatterTime = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS")
    val formattedTime = currentTime.format(formatterTime)

    return formattedTime
}