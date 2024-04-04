
package controller;

import DAO.AtendenteDAO;
import DAO.MedicoDAO;
import java.sql.SQLException;

public class TelaLoginController {
	
	// Método que define a ação do botão de entrar no sistema
    public String botaoEntrar(String id, String senha) throws SQLException {
        if (id.isEmpty() || senha.isEmpty()) { // Se as entradas forem nulas
            return "As entradas não podem ser nulas.";
        } else {
            boolean resultadoLogin = false;
            char tipoLoginFornecido = id.toUpperCase().charAt(0);
            switch(tipoLoginFornecido) { // Verificando qual o primeiro caracter, de modo case-insensitive
                case 'A':
                    resultadoLogin = new AtendenteDAO().autenticar(id, senha);
                    break;
                case 'M':
                    resultadoLogin = new MedicoDAO().autenticar(id, senha);
                    break;
                case 'P':
                    // É um paciente
                    return "Tipo de usuário inválido:\nPacientes não devem utilizar este sistema para login.";
                default:
                    // Tipo de login desconhecido
                    return "Tipo de usuário inválido.";
            }
			
			// Se o resultado do login for de sucesso, retornar o tipo de login fornecido. Caso contrário, retornar que ocorreu um erro.
            return resultadoLogin ? String.valueOf(tipoLoginFornecido) : "Erro de autenticação.";
        }
    }
}
