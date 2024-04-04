
package controller;

import DAO.PacienteDAO;

public class TelaCadastroPacienteController {
	
	// Método que define a ação do botão de cadastrar
    public String acaoBotaoCadastrar(String nome, String email, String cpf, String cep, String bairro, String rua, String numero, String cidade, String nacionalidade, String senha, String confirmacaoSenha) throws Exception {
        // Se algum campo estiver vazio
		if (nome.isEmpty() || cpf.equals(".   .   -") || cep.equals("-") || bairro.isEmpty() || rua.isEmpty() || numero.equals("nº") || nacionalidade.isEmpty() || senha.isEmpty() || confirmacaoSenha.isEmpty()) {
                return "Por favor preencha todos os campos";
        }
		
		// Se as senhas forem diferentes
        if (!senha.equals(confirmacaoSenha)) {
            return "As senhas são diferentes.";
        }
		
		// Caso esteja tudo certo, criar o paciente.
        PacienteDAO novoPaciente = new PacienteDAO(nome, email, cpf, cep, bairro, rua, numero, cidade, nacionalidade, senha);
        String id = novoPaciente.create();
        return "Cadastro efetuado com sucesso. Seu id de login é " + id;
    }
}
