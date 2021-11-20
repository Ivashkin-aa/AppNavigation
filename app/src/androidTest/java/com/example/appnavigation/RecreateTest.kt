package com.example.appnavigation

import android.content.pm.ActivityInfo
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.appnavigation.navgrap.MainActivity
import com.example.appnavigation.startactivityforresult.FirstActivity
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class RecreateTest {

    //just choose class in scnerio options
    @get:Rule
    val activity = ActivityScenarioRule(MainActivity::class.java)

    private fun recreateFragment(from: Int) {
        onView(withId(from))
            .check(matches(isDisplayed()))
        activity.scenario.onActivity { activity ->
            activity.requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
        }
        //activity.scenario.recreate()
        onView(withId(from))
            .check(matches(isDisplayed()))
    }

    @Test
    fun recreatingTest() {
        recreateFragment(R.id.first)
        onView(withId(R.id.bnToSecond)).perform(ViewActions.click())
        recreateFragment(R.id.second)
        onView(withId(R.id.bnToThird)).perform(ViewActions.click())
        recreateFragment(R.id.third)
    }
}