package com.jarvislau.destureviewbinderdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.jarvislau.destureviewbinder.GestureViewBinder;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tvTarget = findViewById(R.id.tvTarget);
        RelativeLayout rlGroup = findViewById(R.id.rlGroup);
        tvTarget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "click", Toast.LENGTH_SHORT).show();
            }
        });
        GestureViewBinder.bind(this, rlGroup, tvTarget).setFullGroup(true);
    }

}