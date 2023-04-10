package trabalho;
import javax.swing.JOptionPane;

/**
 * Data 08/06/2021
 * @author Thiago Marcos da Silva
 * 
 * Classe Principal
 * Interface para o usuario, gravacao em arquivo
 *
 */
public class Principal{
	public static void main(String[] args) {
		int op = 1;
		
		String nome = (JOptionPane.showInputDialog("Digite o nome da locadora: "));
		int cnpj = Integer.parseInt(JOptionPane.showInputDialog("Digite o cnpj da locadora: "));
		int telefone = Integer.parseInt(JOptionPane.showInputDialog("Digite o telefone da locadora: "));
		Locadora locadora = new Locadora(nome, cnpj, telefone);
		
		while(op !=0){
			op = Integer.parseInt(JOptionPane.showInputDialog("O que deseja?\n1 - Realizar um cadastro;\n2 - Realizar uma consulta;\n3 - Realizar uma exclusao ou uma alteracao;\n4 - Ver os dados da locadora;\n5 - Alugar um carro;\n0 - Encerrar o programa;\n"));
			switch (op){
				case 1:
					int op1 = Integer.parseInt(JOptionPane.showInputDialog("Digite 1  para cadastrar um carro;\n2 para cadastrar um cliente"));
					if(op1 == 1) {
						String tipo = (JOptionPane.showInputDialog("Digite o tipo do carro (Luxo, Esportivo, Van ou Popular: "));
						String placa = (JOptionPane.showInputDialog("Digite a placa do carro: "));
						String marca = (JOptionPane.showInputDialog("Digite a marca do carro: "));
						String modelo = (JOptionPane.showInputDialog("Digite o modelo do carro: "));
						int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite valor/dia de locacao do carro: "));
						((Locadora)locadora).criaCarro(tipo, placa, marca, modelo, valor);
					break;
					}else if(op1 == 2) {
						String nome_cli = (JOptionPane.showInputDialog("Digite o nome do cliente: "));
						int cpf = Integer.parseInt(JOptionPane.showInputDialog("Digite o CPF do cliente: "));
						int cnh = Integer.parseInt(JOptionPane.showInputDialog("Digite a CNH do cliente: "));
						int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do cliente: "));
						int telefone_cli = Integer.parseInt(JOptionPane.showInputDialog("Digite o telefone do cliente: "));
						((Locadora)locadora).criaCliente(nome_cli, cpf, cnh, idade, telefone_cli);
					}
					break;
				case 2:
					int op2 =  Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para consultar um carro; 2 para consultar um cliente; 3 para ver a lista de carros; 4 para ver a lista de clientes"));
					if(op2 == 1) {
						String modelo = JOptionPane.showInputDialog("Digite o modelo do carro a ser consultado: ");
						((Locadora)locadora).consultarCarro(modelo);
					}else if(op2 == 2) {
						int cpf = Integer.parseInt(JOptionPane.showInputDialog("Digite o CPF do cliente a ser consultado: "));
						((Locadora)locadora).consultaCliente(cpf);
					}else if(op2 == 3) {
						String opcao = JOptionPane.showInputDialog("Digite qual lista a ser mostrada (Total, Luxo, Esportivo, Van, Popular): ");
						if(opcao.equals("Total"))
							((Locadora)locadora).listaCarros();
						if(opcao.equals("Luxo"))
							((Locadora)locadora).listaCarroLuxo();
						if(opcao.equals("Esportivo"))
							((Locadora)locadora).listaCarroEsport();
						if(opcao.equals("Van"))
							((Locadora)locadora).listaVan();
						if(opcao.equals("Popular"))
							((Locadora)locadora).listaCarroPop();
					}else if(op2 == 4) {
						((Locadora)locadora).listaCliente();
					}
					break;
				case 3:
					int op3 = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para excluir um carro; 2 para excluir um cliente; 3 para alterar um carro; 4 para alterar um cliente"));
					if(op3 == 1) {
						String modelo = JOptionPane.showInputDialog("Digite o modelo do carro a ser excluido: ");
						((Locadora)locadora).removerCarro(modelo);
					}else if(op3 == 2) {
						int cpf = Integer.parseInt(JOptionPane.showInputDialog("Digite o CPF do cliente a ser excluido: "));
						((Locadora)locadora).removerCliente(cpf);
					}else if(op3 == 3) {
						String modelo = JOptionPane.showInputDialog("Digite o modelo do carro a ser alterado: ");
						String tipo = JOptionPane.showInputDialog("Digite o tipo do carro a ser alterado: ");
						double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de locacao do carro a ser alterado: "));
						((Locadora)locadora).alteraCarro(modelo, tipo, valor);
					}else if(op3 == 4) {
						String nome_cli = (JOptionPane.showInputDialog("Digite o nome do cliente a ser alterado: "));
						int cpf = Integer.parseInt(JOptionPane.showInputDialog("Digite o CPF do cliente a ser alterado: "));
						int cnh = Integer.parseInt(JOptionPane.showInputDialog("Digite a CNH do cliente a ser alterado: "));
						int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do cliente a ser alterado: "));
						int telefone_cli = Integer.parseInt(JOptionPane.showInputDialog("Digite o telefone do cliente a ser alterado: "));
						((Locadora)locadora).alterarCli(nome_cli, cpf, cnh, idade, telefone_cli);
					}
					break;
				case 4:
						((Locadora)locadora).toString();
					break;
				case 5:
					String tipo = JOptionPane.showInputDialog("Digite o tipo do carro a ser alugado: ");
					int n_dia = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de dias do aluguel: "));
						((Locadora)locadora).Locacao(tipo, n_dia);
					break;
				case 0:
					Arq arq = new Arq();
					arq.Escreve_Arq();
					arq.Mostra_Dados();
					break;
			}
		}
	}

}
