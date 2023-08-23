package com.example.miprimerproyecto

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Rule
import org.junit.Test

class MainActivityInstrumentedTest {
    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun testUIComponentsVisibleAndInteractable() {

        onView(withId(R.id.editText1)).check(matches(isDisplayed()))
        onView(withId(R.id.editText2)).check(matches(isDisplayed()))

        onView(withId(R.id.compareButton)).check(matches(isDisplayed())).perform(click())

        onView(withId(R.id.resultTextView)).check(matches(isDisplayed()))
    }
}
