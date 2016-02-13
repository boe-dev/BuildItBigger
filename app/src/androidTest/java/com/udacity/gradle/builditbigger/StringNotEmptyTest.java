package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.test.AndroidTestCase;
import android.util.Log;
import android.util.Pair;

import java.util.concurrent.ExecutionException;

import de.boe_dev.Joke;

/**
 * Created by benny on 13.02.16.
 */
public class StringNotEmptyTest extends AndroidTestCase {


    public void test() {
        Joke joke = new Joke();
        String result = null;
        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask(null);
        endpointsAsyncTask.execute(new Pair<Context, String>(getContext(), joke.getRandomJoke()));

        try {
            result = endpointsAsyncTask.get();
            Log.v("StringNotEmptryTest", "Result = "  + result);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        assertNotNull(result);


    }
}
