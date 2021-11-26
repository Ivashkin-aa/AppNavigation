package com.example.appnavigation

import androidx.test.core.app.launchActivity
import com.example.appnavigation.navgrap.MainActivity
import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.appnavigation.startactivityforresult.FirstActivity
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class NavigationTest {

    //just choose class in scnerio options
    @get:Rule
    val activity = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun testButtons() {
        Espresso.onView(withId(R.id.first))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        checkBnTo(2)
        checkBnTo(1)
        Espresso.onView(withId(R.id.bnToSecond))
            .perform(ViewActions.click())
        checkBnTo(3)
        checkBnTo(2)
        Espresso.onView(withId(R.id.bnToThird))
            .perform(ViewActions.click())
        checkBnTo(1)
    }

    @Test
    fun testAbout() {
        Espresso.onView(withId(R.id.first))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        aboutFrom(1)
        Espresso.onView(withId(R.id.bnToSecond))
            .perform(ViewActions.click())
        aboutFrom(2)
        Espresso.onView(withId(R.id.bnToThird))
            .perform(ViewActions.click())
        aboutFrom(3)
    }

    @Test
    fun testAbout2() {
        launchActivity<MainActivity>()
        //launchActivity<FirstActivity>()
        openAbout(1)
        Espresso.onView(withId(R.id.about_actv))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }
}