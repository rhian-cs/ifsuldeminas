
package controller;

import DAO.AtendenteDAO;
import DAO.HistoricoDAO;
import DAO.MedicoDAO;
import DAO.PacienteDAO;
import java.io.File;

public class TelaAdicionarConsultaController {
	
	// Define a ação do botão de adicionar uma consulta
    public static String botaoAdicionarAcao(String doenca, String data, String sintomas, String idPaciente, String idAtendente, String idMedico, File examePdf) {
        HistoricoDAO hist = new HistoricoDAO();
		
		// Se algum dado estiver vazio
		if (doenca.isEmpty() ||
				doenca.isEmpty() ||
				data.equals("/  /") ||
				sintomas.isEmpty() ||
				idPaciente.isEmpty() ||
				idAtendente.isEmpty() ||
				idMedico.isEmpty()) {
			return "Por favor preencha todos os campos.";
		}
		
		/****************************************************/
		// Bloco para Determinar se algum Id é inválido
		/****************************************************/
		String erros = "";
		
		PacienteDAO pac = PacienteDAO.getPacientePorId(idPaciente);
		if(pac == null) {
			erros += "O id do paciente é inválido.\n";
		}
		
		AtendenteDAO at = AtendenteDAO.getAtendentePorId(idAtendente);
		if(at == null) {
			erros += "O id do atendente é inválido.\n";
		}
		
		MedicoDAO med = MedicoDAO.getMedicoPorId(idMedico);
		if(med == null) {
			erros += "O id do médico é inválido.\n";
		}
		
		if(!erros.isEmpty()) {
			return erros;
		}
		/****************************************************/
		// Fim do Bloco para Determinar se algum Id é inválido
		/****************************************************/
		
		// Caso esteja tudo certo, tentar inserir
		try {
			hist.inserir(doenca, data, sintomas, idPaciente, idAtendente, idMedico, examePdf);
		} catch(Exception e) { // Caso qualquer erro, mostrar.
			e.printStackTrace();
			return "Erro ao inserir consulta.";
		}
        return erros;
    }
}
