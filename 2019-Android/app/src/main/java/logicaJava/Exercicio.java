package logicaJava;

public class Exercicio {

    String nome;
    Equipamento equipamento;

    int series;
    int repeticoes;

    public Exercicio(String nome, Equipamento equipamento, int series, int repeticoes) {
        setNome(nome);
        setEquipamento(equipamento);
        setSeriesERepeticoes(series, repeticoes);
    }

    public Exercicio(String nome, Equipamento equipamento) {
        this(nome, equipamento, 1, 1);
    }
    
    public Exercicio(String nome) {
    	this(nome, null);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Equipamento getEquipamento() {
        return equipamento;
    }

    public void setEquipamento(Equipamento equipamento) {
        this.equipamento = equipamento;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        if (series >= 1) {
            this.series = series;
        } else {
            // Erro :)
        }
    }

    public int getRepeticoes() {
        return repeticoes;
    }

    public void setRepeticoes(int repeticoes) {
        if (repeticoes >= 1) {
            this.repeticoes = repeticoes;
        } else {
            // Erro :)
        }
    }
    
    public void setSeriesERepeticoes(int series, int repeticoes) {
    	setSeries(series);
    	setRepeticoes(repeticoes);
    }
}
