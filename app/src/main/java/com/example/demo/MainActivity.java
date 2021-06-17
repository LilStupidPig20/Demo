package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {
    private  Button buttonCoffee;
    private  Button buttonCoffeeGrinder;
    private  Button buttonCoffeeMachine;
    private  Button buttonMilk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Resources res = getResources();
        Drawable shape = ResourcesCompat.getDrawable(res, R.drawable.button_1_main_list, getTheme());

        TextView tv1 = (TextView)findViewById(R.id.button1_main_list);
        tv1.setBackground(shape);

        setContentView(R.layout.activity_main);
        buttonCoffee = (Button) findViewById(R.id.button4_main_list);
        buttonCoffee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityCoffee();
            }
        });
        buttonCoffeeGrinder = (Button) findViewById(R.id.button2_main_list);
        buttonCoffeeGrinder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityCoffeeGrinder();
            }
        });
        /*buttonCoffeeMachine = (Button) findViewById(R.id.button1_main_list);
        buttonCoffeeMachine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityCoffeeMachine();
            }
        });*/
        buttonMilk = (Button) findViewById(R.id.button3_main_list);
        buttonMilk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityMilk();
            }
        });

    }
    public void openActivityCoffee(){
        Intent intent = new Intent(this, MainCoffeeActivity.class);
        startActivity(intent);
    }
    public void openActivityCoffeeGrinder(){
        Intent intent = new Intent(this, MainActivityCoffeeGrinder.class);
        startActivity(intent);
    }
    public void openActivityCoffeeMachine(){
        Intent intent = new Intent(this, MainActivityCoffeeMachine.class);
        startActivity(intent);
    }
    public void openActivityMilk(){
        Intent intent = new Intent(this, MainActivityMilk.class);
        startActivity(intent);
    }

    public void openActivityMachineTest(){
        Intent intent = new Intent(this, Activity_Machine_Test.class);
        startActivity(intent);
    }

    public void showPopup1(View v){
        PopupMenu popup = new PopupMenu(this, v);
        popup.setOnMenuItemClickListener(this);
        popup.inflate(R.menu.popup_menu_button1_form_main);
        popup.show();
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()){
            case R.id.item1:
                openActivityCoffeeMachine();
                return true;
            case R.id.item2:
                openActivityMachineTest();
                return true;
            case R.id.item3:
                //тут переход на сцену с практикой машины
                return true;
            default:
                return false;
        }
    }
    public  boolean onCrateOptionsMenuCoffeeMachine(Menu menu){
        getMenuInflater().inflate(R.menu.popup_menu_button1_form_main, menu);
        return true;
    }
}
