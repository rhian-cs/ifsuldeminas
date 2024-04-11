package logicaJava;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class FichaDeTreino {

    String nome;
    Calendar dataDeCriacao;
    ArrayList<Secao> secoes;

    public FichaDeTreino(String nome, Calendar dataDeCriacao) {
        setNome(nome);
        setDataDeCriacao(dataDeCriacao);

        secoes = new ArrayList<Secao>();
    }
    
    public FichaDeTreino(String nome, Calendar dataDeCriacao, ArrayList<Secao> secoes) {
    	this(nome, dataDeCriacao);
        this.secoes.addAll(secoes);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Calendar getDataDeCriacao() {
        return dataDeCriacao;
    }

    public void escreverJSON(String caminho) {
        // Fazer: Integração com banco de dados JSON
    }

    public static FichaDeTreino carregarJSON(String caminho) {
        // Fazer: Integração com banco de dados JSON
        return null;
    }

    public void setDataDeCriacao(Calendar dataDeCriacao) {
        this.dataDeCriacao = dataDeCriacao;
    }

    /*public TemporalAccessor getDataCriacaoTA() {
    	 TimeZone tz = dataDeCriacao.getTimeZone();
         ZoneId zid = tz == null ? ZoneId.systemDefault() : tz.toZoneId();
         return LocalDateTime.ofInstant(dataDeCriacao.toInstant(), zid);
    }*/
    
    public String getDataFormatada() {
    	/*DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.getDefault());
    	return formatter.format(getDataCriacaoTA());*/
    	String formatada = dataDeCriacao.DAY_OF_MONTH + "/" + dataDeCriacao.MONTH + "/" + dataDeCriacao.YEAR;
    	return formatada;
    }
    
    public String getInfo() {
    	String info = "Ficha: " + getNome() + '\n';
    	
    	
    	//info += "Data de Cria��o: " + dataDeCriacao.DAY_OF_WEEK + ", " + dataDeCriacao.DAY_OF_MONTH + " de " + dataDeCriacao.MONTH + " de " + dataDeCriacao.YEAR + '\n';
    	
    	
    	info += "Data de Cria��o: " + getDataFormatada() + '\n';
    	
    	return info;
    }

    public ArrayList<Secao> getSecoes() {
        return secoes;
    }

    public static FichaDeTreino getFichaExemplo() {
        ArrayList<Secao> secoes = new ArrayList<Secao>();

        ArrayList<Exercicio> exerciciosA = new ArrayList<Exercicio>();
        exerciciosA.add(new Exercicio("Remada supinada"));
        exerciciosA.add(new Exercicio("Triceps pulley"));
        exerciciosA.add(new Exercicio("Remada cavalo"));

        Secao secA = new Secao(exerciciosA, 3, 10);
        secA.setNome("Seção A");
        secoes.add(secA);

        ArrayList<Exercicio> exerciciosB = new ArrayList<Exercicio>();
        exerciciosB.add(new Exercicio("Leg Press 45"));
        exerciciosB.add(new Exercicio("Graviton"));
        exerciciosB.add(new Exercicio("Desenvolvimento Halteres"));

        Secao secB = new Secao(exerciciosB, 3, 10);
        secB.setNome("Seção B");
        secoes.add(secB);

        return new FichaDeTreino("Ficha de Exemplo", Calendar.getInstance(), secoes);
    }
}
