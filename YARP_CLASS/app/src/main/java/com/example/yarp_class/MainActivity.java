package com.example.yarp_class;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
private Button b1;
private Button b2;
private Button b3;

private Button b4;

    private EditText t;
    private TextView e;

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

        b4 = (Button) findViewById(R.id.button7);
        b4.setOnClickListener(this);

        t=(EditText) findViewById(R.id.editTextText);
        e=(TextView) findViewById(R.id.textView);


    }
    @Override
    public void onClick(View v){

        Toast.makeText(this, "Alerta", Toast.LENGTH_SHORT).show();

        int botoncito = v.getId();

        String nombre = t.getText().toString();
        t.setText("Hola " + nombre);

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