package com.example.ashish.working_time;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

/**
 * Created by Ashish on 30/05/16.
 *
 */
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule public ActivityTestRule<MainActivity> main=new ActivityTestRule<MainActivity>(MainActivity.class);

    @Test
    public void checkButtonFrom(){

        onView(withId(R.id.button))
                .perform(click());


    }
    @Test
    public void checkButtonTo(){

        onView(withId(R.id.button2))
                .perform(click());


    }


    @Test
    public void checkTextView(){

        onView(withId(R.id.textView))
                .check(matches(isDisplayed()));

        onView(withId(R.id.textView2))
                .check(matches(isDisplayed()));

        onView(withId(R.id.textView3))
                .check(matches(isDisplayed()));

        onView(withId(R.id.textView4))
                .check(matches(isDisplayed()));
    }

    @Test
    public void checkTextViewFromTo() {

        onView(withId(R.id.textView5))
                .check(matches(isDisplayed()));

        onView(withId(R.id.textView6))
                .check(matches(isDisplayed()));
    }
}
