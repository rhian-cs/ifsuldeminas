/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.AtendenteDAO;
import DAO.PacienteDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author 14171000125
 */
public class TelaExcluirPacienteController {
	
	// Método para excluir um paciente
    public static String botaoExcluir(String id) {
        PacienteDAO fnc = PacienteDAO.getPacientePorId(id);
        
        String[] opcoes = {"Sim", "Não"};
        
		// Confirmação se deseja excluir o paciente
        int resposta = JOptionPane.showOptionDialog(null,
            "Tem certeza de que deseja excluir este Paciente?",
            "Demissão de Paciente",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.WARNING_MESSAGE,
            null,
            opcoes,
            null);
        
		// Se a resposta for sim
        if(resposta == 0) {
			// Verificar o Id e a Senha do Atendente
            String idLogin = JOptionPane.showInputDialog("Digite seu id de login.");
            String senhaLogin = JOptionPane.showInputDialog("Digite sua senha de login.");
            
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
                if(atendenteEncontrado) {
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
