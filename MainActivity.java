package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button bmiCalcBtn, coffeeShopBtn, basicCalcBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        bmiCalcBtn = (Button) findViewById(R.id.bmi_calculator);
        coffeeShopBtn = (Button) findViewById(R.id.coffeeshop);
        basicCalcBtn = (Button) findViewById(R.id.basiccalculator);

    }

    public void CheckBMI(View v) {
        Intent myIntent = new Intent(this, BMICalcActivity.class);
        startActivity(myIntent);

    }

    public void CheckCoffee(View v) {
        Intent myIntent = new Intent (this, CoffeeShopActivity.class);
        startActivity(myIntent);

    }

    public void CheckCalc(View v) {
        Intent myIntent = new Intent ( this, BasicCalcActivity.class);
        startActivity(myIntent);

    }
}