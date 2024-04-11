package com.example.myfitness;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.net.LinkAddress;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Calendar;

import logicaJava.Exercicio;
import logicaJava.FichaDeTreino;
import logicaJava.Secao;

public class Tela_02_TelaPrincipal extends AppCompatActivity implements View.OnClickListener {

    Calendar hoje;
    FichaDeTreino fichaPrincipal;
    LinearLayout layoutConteudoFicha;
    Button botaoVisualizarTreino;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_02__tela_principal);

        hoje = Calendar.getInstance();
        layoutConteudoFicha = (LinearLayout) findViewById(R.id.layoutConteudoFicha);

        botaoVisualizarTreino = (Button) findViewById(R.id.botaoVisualizarTreino);
        botaoVisualizarTreino.setOnClickListener(this);

        fichaPrincipal = FichaDeTreino.getFichaExemplo();

        mostrarFicha();
    }

    private void mostrarFicha() {
        ArrayList<Secao> secoes = fichaPrincipal.getSecoes();

        for(Secao sec : secoes) {
            // TextView
            TextView textViewTituloSecao = new TextView(this);
            textViewTituloSecao.setText(sec.getNome());
            textViewTituloSecao.setTextSize(18);
            textViewTituloSecao.setTextColor(Color.BLACK);

            layoutConteudoFicha.addView(textViewTituloSecao);

            ArrayList<Exercicio> exercicios = sec.getExercicios();
            for(Exercicio exercicio : exercicios) {
                TextView textViewExercicio = new TextView(this);
                textViewExercicio.setText(exercicio.getNome());

                layoutConteudoFicha.addView(textViewExercicio);

                LinearLayout wrapperSeries = new LinearLayout(this);
                wrapperSeries.setOrientation(LinearLayout.VERTICAL);

                LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
                wrapperSeries.setLayoutParams(params);

                int series = exercicio.getSeries();
                for (int i = 0; i < series; i++) {
                    LinearLayout wrapperRepeticoes = new LinearLayout(this);
                    wrapperRepeticoes.setOrientation(LinearLayout.HORIZONTAL);

                    SeekBar repeticoesFeitas = new SeekBar(this);
                    //repeticoesFeitas.setWeight(10);
                    wrapperRepeticoes.addView(repeticoesFeitas);;

                    CheckBox check = new CheckBox(this);
                    wrapperRepeticoes.addView(check);;
                    wrapperSeries.addView(wrapperRepeticoes);
                }

                layoutConteudoFicha.addView(wrapperSeries);
            }
        }
    }

    public FichaDeTreino getFichaPrincipal() {
        return fichaPrincipal;
    }

    public void setFichaPrincipal(FichaDeTreino fichaPrincipal) {
        this.fichaPrincipal = fichaPrincipal;
    }

    @Override
    public void onClick(View v) {
        if(v.equals(botaoVisualizarTreino)) {
            Intent i = new Intent(this, Tela_04_VisualizarTreino.class);
            startActivity(i);
        }
    }
}
