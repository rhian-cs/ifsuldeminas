package com.example.myfitness;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

import logicaJava.Exercicio;
import logicaJava.FichaDeTreino;
import logicaJava.Secao;

public class Tela_04_VisualizarTreino extends AppCompatActivity {

    LinearLayout layoutRaiz;
    FichaDeTreino fichaPrincipal;
    TextView textViewTitulo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_04_visualizar_treino);

        layoutRaiz = (LinearLayout) findViewById(R.id.layoutRaiz);
        fichaPrincipal = FichaDeTreino.getFichaExemplo();

        TextView textViewTitulo = findViewById(R.id.textViewTitulo);
        textViewTitulo.setText(fichaPrincipal.getNome());

        for (Secao sec: fichaPrincipal.getSecoes()) {
            LinearLayout layoutSecao = new LinearLayout(this);
            layoutSecao.setOrientation(LinearLayout.VERTICAL);

            LinearLayout.LayoutParams lsParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            lsParams.setMargins(0, 20,0,0);
            layoutSecao.setLayoutParams(lsParams);

            TextView nomeSecao = new TextView(this);
            nomeSecao.setText(sec.getNome());
            nomeSecao.setTextColor(Color.BLACK);
            nomeSecao.setTextSize(22);
            layoutSecao.addView(nomeSecao);

            LinearLayout layoutExercicios = new LinearLayout(this);
            layoutExercicios.setOrientation(LinearLayout.VERTICAL);

            LinearLayout.LayoutParams leParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
            leParams.setMargins(27, 5,0,0);
            layoutExercicios.setLayoutParams(leParams);


            for (Exercicio ex : sec.getExercicios()) {
                TextView nomeExercicio = new TextView(this);
                nomeExercicio.setTextSize(16);
                nomeExercicio.setTextColor(Color.rgb(54, 54, 54));

                String infoExercicioStr = ex.getNome() + ": " + ex.getSeries() + " de " + ex.getRepeticoes();
                nomeExercicio.setText(infoExercicioStr);

                layoutExercicios.addView(nomeExercicio);
            }
            layoutSecao.addView(layoutExercicios);

            layoutRaiz.addView(layoutSecao);
        }

    }
}
