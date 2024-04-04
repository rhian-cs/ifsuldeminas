
package controller;

import DAO.MedicoDAO;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultListModel;

public class TelaAlterarDadosMedicoController {
    public String acaoBotaoAtualizar(String id, String nome, String email, String crm, String cep, String bairro, String rua, String numero, String cidade, String nacionalidade, String senha, String confirmacaoSenha) throws Exception {
		// Se algum campo estiver vazio
        if (nome.isEmpty() || crm.equals(".   .   -") || cep.equals("-") || bairro.isEmpty() || rua.isEmpty() || numero.equals("nº") || nacionalidade.isEmpty() || senha.isEmpty() || confirmacaoSenha.isEmpty()) {
                return "Por favor preencha todos os campos";
        }
		
		// Se as senhas não forem iguais
        if (!senha.equals(confirmacaoSenha)) {
            return "As senhas são diferentes.";
        }
		// Criar um objeto Medico com os dados
        MedicoDAO novoMedico = new MedicoDAO(nome, email, crm, cep, bairro, rua, numero, cidade, nacionalidade, senha);
        novoMedico.setId(id); // Deixar seu Id como está
        novoMedico.update(); // Atualizar no banco de dados
        return "Atualização efetuada com sucesso.";
    }
    
	// Método que define o modelo e os dados da lista
    public static DefaultListModel selecionarUsuariosContratados() {
        DefaultListModel modLista = new DefaultListModel();
        
        MedicoDAO dao = new MedicoDAO();
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
