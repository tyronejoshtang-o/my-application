package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CoffeeShopActivity extends AppCompatActivity {

    private RadioButton decafBtn, espressoBtn, colombianBtn;
    private CheckBox creamerCbx, sugarCbx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coffee_shop);

        decafBtn = (RadioButton) findViewById(R.id.decafRadioButton);
        espressoBtn = (RadioButton) findViewById(R.id.espressoRadioButton);
        colombianBtn = (RadioButton) findViewById(R.id.colombianRadioButton);

        creamerCbx = (CheckBox) findViewById(R.id.creamerCheckBox);
        sugarCbx = (CheckBox) findViewById(R.id.sugarCheckBox);

        Button payBtn = (Button) findViewById(R.id.payButton);

    }

    public void checkPrice(View v){
        int totalPrice = 0;

        if(decafBtn.isChecked()){
            totalPrice += 110;

        } else if(espressoBtn.isChecked()){
            totalPrice += 145;

        } else if (colombianBtn.isChecked()) {
            totalPrice += 125;

        } if(creamerCbx.isChecked()){
            totalPrice += 15;

        } if(sugarCbx.isChecked()){
            totalPrice += 20;

        }
        Toast.makeText(this, "₱ " + totalPrice, Toast.LENGTH_SHORT).show();

    }
}