package com.udacity.gradle.builditbigger;

public class AsyncTaskHelper {

    private static MainActivity sMainActivity;

    public static void setActivity(MainActivity mainActivity) {
        sMainActivity = mainActivity;
    }

    public static void startJokeIntent(String result) {
        if (sMainActivity != null) {
            sMainActivity.startJokeIntent(result);
        }
    }

}