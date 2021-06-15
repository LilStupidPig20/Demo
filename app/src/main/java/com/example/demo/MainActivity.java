package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resources res = getResources();
        Drawable shape = ResourcesCompat.getDrawable(res, R.drawable.button_1_main_list, getTheme());

        TextView tv1 = (TextView)findViewById(R.id.button1_main_list);
        tv1.setBackground(shape);
    }
}