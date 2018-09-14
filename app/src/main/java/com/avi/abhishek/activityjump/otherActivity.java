package com.avi.abhishek.activityjump;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class otherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.other_activity);

        if (getIntent() != null) {
            ((TextView) findViewById(R.id.textView)).setText(getIntent().getStringExtra("hello"));
        }
    }
    }
