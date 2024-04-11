package logicaJava;

import java.util.ArrayList;

public class Secao {

    String nome;

    int numeroDeSeriesPadrao;
    int numeroDeRepeticoesPadrao;

    ArrayList<Exercicio> exercicios;

    public Secao() {
        this.exercicios = new ArrayList<Exercicio>();
    }

    public Secao(ArrayList<Exercicio> exercicios) {
        this.exercicios = exercicios;
    }

    public Secao(ArrayList<Exercicio> exercicios, int numeroDeSeriesPadrao, int numeroDeRepeticoesPadrao) {
        this.numeroDeSeriesPadrao = numeroDeSeriesPadrao;
        this.numeroDeRepeticoesPadrao = numeroDeRepeticoesPadrao;
        this.exercicios = exercicios;
        for(Exercicio ex : exercicios) {
            ex.setSeries(numeroDeSeriesPadrao);
            ex.setRepeticoes(numeroDeRepeticoesPadrao);
        }
    }

    public int getNumeroDeSeriesPadrao() {
        return numeroDeSeriesPadrao;
    }

    public void setNumeroDeSeriesPadrao(int numeroDeSeriesPadrao) {
        this.numeroDeSeriesPadrao = numeroDeSeriesPadrao;
    }

    public int getNumeroDeRepeticoesPadrao() {
        return numeroDeRepeticoesPadrao;
    }

    public void setNumeroDeRepeticoesPadrao(int numeroDeRepeticoesPadrao) {
        this.numeroDeRepeticoesPadrao = numeroDeRepeticoesPadrao;
    }

    public ArrayList<Exercicio> getExercicios() {
        return exercicios;
    }

    public void setExercicios(ArrayList<Exercicio> exercicios) {
        this.exercicios = exercicios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
