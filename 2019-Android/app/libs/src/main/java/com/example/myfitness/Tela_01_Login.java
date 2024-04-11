package com.example.myfitness;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import java.util.Calendar;

public class Tela_01_Login extends AppCompatActivity implements View.OnClickListener {

    LinearLayout layoutInicial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layoutInicial = (LinearLayout) findViewById(R.id.layoutInicial);
        layoutInicial.setOnClickListener(this);
    }

    private Object getFichaPrincipal() {
        return null;
    }

    @Override
    public void onClick(View v) {
        Intent i;
        /*if(getFichaPrincipal() == null) {
            i = new Intent(this, Tela_03_CriarFicha.class);
        } else {
            i = new Intent(this, Tela_02_TelaPrincipal.class);
        }*/
        i = new Intent(this, Tela_02_TelaPrincipal.class);
//        i = new Intent(this, Tela_04_VisualizarTreino.class);


        startActivity(i);
    }
}
