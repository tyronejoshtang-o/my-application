package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class BasicCalcActivity extends AppCompatActivity {

    private TextView dsply;
    private Button bspcBtb, ceBtn, cBtn, dvdBtn, mltplyBtn, sbtrctBtn, addBtn, equalBtn, pntBtn, zrBtn, oneBtn, twoBtn, thrBtn, frBtn, fvBtn, sxBtn, svnBtn, eightBtn, nineBtn;

    private String currentNumber = "";
    private String previousNumber = "";
    private String operation ="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_calc);

        dsply = (TextView) findViewById(R.id.display);

        bspcBtb = (Button) findViewById(R.id.backspace);
        ceBtn = (Button) findViewById(R.id.ce);
        cBtn = (Button) findViewById(R.id.c);
        dvdBtn = (Button) findViewById(R.id.division);
        mltplyBtn = (Button) findViewById(R.id.multiplication);
        sbtrctBtn = (Button) findViewById(R.id.subtraction);
        addBtn = (Button) findViewById(R.id.addition);
        equalBtn = (Button) findViewById(R.id.equals);
        pntBtn = (Button) findViewById(R.id.point);
        zrBtn = (Button) findViewById(R.id.zero);
        oneBtn = (Button) findViewById(R.id.one);
        twoBtn = (Button) findViewById(R.id.two);
        thrBtn = (Button) findViewById(R.id.three);
        frBtn = (Button) findViewById(R.id.four);
        fvBtn = (Button) findViewById(R.id.five);
        sxBtn = (Button) findViewById(R.id.six);
        svnBtn = (Button) findViewById(R.id.seven);
        eightBtn = (Button) findViewById(R.id.eight);
        nineBtn = (Button) findViewById(R.id.nine);

        bspcBtb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backspace();
            }
        });

        ceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clearEntry();
            }
        });

        cBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clear();
            }
        });

        dvdBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operation = "/";
                previousNumber = currentNumber;
                currentNumber = "";
            }
        });

        mltplyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operation = "*";
                previousNumber = currentNumber;
                currentNumber = "";
            }
        });

        sbtrctBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operation = "-";
                previousNumber = currentNumber;
                currentNumber = "";
            }
        });

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                operation = "+";
                previousNumber = currentNumber;
                currentNumber = "";
            }
        });

        equalBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculate();
            }
        });

        pntBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!currentNumber.contains(".")) {
                    currentNumber += ".";
                }
                dsply.setText(currentNumber);
            }
        });

        oneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentNumber += "1";
                dsply.setText(currentNumber);
            }
        });

        twoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentNumber += "2";
                dsply.setText(currentNumber);
            }
        });

        thrBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentNumber += "3";
                dsply.setText(currentNumber);
            }
        });

        frBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentNumber += "4";
                dsply.setText(currentNumber);
            }
        });

        fvBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentNumber += "5";
                dsply.setText(currentNumber);
            }
        });

        sxBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentNumber += "6";
                dsply.setText(currentNumber);
            }
        });

        svnBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentNumber += "7";
                dsply.setText(currentNumber);
            }
        });

        eightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentNumber += "8";
                dsply.setText(currentNumber);
            }
        });

        nineBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                currentNumber += "9";
                dsply.setText(currentNumber);
            }
        });


    }
    private void backspace() {
        if (currentNumber.length() > 0) {
            currentNumber = currentNumber.substring(0, currentNumber.length() -1);
            dsply.setText(currentNumber);
        }

    }
    private void clearEntry() {
        currentNumber = "";
        dsply.setText("0");
    }

    private void clear() {
        currentNumber = "";
        previousNumber = "";
        operation = "";
        dsply.setText("0");
    }

    private void calculate() {
        if (previousNumber.length() > 0 && currentNumber.length() > 0) {
            double result = 0;
            switch (operation) {
                case "+":
                    result = Double.parseDouble(previousNumber) + Double.parseDouble(currentNumber);
                    break;
                case "-":
                    result = Double.parseDouble(previousNumber) - Double.parseDouble(currentNumber);
                    break;
                case "*":
                    result = Double.parseDouble(previousNumber) * Double.parseDouble(currentNumber);
                    break;
                case "/":
                    result = Double.parseDouble(previousNumber) / Double.parseDouble(currentNumber);
                    break;

            }
            dsply.setText(String.valueOf(result));
            previousNumber = "";
            currentNumber = String.valueOf(result);
        }
    }

}