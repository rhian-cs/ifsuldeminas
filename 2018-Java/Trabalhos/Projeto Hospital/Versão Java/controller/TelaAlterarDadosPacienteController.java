
package controller;

import DAO.PacienteDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultListModel;

public class TelaAlterarDadosPacienteController {
    public String acaoBotaoAtualizar(String id, String nome, String email, String cpf, String cep, String bairro, String rua, String numero, String cidade, String nacionalidade, String senha, String confirmacaoSenha) throws Exception {
        // Se algum campo estiver vazio
		if (nome.isEmpty() || cpf.equals(".   .   -") || cep.equals("-") || bairro.isEmpty() || rua.isEmpty() || numero.equals("nº") || nacionalidade.isEmpty() || senha.isEmpty() || confirmacaoSenha.isEmpty()) {
                return "Por favor preencha todos os campos";
        }
		
		// Se as senhas não forem iguais
        if (!senha.equals(confirmacaoSenha)) {
            return "As senhas são diferentes.";
        }
		// Criar um objeto Paciente com os dados
        PacienteDAO novoPaciente = new PacienteDAO(nome, email, cpf, cep, bairro, rua, numero, cidade, nacionalidade, senha);
        novoPaciente.setId(id); // Deixar seu Id como está
        novoPaciente.update(); // Atualizar no banco de dados
        return "Atualização efetuada com sucesso.";
    }
    
	// Método que define o modelo e os dados da lista
    public static DefaultListModel selecionarUsuariosContratados() {
        DefaultListModel modLista = new DefaultListModel();
        
        PacienteDAO dao = new PacienteDAO();
        ResultSet resultado = dao.selecionarContratados();
        try {
            while(resultado.next()) {
                String nome = null;
                String id = null;
                nome = resultado.getString("nome");
                id = resultado.getString("id");
                modLista.addElement(id + ": " + nome);
            }
        } catch(SQLException e) {
            e.printStackTrace();
        }
        return modLista;
    }
}
