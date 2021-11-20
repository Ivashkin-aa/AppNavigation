package com.example.appnavigation

import androidx.lifecycle.Lifecycle
import androidx.test.espresso.Espresso
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.appnavigation.intentflags.FirstActivity
import com.example.appnavigation.navgrap.MainActivity
import org.junit.Assert
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class BackStackTest {

    //just choose class in scnerio options
    @get:Rule
    val activity = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun firstTest() {
        Espresso.onView(withId(R.id.first))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        checkBnTo(2)
        checkBnTo(1)
        Espresso.pressBackUnconditionally()
        Assert.assertTrue(activity.scenario.state == Lifecycle.State.DESTROYED)
    }

    @Test
    fun secondTest() {
        Espresso.onView(withId(R.id.first))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        checkBnTo(2)
        checkBnTo(3)
        checkBnTo(2)
        Espresso.pressBack()
        Espresso.onView(withId(R.id.first))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        checkBnTo(2)
        checkBnTo(3)
        checkBnTo(1)
        Espresso.pressBackUnconditionally()
        Assert.assertTrue(activity.scenario.state == Lifecycle.State.DESTROYED)
    }

    @Test
    fun thirdTest() {
        Espresso.onView(withId(R.id.first))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        aboutFromFirst()
        checkBnTo(2)
        aboutFromSecond()
        checkBnTo(3)
        aboutFromThird()
    }

    @Test
    fun fourthTest() {
        Espresso.onView(withId(R.id.first))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        checkBnTo(2)
        aboutFromSecond()
        checkBnTo(3)
        checkBnTo(2)
        Espresso.pressBack()
        Espresso.onView(withId(R.id.first))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        checkBnTo(2)
        checkBnTo(3)
        aboutFromThird()
        repeat(2) {
            Espresso.pressBack()
        }
        Espresso.onView(withId(R.id.first))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }
}