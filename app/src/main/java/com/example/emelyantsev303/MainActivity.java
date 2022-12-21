package com.example.emelyantsev303;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


// Емельянцев Никита, 303
public class MainActivity extends AppCompatActivity {
    EditText FirstValue, SecondValue;
    Button btnAdd, btnSubs, btnMultiply, btnDivide;
    double num1, num2;
    TextView TVresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FirstValue = findViewById(R.id.FirstValue);
        SecondValue = findViewById(R.id.SecondValue);
        btnAdd = findViewById(R.id.btnAdd);
        btnDivide = findViewById(R.id.btnDiv);
        btnMultiply = findViewById(R.id.btnMulti);
        btnSubs = findViewById(R.id.btnSubs);
        TVresult = findViewById(R.id.result);
    }

    public void add_click(View view) {
        try {
            num1 = Double.parseDouble(FirstValue.getText().toString());
            num2 = Double.parseDouble(SecondValue.getText().toString());
            Double result = num1 + num2;
            TVresult.setText(String.valueOf(result));
        } catch (Exception ex) {
            Toast.makeText(this, "Неверное значение поля!", Toast.LENGTH_SHORT).show();
            return;
        }
    }

    public void sub_click(View view) {
        try {
            num1 = Double.parseDouble(FirstValue.getText().toString());
            num2 = Double.parseDouble(SecondValue.getText().toString());
            Double result = num1 - num2;
            TVresult.setText(String.valueOf(result));
        } catch (Exception ex) {
            Toast.makeText(this, "Неверное значение поля!", Toast.LENGTH_SHORT).show();
            return;
        }
    }

    public void multi_click(View view) {
        try {
            num1 = Double.parseDouble(FirstValue.getText().toString());
            num2 = Double.parseDouble(SecondValue.getText().toString());
            Double result = num1 * num2;
            TVresult.setText(String.valueOf(result));
        } catch (Exception ex) {
            Toast.makeText(this, "Неверное значение поля!", Toast.LENGTH_SHORT).show();
            return;
        }
    }

    public void div_click(View view) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        CharSequence text = "На ноль делить неправильно!";

        try {
            num1 = Double.parseDouble(FirstValue.getText().toString());
            num2 = Double.parseDouble(SecondValue.getText().toString());
            Double result = num1 / num2;
            TVresult.setText(String.valueOf(result));
        } catch (Exception ex) {
            Toast.makeText(this, "Неверное значение поля!", Toast.LENGTH_SHORT).show();
            return;
        }

        if(num2 == 0) {
            Toast toast = Toast.makeText(context,text,duration);
            toast.show();
            return;
        };
    }

    public void sin_click(View view) {
        try {
            num1 = Double.parseDouble(FirstValue.getText().toString());
            Double result = Math.sin(num1);
            TVresult.setText(String.valueOf(result));
        } catch (Exception ex) {
            Toast.makeText(this, "Неверное значение поля!", Toast.LENGTH_SHORT).show();
            return;
        }
    }

    public void cos_click(View view) {
        try {
            num1 = Double.parseDouble(FirstValue.getText().toString());
            Double result = Math.cos(num1);
            TVresult.setText(String.valueOf(result));
        } catch (Exception ex) {
            Toast.makeText(this, "Неверное значение поля!", Toast.LENGTH_SHORT).show();
            return;
        }
    }

    public void sqrt_click(View view) {
        try {
            num1 = Double.parseDouble(FirstValue.getText().toString());
            Double result = Math.sqrt(num1);
            TVresult.setText(String.valueOf(result));
        } catch (Exception ex) {
            Toast.makeText(this, "Неверное значение поля!", Toast.LENGTH_SHORT).show();
            return;
        }
    }

    public void pow_click(View view) {
        try {
            num1 = Double.parseDouble(FirstValue.getText().toString());
            num2 = Double.parseDouble(SecondValue.getText().toString());

            Double result = Math.pow(num1, num2);
            TVresult.setText(String.valueOf(result));
        } catch (Exception ex) {
            Toast.makeText(this, "Неверное значение поля!", Toast.LENGTH_SHORT).show();
            return;
        }
    }
}