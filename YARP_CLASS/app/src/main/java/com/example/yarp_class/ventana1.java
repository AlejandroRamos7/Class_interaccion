package com.example.yarp_class;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ventana1 extends AppCompatActivity implements View.OnClickListener {
    private Button r;
    private TextView t;
    private EditText e,e2;
    private Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.ventana1);

        t=(TextView)findViewById(R.id.textView2);
        e=(EditText)findViewById(R.id.editTextText2);
        e2=(EditText)findViewById(R.id.editTextText3);
        b=(Button)findViewById(R.id.button8);
        b.setOnClickListener(this);

        r = (Button) findViewById(R.id.button4);
        r.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        Intent intent = new Intent(ventana1.this,MainActivity.class);
        startActivity(intent);

        int n = Integer.parseInt(numero2);
        int n2 = Integer.parseInt(numero);
        int res = n + n2;

        t.setText("resultado = " + res);

    }
}