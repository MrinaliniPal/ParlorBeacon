package com.springboardsolution.parlorbeacon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Thread startTimer = new Thread(){
            public void run(){
                try{
                    sleep(5000);
                    Intent g = new Intent(MainActivity.this, Select.class);
                    startActivity(g);
                    finish();
                }catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        };
        startTimer.start();
    }
}
