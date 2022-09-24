package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView2=findViewById(R.id.textView2);
        Intent i=getIntent();
        String name=i.getStringExtra(MainActivity.EXTRA_NAME);
        textView2.setText(name);
    }
    public void btn(View v){
        Intent i=new Intent(MainActivity2.this,MainActivity.class);
        // Calling function
        // MainActivity ma=new MainActivity();
       //  ma.gameReset();
        startActivity(i);
    }
}