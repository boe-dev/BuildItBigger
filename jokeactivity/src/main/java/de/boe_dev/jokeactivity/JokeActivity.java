package de.boe_dev.jokeactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    TextView jokeText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            this.finish();
        } else {
            jokeText = (TextView) findViewById(R.id.joke_text);
            jokeText.setText(extras.getString("joke"));
        }
    }
}
