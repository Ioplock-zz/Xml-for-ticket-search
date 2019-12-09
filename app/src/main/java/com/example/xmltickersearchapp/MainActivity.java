package com.example.xmltickersearchapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button[] InitilizeAr1() {
        Button b1 = findViewById(R.id.Mon_d1);
        Button b2 = findViewById(R.id.Tue_d1);
        Button b3 = findViewById(R.id.Wed_d1);
        Button b4 = findViewById(R.id.Thu_d1);
        Button b5 = findViewById(R.id.Fri_d1);
        Button b6 = findViewById(R.id.Sat_d1);
        Button b7 = findViewById(R.id.Sun_d1);
        Button[] date1 = {b1, b2, b3, b4, b5, b6, b7};
        return date1;
    }

    Button[] InitilizeAr2() {
        Button b1 = findViewById(R.id.Mon_d2);
        Button b2 = findViewById(R.id.Tue_d2);
        Button b3 = findViewById(R.id.Wed_d2);
        Button b4 = findViewById(R.id.Thu_d2);
        Button b5 = findViewById(R.id.Fri_d2);
        Button b6 = findViewById(R.id.Sat_d2);
        Button b7 = findViewById(R.id.Sun_d2);
        Button[] date2 = {b1, b2, b3, b4, b5, b6, b7};
        return date2;
    }

    Button[] date1;
    Button[] date2;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int[] days = getResources().getIntArray(R.array.days);
        date1 = InitilizeAr1();
        date2 = InitilizeAr2();
        ImageView[] navigate1 = {findViewById(R.id.Left_d1), findViewById(R.id.Right_d1)};
        ImageView[] navigate2 = {findViewById(R.id.Left_d2), findViewById(R.id.Right_d2)};
    }

    public void ClickFDate(View v) {
        for (int i = 0; i < 7; i++) {
            date1[i].setBackground(getResources().getDrawable(R.color.white));
        }
        v.setBackground(getResources().getDrawable(R.color.colorPrimary));
    }

    public void ClicSFDate(View v) {
        for (int i = 0; i < 7; i++) {
            date2[i].setBackground(getResources().getDrawable(R.color.white));
        }
        v.setBackground(getResources().getDrawable(R.color.colorPrimary));
    }


}
