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

    int numeroDeSeriesPadrao;
    int numeroDeRepeticoesPadrao;

    ArrayList<Exercicio> exercicios;

    public FichaDeTreino(String nome, Calendar dataDeCriacao, int numeroDeSeriesPadrao, int numeroDeRepeticoesPadrao) {
        setNome(nome);
        setDataDeCriacao(dataDeCriacao);

        setNumeroDeSeriesERepeticoesPadrao(numeroDeSeriesPadrao, numeroDeRepeticoesPadrao);

        exercicios = new ArrayList<Exercicio>();
    }
    
    public FichaDeTreino(String nome, Calendar dataDeCriacao, int numeroDeSeriesPadrao, int numeroDeRepeticoesPadrao, ArrayList<Exercicio> exerciciosArrayList) {
    	this(nome, dataDeCriacao, numeroDeSeriesPadrao, numeroDeRepeticoesPadrao);
    	exercicios.addAll(exerciciosArrayList);
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
        // Fazer: IntegraÃ§Ã£o com banco de dados JSON
    }

    public static FichaDeTreino carregarJSON(String caminho) {
        // Fazer: IntegraÃ§Ã£o com banco de dados JSON
        return null;
    }

    public void setDataDeCriacao(Calendar dataDeCriacao) {
        this.dataDeCriacao = dataDeCriacao;
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
    
    public void setNumeroDeSeriesERepeticoesPadrao(int numeroDeSeriesPadrao, int numeroDeRepeticoesPadrao) {
    	setNumeroDeSeriesPadrao(numeroDeSeriesPadrao);
    	setNumeroDeRepeticoesPadrao(numeroDeRepeticoesPadrao);
    }
    
    public TemporalAccessor getDataCriacaoTA() {
    	 TimeZone tz = dataDeCriacao.getTimeZone();
         ZoneId zid = tz == null ? ZoneId.systemDefault() : tz.toZoneId();
         return LocalDateTime.ofInstant(dataDeCriacao.toInstant(), zid);
    }
    
    public String getDataFormatada() {
    	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.getDefault());
    	return formatter.format(getDataCriacaoTA());
    }
    
    public String getInfo() {
    	String info = "Ficha: " + getNome() + '\n';
    	
    	
    	//info += "Data de Criação: " + dataDeCriacao.DAY_OF_WEEK + ", " + dataDeCriacao.DAY_OF_MONTH + " de " + dataDeCriacao.MONTH + " de " + dataDeCriacao.YEAR + '\n';
    	
    	
    	info += "Data de Criação: " + getDataFormatada() + '\n';
    	
    	if(getNumeroDeSeriesPadrao() != 0)
    		info += "Número de Séries Padrão: " + getNumeroDeSeriesPadrao() + '\n';
    	if(getNumeroDeRepeticoesPadrao() != 0)
    		info += "Número de Repetições Padrão: " + getNumeroDeRepeticoesPadrao() + '\n';
    	
    	return info;
    }
}
