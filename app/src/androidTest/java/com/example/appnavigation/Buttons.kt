package com.example.appnavigation

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.contrib.DrawerActions
import androidx.test.espresso.matcher.ViewMatchers

fun checkBnTo(number: Int) {
    when (number) {
        1 -> Espresso.onView(ViewMatchers.withId(R.id.bnToFirst))
        2 -> Espresso.onView(ViewMatchers.withId(R.id.bnToSecond))
        3 -> Espresso.onView(ViewMatchers.withId(R.id.bnToThird))
        else -> throw Exception("Incorrect input")
    }
        .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        .perform(ViewActions.click())
    when (number) {
        1 -> Espresso.onView(ViewMatchers.withId(R.id.first))
        2 -> Espresso.onView(ViewMatchers.withId(R.id.second))
        3 -> Espresso.onView(ViewMatchers.withId(R.id.third))
        else -> throw Exception("Incorrect input")
    }
        .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
}

fun aboutFrom(fragment: Int) {
    when (fragment) {
        1 -> Espresso.onView(ViewMatchers.withId(R.id.first))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        2 -> Espresso.onView(ViewMatchers.withId(R.id.second))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        3 -> Espresso.onView(ViewMatchers.withId(R.id.third))
            .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
        else -> throw Exception("Incorrect input")
    }
    openAbout(fragment)
    Espresso.pressBack()
    when (fragment) {
        1 -> Espresso.onView(ViewMatchers.withId(R.id.first))
        2 -> Espresso.onView(ViewMatchers.withId(R.id.second))
        3 -> Espresso.onView(ViewMatchers.withId(R.id.third))
        else -> throw Exception("Incorrect input")
    }
        .perform(DrawerActions.close())
        .check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
}
