package com.tom.version2;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random r = new Random();
    int i = r.nextInt(100)+1;
    int max = 100;
    int min = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void number(View v){
        EditText edNumber =findViewById(R.id.ed_number);
        int n = Integer.parseInt(edNumber.getText().toString());
        if(n==i){
            new AlertDialog.Builder(this)
                    .setTitle("恭喜你")
                    .setMessage("答對了")
                    .setPositiveButton("好的", null)
                    .show();

        }
        if(n < min){
            Toast.makeText(this,"請輸入1~100",Toast.LENGTH_LONG)
                    .show();
        }
        if(n > max){
            Toast.makeText(this,"請輸入1~100",Toast.LENGTH_LONG)
                    .show();
            }

        if(n < i){
            Toast.makeText(this,n+"~"+max,Toast.LENGTH_LONG)
                    .show();
        }
        if(n > i){
            Toast.makeText(this,+min+"~"+n,Toast.LENGTH_LONG)
                    .show();
        }
    }
}
