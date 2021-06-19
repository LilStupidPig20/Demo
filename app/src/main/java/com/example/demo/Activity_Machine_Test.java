package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;

public class Activity_Machine_Test extends AppCompatActivity {
    RadioGroup radioGroup;
    RadioButton radioButton;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_machine_test);
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
    }
    public  void  checkButton(View v){
        int radioId = radioGroup.getCheckedRadioButtonId();
        radioButton = findViewById(radioId);
        //Toast.makeText(this, )
    }
}