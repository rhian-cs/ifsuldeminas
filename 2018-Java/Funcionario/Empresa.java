
import java.util.ArrayList;
import java.util.Scanner;

public class Empresa {
	public ArrayList<Funcionario> funcs;
	
	public Empresa() {
		funcs = new ArrayList();
	}
	
	// Método main para a questão Desafio
	public static void main(String[] args) {
		Empresa emp = new Empresa();
		
		Scanner s = new Scanner(System.in);
		int opcao;
		String cadastroNome;
		double cadastroSalario;
		double gastoSalarioTotal = 0;
		double gastoBonificacaoTotal = 0;
		
		// Fazer isso até a opção selecionada for 0
		System.out.println("Boas vindas à empresa!");
		while(true) {
			System.out.println("Opções:");
			System.out.println("0 - Sair");
			System.out.println("1 - Cadastrar um Funcionário Gerente");
			System.out.println("2 - Cadastrar um Funcionário Diretor");
			System.out.println("3 - Listar os Funcionários");
			System.out.println("4 - Mostrar gasto total da empresa com o salário dos funcionários");
			System.out.println("5 - Mostrar gasto total da empresa com a bonificação dos funcionários");
			opcao = s.nextInt();
			switch(opcao) {
				case 0:
					// Não fazer nada
					break;
				case 1: // Cadastrar um Gerente
					System.out.println("Digite o nome do funcionário:");
					cadastroNome = s.next();
					
					System.out.println("Digite o salário do funcionário");
					cadastroSalario = s.nextDouble();
					
					emp.funcs.add(new Gerente(cadastroNome, cadastroSalario));
					break;
				case 2: // Cadastrar um Diretor
					System.out.println("Digite o nome do funcionário:");
					cadastroNome = s.next();
					
					System.out.println("Digite o salário do funcionário");
					cadastroSalario = s.nextDouble();
					
					emp.funcs.add(new Diretor(cadastroNome, cadastroSalario));
					break;
				case 3: // Listar os Funcionários
					if(emp.funcs.size() > 0) {
						System.out.println("Esta empresa possui " + emp.funcs.size() + " funcionários, estes sendo:");
						for (int i = 0; i < emp.funcs.size(); i++) {
							Funcionario funcionario = emp.funcs.get(i);
							funcionario.exibirFuncionario();
						}
					}
					else {
						System.out.println("Esta empresa não possui nenhum funcionário. Adicione um funcionário para mostrar suas informações.");
					}
					
					break;
				case 4: // Mostrar gasto total da empresa com o salário dos funcionários
					for (int i = 0; i < emp.funcs.size(); i++) {
						Funcionario funcionario = emp.funcs.get(i);
						gastoSalarioTotal += funcionario.getSalario();
					}
					System.out.println("O gasto total com salários de funcionários é de " + gastoSalarioTotal);
					break;
				case 5: // Mostrar gasto total da empresa com a bonificação dos funcionários
					for (int i = 0; i < emp.funcs.size(); i++) {
						Funcionario funcionario = emp.funcs.get(i);
						gastoBonificacaoTotal += funcionario.getBonificacao();
					}
					System.out.println("O gasto total com bonificações de funcionários é de " + gastoBonificacaoTotal);
					break;
				default:
					System.out.println("Opção Inválida");
					break;
			}
			if (opcao == 0) { // Se a opção for 0
				break; // Parar o laço
			}
		}
	}
}
