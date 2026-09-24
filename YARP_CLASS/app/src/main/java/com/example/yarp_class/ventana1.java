package com.example.yarp_class;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class ventana1 extends AppCompatActivity implements View.OnClickListener {
    private Button r;
    private TextView t;
    private EditText e, e2;
    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.ventana1);

        t = (TextView) findViewById(R.id.textView2);
        e = (EditText) findViewById(R.id.editTextText2);
        e2 = (EditText) findViewById(R.id.editTextText3);
        b1 = (Button) findViewById(R.id.button8);
        b1.setOnClickListener(this);
        b2 = (Button) findViewById(R.id.button9);
        b2.setOnClickListener(this);
        b3 = (Button) findViewById(R.id.button10);
        b3.setOnClickListener(this);
        b4 = (Button) findViewById(R.id.button11);
        b4.setOnClickListener(this);

        r = (Button) findViewById(R.id.button4);
        r.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        try {
            int botoncito = v.getId();
            int sumint = 0;
            int resint = 0;
            int mulint = 0;
            int divint = 0;
            double sumdec = 0;
            double resdec = 0;
            double muldec = 0;
            double divdec = 0;

            String tex1 = e.getText().toString();
            String tex2 = e2.getText().toString();

            if (botoncito == R.id.button4) {
                Intent intent = new Intent(ventana1.this, MainActivity.class);
                startActivity(intent);
            }

            if(tex1.contains(".") || tex2.contains(".")){
                double n = Double.parseDouble(e.getText().toString());
                double n2 = Double.parseDouble(e2.getText().toString());
                sumdec = n + n2;
                resdec = n - n2;
                muldec = n * n2;
                divdec = n/n2;
            }
            else{
            int n = Integer.parseInt(e.getText().toString());
            int n2 = Integer.parseInt(e2.getText().toString());
                sumint = n + n2;
                resint = n - n2;
                mulint = n * n2;
                divint = n/n2;
            }


            if (botoncito == R.id.button8) {
                if(tex1.contains(".") || tex2.contains(".")){
                    t.setText("resultado = " + sumdec);
                }
                else{
                    t.setText("resultado = " + sumint);
                }
            }

            if (botoncito == R.id.button9) {
                if(tex1.contains(".") || tex2.contains(".")){
                    t.setText("resultado = " + muldec);
                }
                else{
                    t.setText("resultado = " + mulint);
                }
            }

            if (botoncito == R.id.button10) {
                if(tex1.contains(".") || tex2.contains(".")){
                    t.setText("resultado = " + resdec);
                }
                else{
                    t.setText("resultado = " + resint);
                }
            }

            if (botoncito == R.id.button11) {
                if(tex1.contains(".") || tex2.contains(".")){
                    t.setText("resultado = " + divdec);
                }
                else{
                    t.setText("resultado = " + divint);
                }
            }

        } catch (NumberFormatException error) {
            Toast.makeText(this, "Escribe solo numeros", Toast.LENGTH_SHORT).show();
        } catch (ArithmeticException error2) {
            Toast.makeText(this, "No se puede dividir entre 0", Toast.LENGTH_SHORT).show();
        }
    }
}