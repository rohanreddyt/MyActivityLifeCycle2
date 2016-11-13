package com.rohan.user.myactivitylifecycle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.btn);
        Toast.makeText(this,"Hi this is in OnCreate", Toast.LENGTH_SHORT).show();
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent i = new Intent(MainActivity.this,SampleActivity.class);
//                startActivity(i);
                btn.setBackgroundDrawable(getResources().getDrawable(R.drawable.button_bg));
            }
        });
    }


    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"Hi this is in OnStart()", Toast.LENGTH_LONG).show();
    }


}
