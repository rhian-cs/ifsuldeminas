package com.example.myfitness;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Calendar;

import logicaJava.FichaDeTreino;

public class Tela_03_CriarFicha extends AppCompatActivity implements View.OnClickListener {

    Button buttonCriarFicha;
    EditText editTextNome;
    EditText editTextSeriesPadrao;
    EditText editTextRepeticoesPadrao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_03__criar_ficha);

        editTextNome = (EditText) findViewById(R.id.editTextNome);
        editTextSeriesPadrao = (EditText) findViewById(R.id.editTextSeriesPadrao);
        editTextRepeticoesPadrao = (EditText) findViewById(R.id.editTextRepeticoesPadrao);

        buttonCriarFicha = (Button) findViewById(R.id.buttonCriarFicha);
        buttonCriarFicha.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.equals(buttonCriarFicha)) {

            String nome = editTextNome.getText().toString();
            String seriesStr = editTextSeriesPadrao.getText().toString();
            String repeticoesStr = editTextRepeticoesPadrao.getText().toString();

            FichaDeTreino f = null;

            try {
                int series = Integer.parseInt(seriesStr);
                int repeticoes = Integer.parseInt(repeticoesStr);

                f = new FichaDeTreino (
                        nome,
                        Calendar.getInstance()
                );
            } catch(Exception e) {
                e.printStackTrace();
            }

            String mensagem;
            if (f == null) {
                mensagem = "Erro ao criar ficha de treino";
            } else {
                mensagem = "Ficha criada com sucesso.";
            }

            System.out.println("Apertou o botão :3");
            Toast.makeText(this, mensagem, Toast.LENGTH_SHORT).show();
        }
    }
}
