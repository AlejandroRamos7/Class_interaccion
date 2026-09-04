package com.example.yarp_class;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
private Button b1;
private Button b2;
private Button b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.button);
        b1.setOnClickListener(this);

        b2 = (Button) findViewById(R.id.button2);
        b2.setOnClickListener(this);

        b3 = (Button) findViewById(R.id.button3);
        b3.setOnClickListener(this);

    }
    @Override
    public void onClick(View v){

        int botoncito = v.getId();

        if(botoncito == R.id.button){
        Intent intent = new Intent(MainActivity.this,ventana1.class);
        startActivity(intent); }

        if(botoncito == R.id.button2){
            Intent intent = new Intent(MainActivity.this,ventana2.class);
            startActivity(intent); }

        if(botoncito == R.id.button3){
            Intent intent = new Intent(MainActivity.this,ventana3.class);
            startActivity(intent);
        }
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }
}