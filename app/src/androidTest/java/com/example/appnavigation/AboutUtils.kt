package com.example.appnavigation

import android.view.Gravity
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.DrawerActions
import androidx.test.espresso.contrib.DrawerMatchers.isClosed
import androidx.test.espresso.contrib.NavigationViewActions
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId


private fun openAboutViaDrawer(fragment: Int) {
    // Open Drawer to click on navigation.
    when(fragment) {
        1 -> onView(withId(R.id.first))
        2 -> onView(withId(R.id.second))
        3 -> onView(withId(R.id.third))
        else -> throw Exception ("Incorrect input")
    }
        .check(matches(isClosed(Gravity.LEFT))) // Left Drawer should be closed.
        .perform(DrawerActions.open())

    onView(withId(R.id.nav_view))
        .perform(NavigationViewActions.navigateTo(R.id.activityAbout))



  /*  onView(withId(R.id.nav_view))
        .check(matches(isDisplayed()))
    onView(withId(R.id.button_about))
        .check(matches(isDisplayed()))
        .perform(click())
    onView(withId(R.id.about_actv))
        .check(matches(isDisplayed()))*/
}

fun openAbout(fragment: Int) = openAboutViaDrawer(fragment)