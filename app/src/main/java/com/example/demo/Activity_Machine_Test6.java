package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class Activity_Machine_Test6 extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton radioButton;
    TextView textView;
    private Button buttonNext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_machine_test6);
        radioGroup = findViewById(R.id.radioGroup);
        textView = findViewById(R.id.textView3);
        Button buttonApply = findViewById(R.id.button);
        buttonApply.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                int radioId = radioGroup.getCheckedRadioButtonId();
                radioButton = findViewById(radioId);
                if(radioId == R.id.radioButton1) {
                    textView.setText("Вы выбрали верный ответ");
                }
                else{
                    textView.setText("Вы выбрали верный ответ неверный ответ. Правильный ответ 100°C");
                }
            }

        });
        buttonNext = findViewById(R.id.buttonNext);
        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNextQ();
            }
        });

    }
    public void openNextQ(){
        int next = (int) (Math.random() * 6);
        if(next == 0) {
            Intent intent = new Intent(this, Activity_Machine_Test2.class);
            startActivity(intent);
        }
        if(next == 1) {
            Intent intent = new Intent(this, Activity_Machine_Test3.class);
            startActivity(intent);
        }
        if(next == 2) {
            Intent intent = new Intent(this, Activity_Machine_Test4.class);
            startActivity(intent);
        }
        if(next == 3) {
            Intent intent = new Intent(this, Activity_Machine_Test5.class);
            startActivity(intent);
        }
        if(next == 4) {
            Intent intent = new Intent(this, Activity_Machine_Test6.class);
            startActivity(intent);
        }
        if(next == 5) {
            Intent intent = new Intent(this, Activity_Machine_Test.class);
            startActivity(intent);
        }

    }
    public  void  checkButton(View v){
        int radioId = radioGroup.getCheckedRadioButtonId();
        radioButton = findViewById(radioId);
        //Toast.makeText(this, )
    }
}