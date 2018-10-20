package com.example.subramanyam.googlejokes;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.assertNotEquals;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

    @Rule
    public ActivityTestRule<MainActivity> activityActivityTestRule=new ActivityTestRule<>(MainActivity.class);


    @Test
    public void shouldNotBeNull() {
        // Context of the app under test.



        //then performs a button click
        onView(withId(R.id.jokebutton)).perform(click());
        //check for errors
        assertNotEquals("Connection refused",JokeFetching.mJoke);
        assertNotEquals("Connection timeout", JokeFetching.mJoke);
        //check if it is not null
        assertNotNull(JokeFetching.mJoke);

    }
}
