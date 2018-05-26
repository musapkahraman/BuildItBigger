package com.example.jokedisplayer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class JokeDisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_display);

        String joke = getIntent().getStringExtra("joke");
        TextView textView = findViewById(R.id.tv_joke);
        textView.setText(joke);
    }
}
