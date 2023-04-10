package trabalho;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * Classe Locadora
 * Instancia veiculos e clientes
 * Realiza as operacoes de insercao, exclusao, consulta e listagem
 * 
 */
public class Locadora extends Fabrica{
	private String nome;
	private int cnpj, telefone;
	private Carro carro; //veiculos
	private Cliente cliente;
	
	ArrayList<Carro>veiculo = new ArrayList<Carro>();
	ArrayList<Carro>luxo = new ArrayList<Carro>();
	ArrayList<Carro>pop = new ArrayList<Carro>();
	ArrayList<Carro>van = new ArrayList<Carro>();
	ArrayList<Carro>esporte = new ArrayList<Carro>();
	ArrayList<Cliente>cli = new ArrayList<Cliente>();
	
	public Locadora(String nome, int cnpj, int telefone) {
		this.telefone = telefone;
		this.nome = nome;
		this.cnpj = cnpj;
	}
	
//=============================================================================================================
	//funcao para criar cliente e o adicionar à lista
	public Cliente criaCliente(String nome, int cpf, int cnh, int idade, int telefone) {
		cli.add(new Cliente(nome, cpf, cnh, idade, telefone));
		return new Cliente(nome, cpf, cnh, idade, telefone);
	}
	
//=============================================================================================================
	//funcao para remover cliente
	public void removerCliente(int cpf) {
		for(int i = 0; i < cli.size(); i++) {
			Cliente cliente = cli.get(i);
			if(cliente.getCpf() == cpf)
				cli.remove(cliente);
		}
	}
//=============================================================================================================
	//funcao para listar os clientes
	public void listaCliente() {
		try {
			if(cli.size() == 0)
				throw new Exception("Erro: Lista Vazia\n"); 
			for(int i = 0; i<cli.size(); i++)
				JOptionPane.showMessageDialog(null, cli.get(i));
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Ocorreu um erro\n");
		}
	}
//=============================================================================================================
	//funcao para consultar os clientes
	public void consultaCliente(int cpf) {
		try {
			if(cli.size() == 0)
				throw new Exception("Erro: Lista Vazia\n");
			for(int i = 0; i < cli.size(); i++) {
				Cliente cliente = cli.get(i);
				if(cliente.getCpf() == cpf)
					JOptionPane.showMessageDialog(null, cli.get(i));
			}
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Ocorreu um erro\n");
		}
	}
//=============================================================================================================
	//funcao para alterar os clientes
	public void alterarCli(String nome, int cpf, int cnh, int idade, int telefone) {
		try {
			if(cli.size() == 0)
				throw new Exception("Erro: Lista Vazia\n");
			for(int i = 0; i < cli.size(); i++) {
				Cliente cliente = cli.get(i);
				if(cliente.getCpf() == cpf)
					cliente.alteraCliente(nome, cpf, cnh, idade, telefone);
			}
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Ocorreu um erro\n");
		}
	}
//=============================================================================================================
	//implementacao de um factory metod para a criacao dos carros e insercao em lista
	public Carro criaCarro(String tipo, String placa, String modelo, String marca, int valor) {		
		if(tipo.equals("Luxo")) {
			veiculo.add(new Carro_Luxo(placa, modelo, marca, valor, tipo));
			luxo.add(new Carro_Luxo(placa, modelo, marca, valor, tipo));
			return new Carro_Luxo(placa, modelo, marca, valor, tipo);
		}
		if(tipo.equals("Esportivo")) {
			veiculo.add(new Carro_Esportivo(placa, modelo, marca, valor, tipo));
			esporte.add(new Carro_Esportivo(placa, modelo, marca, valor, tipo));
			return new Carro_Esportivo(placa, modelo, marca, valor, tipo);
		}
		if(tipo.equals("Van")) {
			veiculo.add(new Van(placa, modelo, marca, valor, tipo));
			van.add(new Van(placa, modelo, marca, valor, tipo));
			return new Van(placa, modelo, marca, valor, tipo);
		}
		if(tipo.equals("Popular")) {
			veiculo.add(new Carro_Popular(placa, modelo, marca, valor, tipo));
			pop.add(new Carro_Popular(placa, modelo, marca, valor, tipo));
			return new Carro_Popular(placa, modelo, marca, valor, tipo);
		}
		return null;
	}
//==============================================================================================================
	//funcao para listar os carros
	public void listaCarros() {
		try{
			if(veiculo.size() == 0)
				throw new Exception("Erro: Lista vazia\n");
			for(int i = 0; i < veiculo.size(); i++)
				JOptionPane.showMessageDialog(null, veiculo.get(i));
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Ocorreu um erro\n");
		}
	}
	
	public void listaCarroLuxo() {
		try{
			if(luxo.size() == 0)
				throw new Exception("Erro: Lista vazia\n");
			for(int i = 0; i < luxo.size(); i++)
				JOptionPane.showMessageDialog(null, luxo.get(i));
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Ocorreu um erro\n");
		}
	}

	public void listaCarroEsport() {
		try{
			if(esporte.size() == 0)
				throw new Exception("Erro: Lista vazia\n");
			for(int i = 0; i < esporte.size(); i++)
				JOptionPane.showMessageDialog(null, esporte.get(i));
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Ocorreu um erro\n");
		}
	}

	public void listaCarroPop() {
		try{
			if(pop.size() == 0)
				throw new Exception("Erro: Lista vazia\n");
			for(int i = 0; i < pop.size(); i++)
				JOptionPane.showMessageDialog(null, pop.get(i));
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Ocorreu um erro\n");
		}
	}

	public void listaVan() {
		try{
			if(van.size() == 0)
				throw new Exception("Erro: Lista vazia\n");
			for(int i = 0; i < van.size(); i++)
				JOptionPane.showMessageDialog(null, van.get(i));
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Ocorreu um erro\n");
		}
	}
//==============================================================================================================	
	//funcao de remover um veiculo
	public void removerCarro(String modelo) {
		try{
			if(veiculo.size() == 0)
				throw new Exception("Erro: Lista vazia\n");
			for(int i = 0; i < veiculo.size(); i++) {
				Carro car = veiculo.get(i);
				if(car.getModelo().equals(modelo))
					veiculo.remove(car);
			}
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Ocorreu um erro\n");
		}
	}
//==============================================================================================================
	//funcao de consultar um veiculo
	public void consultarCarro(String modelo) {
		try {
			if(veiculo.size() == 0)
				throw new Exception("Erro: Lista vazia/n");
			for(int i = 0; i < veiculo.size(); i++) {
				Carro car = veiculo.get(i);
				if(car.getModelo().equals(modelo))
					JOptionPane.showMessageDialog(null, car.dados());
			}
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Ocorreu um erro\n");
		}
	}
//==============================================================================================================
	//funcao para alterar as informacoes de um carro
	public void alteraCarro(String modelo, String tipo, double valor) {
		try {
			if(veiculo.size() == 0)
				throw new Exception("Erro: Lista vazia\n");
			for(int i = 0; i < veiculo.size(); i++) {
				Carro car = veiculo.get(i);
				if(tipo.equals("Luxo"))
					if(car.getModelo().equals(modelo)) {
						car.alteraCarro(car.getModelo(), car.getMarca(), car.getPlaca());
						((Carro_Luxo)car).setValor(valor);
					}
				if(tipo.equals("Esportivo"))
					if(car.getModelo().equals(modelo)) {
						car.alteraCarro(car.getModelo(), car.getMarca(), car.getPlaca());
						((Carro_Esportivo)car).setValor(valor);
					}
				if(tipo.equals("Van"))
					if(car.getModelo().equals(modelo)) {
						car.alteraCarro(car.getModelo(), car.getMarca(), car.getPlaca());
						((Van)car).setValor(valor);
					}
				if(tipo.equals("Popular"))
					if(car.getModelo().equals(modelo)) {
						car.alteraCarro(car.getModelo(), car.getMarca(), car.getPlaca());
						((Carro_Popular)car).setValor(valor);
					}
			}
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Ocorreu um erro\n");
		}
	}
//==============================================================================================================
	//funcao que realiza a locacao de um carro
	public void Locacao(String tipo, int n_dia) {
		if(tipo.equals("Luxo")) 
			((Carro_Luxo)carro).aluguel(n_dia);
		if(tipo.equals("Esportivo"))
			((Carro_Esportivo)carro).aluguel(n_dia);
		if(tipo.equals("Van"))
			((Van)carro).aluguel(n_dia);
		if(tipo.equals("Popular"))
			((Carro_Popular)carro).aluguel(n_dia);
	}
	
//==============================================================================================================
	public String toString() {
		return "Locadora " + nome + "\nCNPJ: " + cnpj + "\nTelefone: " + telefone + 
				"\n\nDADOS DOS CARROS:\n\n" + carro.toString() + "\n\nDADOS DOS CLIENTES:\n\n" + cliente.toString();
	}
}
