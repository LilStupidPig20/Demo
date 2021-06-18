package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PopupWindowFromMainMenu extends AppCompatActivity {
    private Button buttonTheory;
    private Button buttonTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup_window_from_main_menu);

//        buttonTheory = (Button) findViewById(R.id.theory_popup);
//        buttonTheory.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                openActivityCoffeeMachine();
//            }
//        });
//
//        buttonTest = (Button) findViewById(R.id.test_popup);
//        buttonTest.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                openActivityCoffeeMachine();
//            }
//        });
    }

//    public void openActivityCoffeeMachine(){
//        Intent intent = new Intent(this, MainActivityCoffeeMachine.class);
//        startActivity(intent);
//    }
//
//    public void openActivityMachineTest(){
//        Intent intent = new Intent(this, Activity_Machine_Test.class);
//        startActivity(intent);
//    }
}