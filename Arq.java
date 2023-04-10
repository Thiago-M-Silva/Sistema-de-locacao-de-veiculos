package trabalho;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class Arq {
	private Locadora loc;
	
	public void Escreve_Arq(){
	//escrevendo os dados da locadora em arq
		try {
			FileOutputStream dados = new FileOutputStream("dados.txt");
			PrintWriter pr = new PrintWriter("dados");
		
			pr.println(loc.toString());
			pr.close();
			dados.close();
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao escrever o arquivo\n");
		}
	}
//==========================================================================================
	public void Mostra_Dados() {
		//ler os dados do arquivo
		try {
			FileInputStream dados = new FileInputStream("dados.txt");
			InputStreamReader input = new InputStreamReader(dados);
			BufferedReader buf = new BufferedReader(input);
			
			String linha;
		do {
			linha = buf.readLine();
			if(linha != null)
				System.out.println(linha);
		}while(linha != null);
			dados.close();
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Erro ao ler o arquivo\n");
		}
	}
}