package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PopupWindowFromCoffee extends AppCompatActivity {
    private Button espressoTheory;
    private Button espressoTest;
    private Button espressoPractice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup_window_from_coffee);

//        espressoTheory = (Button) findViewById(R.id.theory_popup_espresso);
//        espressoTheory.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                openActivityTheoryEspresso();
//            }
//        });
//
//        espressoTest = (Button) findViewById(R.id.test_popup_espresso);
//        espressoTest.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                openActivityTestEspresso();
//            }
//        });
//
//        espressoPractice = (Button) findViewById(R.id.practice_popup_espresso);
//        espressoPractice.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                openActivityPracticeEspresso();
//            }
//        });
    }

//    public void openActivityTheoryEspresso(){
//        Intent intent = new Intent(this, TheoryEspresso.class);
//        startActivity(intent);
//    }
//
//    public void openActivityTestEspresso(){
//        Intent intent = new Intent(this, TestEspresso.class);
//        startActivity(intent);
//    }
//
//    public void openActivityPracticeEspresso(){
//        Intent intent = new Intent(this, PracticeEspresso.class);
//        startActivity(intent);
//    }
}