package com.koreait.exam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clkBtn(View v) {
        EditText et = (EditText) findViewById(R.id.et);
        String str = et.getText().toString();

        int length = et.getText().length();

        switch (v.getId()) {
            case R.id.btn_0:
                str += "0";
                et.setText(str);
                break;

            case R.id.btn_1:
                str += "1";
                et.setText(str);
                break;

            case R.id.btn_2:
                str += "2";
                et.setText(str);
                break;

            case R.id.btn_3:
                str += "3";
                et.setText(str);
                break;

            case R.id.btn_4:
                str += "4";
                et.setText(str);
                break;

            case R.id.btn_5:
                str += "5";
                et.setText(str);
                break;

            case R.id.btn_6:
                str += "6";
                et.setText(str);
                break;

            case R.id.btn_7:
                str += "7";
                et.setText(str);
                break;

            case R.id.btn_8:
                str += "8";
                et.setText(str);
                break;

            case R.id.btn_9:
                str += "9";
                et.setText(str);
                break;

            case R.id.btn_clear:
                et.getText().delete(length - length, length);
                break;

            case R.id.btn_divide:
                str += "/";
                et.setText(str);
                break;

            case R.id.btn_multiply:
                str += "*";
                et.setText(str);
                break;

            case R.id.btn_subtract:
                str += "-";
                et.setText(str);
                break;

            case R.id.btn_add:
                str += "+";
                et.setText(str);
                break;

            case R.id.btn_equal:
                str += "=";
                et.setText(str);
                break;
        }
    }
}