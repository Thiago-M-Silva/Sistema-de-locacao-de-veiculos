package trabalho;

public class Cliente{
	private int cpf, cnh, idade, telefone;
	private String nome;
	
	public Cliente(String nome, int cpf, int cnh, int idade, int telefone) {
		this.cnh = cnh;
		this.cpf = cpf;
		this.idade = idade;
		this.nome = nome;
		this.telefone = telefone;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	public void setCnh(int cnh) {
		this.cnh = cnh;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}
	
	public int getCpf() {
		return cpf;
	}
	
	public int getCnh() {
		return cnh;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public int getTelefone() {
		return telefone;
	}
	
	public void alteraCliente(String nome, int cpf, int cnh, int idade, int telefone) {
		setNome(nome);
		setCpf(cpf);
		setCnh(cnh);
		setIdade(idade);
		setTelefone(telefone);
	}
	public String toString() {
		return "Nome: " + nome + " \nCPF: " + cpf + " \nCNH: " + cnh + " \n Idade: " + idade + " \nTelefone: " + telefone;
	}
}
