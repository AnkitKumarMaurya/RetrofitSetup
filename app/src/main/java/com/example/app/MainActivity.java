package com.example.app;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = findViewById(R.id.my_image);
        imageView.setOnTouchListener(new MultiTouchListenerNew(new TouchCallback() {
            @Override
            public void onResetList() {

            }

            @Override
            public void onUpdateList(boolean isEnable, View view, MotionEvent event) {

            }
        }));
    }
}