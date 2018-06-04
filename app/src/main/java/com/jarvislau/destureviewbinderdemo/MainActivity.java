package com.jarvislau.destureviewbinderdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.jarvislau.destureviewbinder.GestureViewBinder;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView targetView = findViewById(R.id.targetView);
        LinearLayout groupView = findViewById(R.id.groupView);
        targetView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "click", Toast.LENGTH_SHORT).show();
            }
        });//
        GestureViewBinder.bind(this, groupView, targetView).setFullGroup(true);
    }

}