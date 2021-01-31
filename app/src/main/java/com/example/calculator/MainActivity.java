package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
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
    private ImageButton num_backspace;

    private String input, input2 ;
    private Double input_number;

    boolean Addition, Subtract, Multiplication, Division, mRemainder, decimal, add_sub;


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
        num_backspace = findViewById(R.id.num_backspace);

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
                add_sub = false;
                Addition = false;
                Subtract = false;
                Multiplication = false;
                Division = false;
                mRemainder = false;
            }
        });

        num_period.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!decimal) {
                    num_input.setText(num_input.getText() + ".");
                    decimal = true;
                }
            }
        });

        num_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (num_input != null){
                    input = (num_input.getText() + "");
                    Addition = true;
                    decimal = false;
                    num_input.setText(null);
                    num_output.setText(new Float(input).toString().replaceAll("\\.?0*$", ""));
                }
            }
        });

        num_subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (num_input != null){
                    input = (num_input.getText() + "");
                    Subtract = true;
                    decimal = false;
                    num_input.setText(null);
                    num_output.setText(new Float(input).toString().replaceAll("\\.?0*$", ""));
                }
            }
        });

        num_multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (num_input != null){
                    input = (num_input.getText() + "");
                    Multiplication = true;
                    decimal = false;
                    num_input.setText(null);
                    num_output.setText(new Float(input).toString().replaceAll("\\.?0*$", ""));
                }
            }
        });

        num_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (num_input != null){
                    input = (num_input.getText() + "");
                    Division = true;
                    decimal = false;
                    num_input.setText(null);
                    num_output.setText(new Float(input).toString().replaceAll("\\.?0*$", ""));
                }
            }
        });

        num_modulus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (num_input != null){
                    input = (num_input.getText() + "");
                    mRemainder = true;
                    decimal = false;
                    num_input.setText(null);
                    num_output.setText(new Float(input).toString().replaceAll("\\.?0*$", ""));
                }
            }
        });

        num_add_subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (num_input != null){
                    input = (num_input.getText() + "");
                    float final_input = Float.parseFloat(input);
                    num_input.setText(new Float(final_input * -1).toString().replaceAll("\\.?0*$", ""));
                    decimal = false;
                    num_output.setText(new Float(final_input * -1).toString().replaceAll("\\.?0*$", ""));
                }
            }
        });

        num_backspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sample_input = (num_input.getText() + "");
                input = sample_input.substring(0, sample_input.length() - 1);
                num_input.setText(input);

                if (input.contains(".")){
                    decimal = true;
                }
                else{
                    decimal = false;
                }
            }
        });

        num_equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Addition || Subtract || Multiplication || Division || mRemainder) {
                    input2 = (num_input.getText() + "");
                }

                if (Addition) {

                    float final_input = Float.parseFloat(input);
                    float final_input2 = Float.parseFloat(input2);
                    num_input.setText(new Float(final_input + final_input2 + "").toString().replaceAll("\\.?0*$", ""));
                    num_output.setText(new Float(final_input + final_input2 + "").toString().replaceAll("\\.?0*$", ""));
                    Addition = false;
                }

                if (Subtract) {

                   float final_input = Float.parseFloat(input);
                    float final_input2 = Float.parseFloat(input2);
                    num_input.setText(new Float(final_input - final_input2 + "").toString().replaceAll("\\.?0*$", ""));
                    num_output.setText(new Float(final_input - final_input2 + "").toString().replaceAll("\\.?0*$", ""));
                    Subtract = false;
                }

                if (Multiplication) {

                    float final_input = Float.parseFloat(input);
                    float final_input2 = Float.parseFloat(input2);
                    num_input.setText(new Float(final_input * final_input2 + "").toString().replaceAll("\\.?0*$", ""));
                    num_output.setText(new Float(final_input * final_input2 + "").toString().replaceAll("\\.?0*$", ""));
                    Multiplication = false;
                }

                if (Division) {
                    float final_input = Float.parseFloat(input);
                    float final_input2 = Float.parseFloat(input2);
                    num_input.setText(new Float(final_input / final_input2 + "").toString().replaceAll("\\.?0*$", ""));
                    num_output.setText(new Float(final_input / final_input2 + "").toString().replaceAll("\\.?0*$", ""));
                    Division = false;
                }
                if (mRemainder) {

                    float final_input = Float.parseFloat(input);
                    float final_input2 = Float.parseFloat(input2);
                    num_input.setText(new Float(final_input % final_input2 + "").toString().replaceAll("\\.?0*$", ""));
                    num_output.setText(new Float(final_input % final_input2 + "").toString().replaceAll("\\.?0*$", ""));
                    mRemainder = false;
                }
            }
        });
    }
}