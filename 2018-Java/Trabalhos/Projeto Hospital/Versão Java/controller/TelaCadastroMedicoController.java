
package controller;

import DAO.MedicoDAO;

public class TelaCadastroMedicoController {
	
	// Método que define a ação do botão de cadastrar
	public String acaoBotaoCadastrar(String nome, String email, String crm, String cep, String bairro, String rua, String numero, String cidade, String nacionalidade, String senha, String confirmacaoSenha) throws Exception {
		// Se algum campo estiver vazio
		if (nome.isEmpty() || crm.equals(".   .   -") || cep.equals("-") || bairro.isEmpty() || rua.isEmpty() || numero.equals("nº") || nacionalidade.isEmpty() || senha.isEmpty() || confirmacaoSenha.isEmpty()) {
			return "Por favor preencha todos os campos";
		}
		
		// Se as senhas forem diferentes
        if (!senha.equals(confirmacaoSenha)) {
            return "As senhas são diferentes.";
        }
		
		// Caso esteja tudo certo, criar o médico.
        MedicoDAO novoMedico = new MedicoDAO(nome, email, crm, cep, bairro, rua, numero, cidade, nacionalidade, senha);
        String id = novoMedico.create();
        return "Cadastro efetuado com sucesso. Seu id de login é " + id;
    }
}
