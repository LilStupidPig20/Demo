package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Layout;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.PopupWindow;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity //implements PopupMenu.OnMenuItemClickListener
{
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
        buttonCoffeeMachine = (Button) findViewById(R.id.button1_main_list);
        buttonCoffeeMachine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onButtonShowPopupWindowClick(v);
            }
        });
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
    public void openActivityMilk(){
        Intent intent = new Intent(this, MainActivityMilk.class);
        startActivity(intent);
    }

    /*public void showPopup1(View v){
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
    }*/



    public void onButtonShowPopupWindowClick(View view) {

        // inflate the layout of the popup window
        LayoutInflater inflater = (LayoutInflater)
                getSystemService(LAYOUT_INFLATER_SERVICE);
        View popupView = inflater.inflate(R.layout.activity_popup_window_from_main_menu, null);

        // create the popup window
        int width = LinearLayout.LayoutParams.WRAP_CONTENT;
        int height = LinearLayout.LayoutParams.WRAP_CONTENT;
        boolean focusable = true; // lets taps outside the popup also dismiss it
        final PopupWindow popupWindow = new PopupWindow(popupView, width, height, focusable);

        // show the popup window
        // which view you pass in doesn't matter, it is only used for the window tolken
        //popupWindow.showAtLocation(view, Gravity.CENTER, 0, 0); это было изначально
        popupWindow.showAtLocation(view, Gravity.BOTTOM|Gravity.LEFT, 120, 910);

        dimBehind(popupWindow);

        // dismiss the popup window when touched
        popupView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                popupWindow.dismiss();
                return true;
            }
        });
    }

    public static void dimBehind(PopupWindow popupWindow) {
        View container = popupWindow.getContentView().getRootView();
        Context context = popupWindow.getContentView().getContext();
        WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        WindowManager.LayoutParams p = (WindowManager.LayoutParams) container.getLayoutParams();
        p.flags |= WindowManager.LayoutParams.FLAG_DIM_BEHIND;
        p.dimAmount = 0.5f;
        wm.updateViewLayout(container, p);
    }
}
