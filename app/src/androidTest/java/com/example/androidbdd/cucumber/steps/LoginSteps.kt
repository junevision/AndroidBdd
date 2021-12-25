package com.example.androidbdd.cucumber.steps

import android.content.Intent
import androidx.test.rule.ActivityTestRule
import com.example.androidbdd.pageobjects.LoginScreen
import com.example.androidbdd.ui.login.LoginActivity
import com.example.androidbdd.utils.ActivityFinisher
import io.cucumber.java.After
import io.cucumber.java.Before
import io.cucumber.java.en.And
import io.cucumber.java.en.Given
import io.cucumber.java.en.Then
import io.cucumber.java.en.When
import io.qameta.allure.android.rules.ScreenshotRule
import io.qameta.allure.kotlin.Allure
import org.junit.Rule
import org.picocontainer.annotations.Inject


class LoginSteps {

    @Inject
    lateinit var loginObject: LoginScreen

    @get:Rule
    val logcatRule = ScreenshotRule(mode = ScreenshotRule.Mode.END, screenshotName = "ss_end")

    val mActivityRule = ActivityTestRule(LoginActivity::class.java, false, false)


    @Given("user starts the application")
    fun userStartsTheApplication() {
        mActivityRule.launchActivity(Intent())
        Allure.step("user starts the application")
    }

    @Before
    fun setup() {
        // placeholder, precondition
    }

    @After
    fun teardown() {
        ActivityFinisher.finishOpenActivities()
    }

    @When("user enters valid email (\\S+)$")
    fun userEntersValidEmail(email: String) {
        loginObject.enterEmail(email)
        Allure.step("user enters valid email $email")
    }

    @And("user enters valid password (\\S+)\$")
    fun userEntersValidPassword(password: String) {
        loginObject.enterPassword(password)
        Allure.step("user enters valid password $password")
    }

    @And("user closes the keyboard of device")
    fun userClosesTheKeyboardOfDevice() {
        loginObject.closeKeyboard()
        Allure.step("user closes the keyboard of device")
    }

    @And("user clicks on login button")
    fun userClicksOnLoginButton() {
        loginObject.clickOnLoginButton()
        Allure.step("user clicks on login button")
    }

    @Then("user could see successful login message")
    fun userCouldSeeSuccessfulLoginMessage() {
        loginObject.isSuccessfulLogin()
        Allure.step("user could see successful login message")
    }
}