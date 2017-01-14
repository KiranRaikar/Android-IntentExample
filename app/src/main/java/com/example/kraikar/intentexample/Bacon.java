package com.example.kraikar.intentexample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class Bacon extends AppCompatActivity {

    private static final String TAG_BACON = "bacon_logs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bacon);

        Bundle intentAppleData = getIntent().getExtras();
        TextView textViewMsg = (TextView) findViewById(R.id.textViewMsg);
        if (intentAppleData == null) {
            return;
        }
        textViewMsg.setText(intentAppleData.getString("msg"));
        Log.i(TAG_BACON, "On Create Event ...");
    }

    public void buttonBClick(View view) {
        Intent intent = new Intent(this, Apple.class);
        startActivity(intent);
        Log.i(TAG_BACON, "Button B Clicked ...");
    }

}
