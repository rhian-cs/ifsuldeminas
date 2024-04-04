
package DAO;

import java.io.File;
import java.sql.ResultSet;

public class HistoricoDAO extends DAO {
    String tabela;
    
    public HistoricoDAO() {
        super("hospital");
        tabela = "historicoDePaciente";
    }
    
    public ResultSet selecionar(String idPaciente) {
        return selecionar(tabela, "*", "WHERE idPaciente='" + idPaciente + "'");
    }
    
    public void inserir(String doenca, String data, String sintomas, String idPaciente, String idAtendente, String idMedico, File examePdf) {
        //String insercao = "'" + idPaciente + "', '" + doenca+ "', '" + data+ "', '" +sintomas + "', '" + idAtendente + "', '" + idMedico + "'" + "', '" + examePdf + "'";
        //inserir(tabela, insercao);
		inserirHistoricoDePaciente(tabela, doenca, data, sintomas, idPaciente, idAtendente, idMedico, examePdf);
    }
}
