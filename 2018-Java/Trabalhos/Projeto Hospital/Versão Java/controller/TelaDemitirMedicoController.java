
package controller;

import DAO.AtendenteDAO;
import DAO.MedicoDAO;
import javax.swing.JOptionPane;

public class TelaDemitirMedicoController {
	
	// Método que define a ação do botão de demitir
    public static String botaoDemitir(String id) {
		
		// Criando um paciente baseado no Id especificado
        MedicoDAO fnc = MedicoDAO.getMedicoPorId(id);
        
        String[] opcoes = {"Sim", "Não"};
        
		// Pergunta se o atendente deseja demitir este funcionário
        int resposta = JOptionPane.showOptionDialog(null,
            "Tem certeza de que deseja demitir este Médico?",
            "Demissão de Médico",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.WARNING_MESSAGE,
            null,
            opcoes,
            null);

		// Se a resposta for sim
        if(resposta == 0) {
			// Pedir o Id e a Senha do atendente
            String idLogin = JOptionPane.showInputDialog("Digite seu id de login.");
            String senhaLogin = JOptionPane.showInputDialog("Digite sua senha de login.");
            
			// Se os campos não estiverem vazios
            if (!(idLogin.isEmpty() || idLogin.isEmpty())) {
                AtendenteDAO atendente = AtendenteDAO.getAtendentePorId(idLogin.toUpperCase());
                
                boolean atendenteEncontrado = false;
                try {
                    System.out.println(atendente.equals(""));
                    atendenteEncontrado = true;
                }
                catch (NullPointerException e) {
                    System.out.println("Erro no controller: Atendente não encontrado.");
                    return "Atendente não encontrado.";
                } 
				
				// Se o atendente for encontrado
                if(atendenteEncontrado) {
					// Verificar a senha
                    boolean sucessoLogin = atendente.autenticar(senhaLogin);

                    if (sucessoLogin) {
                        fnc.demitir();
                        return "";
                    } 
                }
                
            }
            return "Erro de autenticação.";
        } else {
            return "A operação foi cancelada pelo usuário.";
        }
    }
}
