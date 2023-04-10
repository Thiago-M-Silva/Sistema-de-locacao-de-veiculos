package trabalho;

public abstract class Carro {
	private String placa;
	private String modelo;
	private String marca;
	
	public Carro(String placa, String modelo, String marca) {
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
	}
	
	public abstract double aluguel(int dia);
	public abstract String dados();
	
	public String getModelo() {
		return modelo;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public String getPlaca() {
		return placa;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public void alteraCarro(String modelo, String marca, String placa) {
		setModelo(modelo);
		setMarca(marca);
		setPlaca(placa);
	}
	
	public String toString() {
		return "\nPlaca: " + placa + "\nMarca: " + marca + "\nModelo: " + modelo;
	}
}
