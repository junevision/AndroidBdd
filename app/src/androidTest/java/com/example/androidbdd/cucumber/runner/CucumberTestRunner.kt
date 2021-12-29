package com.example.androidbdd.cucumber.runner

import android.os.Bundle
import com.example.androidbdd.BuildConfig
import io.cucumber.android.runner.CucumberAndroidJUnitRunner

class CucumberTestRunner : CucumberAndroidJUnitRunner() {

    val CUCUMBER_TAGS_KEY = "tags"
    val CUCUMBER_SCENARIO_KEY = "name"

    @Override
    override fun onCreate(bundle: Bundle?) {

        val tags: String = BuildConfig.TEST_TAGS
        val scenario: String = BuildConfig.TEST_SCENARIO

        super.onCreate(bundle)
    }
}