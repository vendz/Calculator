package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // UI Elements
    private TextView num_0;
    private TextView num_1;
    private TextView num_2;
    private TextView num_3;
    private TextView num_4;
    private TextView num_5;
    private TextView num_6;
    private TextView num_7;
    private TextView num_8;
    private TextView num_9;
    private TextView num_input;
    private TextView num_output;
    private TextView num_add;
    private TextView num_subtract;
    private TextView num_multiply;
    private TextView num_divide;
    private TextView num_modulus;
    private TextView num_c;
    private TextView num_period;
    private TextView num_equals;
    private TextView num_add_subtract;

    private float input, input2 ;
    private Double input_number;

    boolean Addition, Subtract, Multiplication, Division, mRemainder, decimal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initializing
        num_0 = findViewById(R.id.num_0);
        num_1 = findViewById(R.id.num_1);
        num_2 = findViewById(R.id.num_2);
        num_3 = findViewById(R.id.num_3);
        num_4 = findViewById(R.id.num_4);
        num_5 = findViewById(R.id.num_5);
        num_6 = findViewById(R.id.num_6);
        num_7 = findViewById(R.id.num_7);
        num_8 = findViewById(R.id.num_8);
        num_9 = findViewById(R.id.num_9);
        num_c = findViewById(R.id.num_c);
        num_equals = findViewById(R.id.num_equals);
        num_add = findViewById(R.id.num_add);
        num_subtract = findViewById(R.id.num_subtract);
        num_add_subtract = findViewById(R.id.num_add_subtract);
        num_divide = findViewById(R.id.num_divide);
        num_modulus = findViewById(R.id.num_modulus);
        num_multiply = findViewById(R.id.num_multiply);
        num_period = findViewById(R.id.num_period);
        num_input = findViewById(R.id.num_input);
        num_output = findViewById(R.id.num_output);

        num_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num_input.setText(num_input.getText() + "0");
            }
        });

        num_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num_input.setText(num_input.getText() + "1");
            }
        });

        num_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num_input.setText(num_input.getText() + "2");
            }
        });

        num_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num_input.setText(num_input.getText() + "3");
            }
        });

        num_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num_input.setText(num_input.getText() + "4");
            }
        });

        num_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num_input.setText(num_input.getText() + "5");
            }
        });

        num_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num_input.setText(num_input.getText() + "6");
            }
        });

        num_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num_input.setText(num_input.getText() + "7");
            }
        });

        num_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num_input.setText(num_input.getText() + "8");
            }
        });

        num_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num_input.setText(num_input.getText() + "9");
            }
        });

        num_period.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num_input.setText(num_input.getText() + ".");
            }
        });

        num_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num_input.setText(null);
                decimal = false;
            }
        });

        num_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (num_input != null){
                    input = Float.parseFloat(num_input.getText() + "");
                    Addition = true;
                    decimal = false;
                    num_input.setText(null);
                }
            }
        });

        num_subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (num_input != null){
                    input = Float.parseFloat(num_input.getText() + "");
                    Subtract = true;
                    decimal = false;
                    num_input.setText(null);
                }
            }
        });

        num_multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (num_input != null){
                    input = Float.parseFloat(num_input.getText() + "");
                    Multiplication = true;
                    decimal = false;
                    num_input.setText(null);
                }
            }
        });

        num_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (num_input != null){
                    input = Float.parseFloat(num_input.getText() + "");
                    Division = true;
                    decimal = false;
                    num_input.setText(null);
                }
            }
        });

        num_modulus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (num_input != null){
                    input = Float.parseFloat(num_input.getText() + "");
                    mRemainder = true;
                    decimal = false;
                    num_input.setText(null);
                }
            }
        });

        num_add_subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (num_input != null){
                    // this line is buggy!!
                    input = num_input.setText(num_input *= -1).toString();
                }
            }
        });

        num_equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Addition || Subtract || Multiplication || Division || mRemainder) {
                    input2 = Float.parseFloat(num_input.getText() + "");
                }

                if (Addition) {

                    num_input.setText(input + input2 + "");
                    num_output.setText(input + input2 + "");
                    Addition = false;
                }

                if (Subtract) {

                    num_input.setText(input - input2 + "");
                    num_output.setText(input - input2 + "");
                    Subtract = false;
                }

                if (Multiplication) {

                    num_input.setText(input * input2 + "");
                    num_output.setText(input * input2 + "");
                    Multiplication = false;
                }

                if (Division) {

                    num_input.setText(input / input2 + "");
                    num_output.setText(input / input2 + "");
                    Division = false;
                }
                if (mRemainder) {

                    num_input.setText(input % input2 + "");
                    num_output.setText(input % input2 + "");
                    mRemainder = false;
                }
            }
        });

        num_period.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (decimal) {
                    //do nothing or you can show the error
                } else {
                    num_input.setText(num_input.getText() + ".");
                    decimal = true;
                }

            }
        });
    }
}