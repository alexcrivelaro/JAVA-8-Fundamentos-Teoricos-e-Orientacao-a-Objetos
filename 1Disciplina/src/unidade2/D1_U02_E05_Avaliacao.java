package unidade2;

import javax.swing.JOptionPane;

public class D1_U02_E05_Avaliacao {

	public static void main(String[] args) {
		
		double nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota: "));
		
		//intervalo de nota válida - 0 a 100
		if ((nota < 0) || (nota > 100))
		{
			JOptionPane.showMessageDialog(null, "Noata inválida! Digite uma nota entre 0 e 100");
			main(null); // recursividade
		}
		else
		{
			if (nota < 50)
				JOptionPane.showMessageDialog(null,  "Conceito: Insuficiente");
			else if (nota < 70)
				JOptionPane.showMessageDialog(null,  "Conceito: Regular");
			else if (nota < 90)
				JOptionPane.showMessageDialog(null,  "Conceito: Bom");
			else 
				JOptionPane.showMessageDialog(null,  "Conceito: Excelente");
		}
	}
}