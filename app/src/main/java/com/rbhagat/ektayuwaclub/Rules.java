package com.rbhagat.ektayuwaclub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Rules extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rules);

        TextView rulesTextView = findViewById(R.id.rulesText);

        // Set the text of the TextView from the string resource
        rulesTextView.setText(getString(R.string.rules));
    }
}