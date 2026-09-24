package com.example.yarp_class;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.app.AppCompatActivity;

public class ventana3 extends AppCompatActivity implements View.OnClickListener {

    private Button r;
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ventana3);
        r = (Button) findViewById(R.id.button6);
        r.setOnClickListener(this);

        webView = findViewById(R.id.webView);

        // Configuración del WebView
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true); // Habilitar JavaScript

        // Forzar la apertura de enlaces en WebView en lugar del navegador
        webView.setWebViewClient(new WebViewClient());

        // Cargar una página web
        webView.loadUrl("https://www.google.com&quot;);
    }

    // Manejo del botón "Atrás" para volver en la navegación del WebView
    @Override
    public void onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(ventana3.this,MainActivity.class);
        startActivity(intent);

    }
}