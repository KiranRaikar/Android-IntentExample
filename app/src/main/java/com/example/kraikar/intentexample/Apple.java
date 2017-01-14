package com.example.kraikar.intentexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class Apple extends AppCompatActivity {

    private static final String TAG_APPLE = "apple_logs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apple);
        Log.i(TAG_APPLE, "On Create Event ...");
    }

    public void buttonAClick(View view) {
        Intent intent = new Intent(this, Bacon.class);
        EditText editTextMsg = (EditText) findViewById(R.id.editTextMsg);
        intent.putExtra("msg", editTextMsg.getText().toString());
        startActivity(intent);
        Log.i(TAG_APPLE, "Button A Clicked ...");
    }
}
