package trabalho;

import javax.swing.JOptionPane;

public class Van extends Carro{
	private double valor;
	private boolean status;
	private String tipo;
	public double valor_aluguel;
	
	public Van(String placa, String modelo, String marca, double valor, String tipo) {
		super(placa, modelo, marca);
		this.valor = valor;
		this.tipo = tipo;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	private void setStatus() {
		if(status == true)
			status = false;
		if(status == false)
			status = true;
	}
	
	public boolean getStatus() {
		return status;
	}
	
	public double getvalor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public double aluguel(int dia) {
		valor_aluguel = valor * dia;
		setStatus();
		JOptionPane.showMessageDialog(null, "ALUGUEL NO VALOR DE " + valor_aluguel + " REAIS, VALIDO POR " + dia + " DIAS REALIZADO COM SUCESSO!");
		return valor_aluguel;
	}
	
	public String toString() {
		return "Carro tipo: " + tipo + super.toString();
	}
	
	public String dados() {
		return toString();
	}
}
