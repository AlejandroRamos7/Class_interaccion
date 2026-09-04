package com.example.yarp_class;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ventana1 extends AppCompatActivity implements View.OnClickListener {
    private Button r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.ventana1);

        r = (Button) findViewById(R.id.button4);
        r.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        Intent intent = new Intent(ventana1.this,MainActivity.class);
        startActivity(intent);

    }
}