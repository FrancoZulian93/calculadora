package com.example.franco.calculadora;

import android.net.sip.SipSession;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button boton0 = (Button) findViewById(R.id.Bot0);
        Button boton1 = (Button) findViewById(R.id.Bot1);
        Button boton2 = (Button) findViewById(R.id.Bot2);
        Button boton3 = (Button) findViewById(R.id.Bot3);
        Button boton4 = (Button) findViewById(R.id.Bot4);
        Button boton5 = (Button) findViewById(R.id.Bot5);
        Button boton6 = (Button) findViewById(R.id.Bot6);
        Button boton7 = (Button) findViewById(R.id.Bot7);
        Button boton8 = (Button) findViewById(R.id.Bot8);
        Button boton9 = (Button) findViewById(R.id.Bot9);
        Button botonx = (Button) findViewById(R.id.BotPor);
        Button botonpunto = (Button) findViewById(R.id.BotPunto);
        Button botonDiv = (Button) findViewById(R.id.BotDiv);
        Button botonMas = (Button) findViewById(R.id.Botmas);
        Button botonMenos = (Button) findViewById(R.id.BotMenos);
        Button botonIgual = (Button) findViewById(R.id.BotIgual);





        View.OnClickListener Listen = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button botonPresionado = (Button)v;
                EditText editText(EditText) findViewById(R.id.Texto);
                StringBuilder contenido = new StringBuilder(editText.getText());
                contenido.append(botonPresionado.getText());
                editText.setText(contenido.toString());
            }
        });

        View.OnClickListener Igual = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = (EditText) findViewById(R.id.Texto);
                StringBuilder contenido = new StringBuilder(editText.getText());
                String valores[] = contenido.toString().split("\\+");
                Integer resultado = 0;
                for(int i = 0; i < valores.length; i++){
                    resultado = resultado + Integer.valueOf(valores[i]);
                }
                editText.setText(resultado.toString());


        }



        boton0.setOnClickListener(Listen);
        boton1.setOnClickListener(Listen);
        boton2.setOnClickListener(Listen);
        boton3.setOnClickListener(Listen);
        boton4.setOnClickListener(Listen);
        boton5.setOnClickListener(Listen);
        boton6.setOnClickListener(Listen);
        boton7.setOnClickListener(Listen);
        boton8.setOnClickListener(Listen);
        boton9.setOnClickListener(Listen);
        botonpunto.setOnClickListener(Listen);
        botonDiv.setOnClickListener(Listen);
        botonMas.setOnClickListener(Listen);
        botonMenos.setOnClickListener(Listen);
        botonx.setOnClickListener(Listen);
        botonIgual.setOnClickListener(Igual);
    }

    //public void Pressed1(View view){

    }
}
