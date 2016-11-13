package com.rohan.user.myactivitylifecycle;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class SampleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);
        Log.d("TAG : ", "Activity 2");
    }

    @Override
    protected void onStop() {
        super.onStop();
        finish();
    }
        @Override
    public void onBackPressed() {
        Intent i = new Intent(this,Main2Activity.class);
        startActivity(i);

    }
}
