package com.example.jokedisplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class JokeDisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_display);

        String joke = "";
        Intent intent = getIntent();
        if (intent.hasExtra(JokeUtils.KEY_JOKE)) {
            joke = getIntent().getStringExtra(JokeUtils.KEY_JOKE);
        }
        TextView textView = findViewById(R.id.tv_joke);
        textView.setText(joke);
    }
}