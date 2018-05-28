package com.udacity.gradle.builditbigger;

import android.support.test.espresso.intent.rule.IntentsTestRule;
import android.support.test.filters.LargeTest;
import android.support.test.runner.AndroidJUnit4;

import com.example.jokedisplayer.JokeDisplayActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.intent.Intents.intended;
import static android.support.test.espresso.intent.matcher.ComponentNameMatchers.hasClassName;
import static android.support.test.espresso.intent.matcher.IntentMatchers.hasComponent;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.not;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class JokeStringTest {

    @Rule
    public IntentsTestRule<MainActivity> mActivityTestRule = new IntentsTestRule<>(MainActivity.class);

    @Test
    public void clickButton_CheckForSuccessfulConnection() {
        onView(withId(R.id.button_show_joke)).perform(click());
        intended(hasComponent(hasClassName(JokeDisplayActivity.class.getName())));
        onView(withId(R.id.tv_joke)).check(matches(not(withText(containsString("failed to connect")))));
    }

    @Test
    public void clickButton_CheckJokeTextForNonEmptyString() {
        onView(withId(R.id.button_show_joke)).perform(click());
        intended(hasComponent(hasClassName(JokeDisplayActivity.class.getName())));
        onView(withId(R.id.tv_joke)).check(matches(not(withText(""))));
    }
}
