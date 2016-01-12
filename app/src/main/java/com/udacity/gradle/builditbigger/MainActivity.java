package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Pair;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import de.boe_dev.Joke;
import de.boe_dev.jokeactivity.JokeActivity;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void tellJoke(View view){
        Joke myJoke = new Joke();
        // Toast.makeText(this, myJoke.getJoke(), Toast.LENGTH_SHORT).show();
//        Intent jokeIntent = new Intent(this, JokeActivity.class);
//        jokeIntent.putExtra("joke", myJoke.getJoke());
//        startActivity(jokeIntent);

        MyJokes joke = new MyJokes();
        new EndpointsAsyncTask().execute(new Pair<Context, String>(this, joke.getRandomJoke()));
    }


}
