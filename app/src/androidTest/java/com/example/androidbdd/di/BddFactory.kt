package com.example.androidbdd.di

import com.example.androidbdd.pageobjects.LoginScreen
import io.cucumber.core.backend.ObjectFactory
import io.cucumber.picocontainer.PicoFactory


class BddFactory : ObjectFactory {

    private val delegate = PicoFactory()

    init {
        addClass(LoginScreen::class.java)
    }

    override fun addClass(glueClass: Class<*>?): Boolean {
        return delegate.addClass(glueClass)
    }

    override fun <T : Any?> getInstance(glueClass: Class<T>?): T {
        return delegate.getInstance(glueClass)
    }

    override fun start() {
        delegate.start()
    }

    override fun stop() {
        delegate.stop()
    }
}