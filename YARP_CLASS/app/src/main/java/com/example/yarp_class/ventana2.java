package com.example.yarp_class;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class ventana2 extends AppCompatActivity implements View.OnClickListener {
    private Button r;
    private VideoView video;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.ventana2);

        r = (Button) findViewById(R.id.button5);
        r.setOnClickListener(this);

        // Obtiene la referencia al VideoView definido en el layout XML (id: videoView)
        // El cast (VideoView) le dice al compilador que ese elemento es un VideoView
        video = (VideoView) findViewById(R.id.videoView);
        // Construye la ruta del video como texto usando el formato android.resource://
        // getPackageName() devueve el nombre del paquete (ej. com.tuapp.ejemplo)
        // R.raw.video es el ID que Android asigna al archivo video.mp4 en res/raw
        String videopath = "android.resource://" + getPackageName() + "/" + R.raw.video;
        // Convierte el texto de la ruta en un objeto Uri, el formato que VideoView entiende
        Uri uri = Uri.parse(videopath);
        // Le indica al VideoView cuál es el video a reproducir (aún no lo carga)
        video.setVideoURI(uri);
        // Crea el MediaController: la barra de controles (play/pausa, progreso, adelantar)
        // 'this' es el Context (la Activity), necesario para crear la vista
        MediaController mediaController = new MediaController(this);
        // Vincula el controlador al VideoView para que aparezca sobre el video
        video.setMediaController(mediaController);
        // Ancla el controlador al video: se muestra/oculta al tocar la pantalla
        mediaController.setAnchorView(video);
        // Inicia la reproducción del video
        video.start();

    }


    @Override
    public void onClick(View v) {

        Intent intent = new Intent(ventana2.this,MainActivity.class);
        startActivity(intent);

    }
}