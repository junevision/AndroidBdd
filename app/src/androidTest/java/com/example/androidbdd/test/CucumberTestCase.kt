package com.example.androidbdd.test

import io.cucumber.junit.CucumberOptions

@CucumberOptions(
    features = ["features"],
    glue = ["com.example.androidbdd.cucumber.steps"],
    tags = ["@smoke"]
)
class CucumberTestCase {
}