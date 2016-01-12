package com.udacity.gradle.builditbigger;

import java.util.Random;

/**
 * Created by dev on 12.01.16.
 */
public class MyJokes {

    private static final String[] joke = {"test1", "test2", "test3"};

    private int randomJoke() {
        Random rn = new Random();
        return rn.nextInt(joke.length);
    }

    public String getRandomJoke() {
        return joke[randomJoke()];
    }

}
