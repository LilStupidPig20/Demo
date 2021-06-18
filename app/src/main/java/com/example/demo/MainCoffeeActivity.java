package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupWindow;

public class MainCoffeeActivity extends AppCompatActivity {
    private Button espresso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_coffee);

        espresso = (Button) findViewById(R.id.button1_main_list);
        espresso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onButtonShowPopupWindowClick(v);
            }
        });
    }

    public void onButtonShowPopupWindowClick(View view) {

        // inflate the layout of the popup window
        LayoutInflater inflater = (LayoutInflater)
                getSystemService(LAYOUT_INFLATER_SERVICE);
        View popupView = inflater.inflate(R.layout.activity_popup_window_from_coffee, null);

        Button theoryBtn = (Button)popupView.findViewById(R.id.theory_popup_espresso);
        Button testBtn = (Button)popupView.findViewById(R.id.test_popup_espresso);
        Button practiceBtn = (Button)popupView.findViewById(R.id.practice_popup_espresso);

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

        theoryBtn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                openActivityTheoryEspresso();
            }
        });

        testBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityTestEspresso();
            }
        });

        practiceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityPracticeEspresso();
            }
        });

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

    public void openActivityTheoryEspresso(){
        Intent intent = new Intent(this, TheoryEspresso.class);
        startActivity(intent);
    }

    public void openActivityTestEspresso(){
        Intent intent = new Intent(this, TestEspresso.class);
        startActivity(intent);
    }

    public void openActivityPracticeEspresso(){
        Intent intent = new Intent(this, PracticeEspresso.class);
        startActivity(intent);
    }
}