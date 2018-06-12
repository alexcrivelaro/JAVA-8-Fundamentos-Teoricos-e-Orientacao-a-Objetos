package unidade2;

import javax.swing.JOptionPane;

public class D1_U02_E03_Faturamento {
	
	public static void main(String[] args) {
		
		double vendas_janeiro = Double.parseDouble(JOptionPane.showInputDialog("Favor informar as vendas de janeiro"));
		double vendas_fevereiro = Double.parseDouble(JOptionPane.showInputDialog("Favor informar as vendas de fevereiro"));
		double vendas_marco = Double.parseDouble(JOptionPane.showInputDialog("Favor informar as vendas de marco"));
		
		double faturamento = vendas_janeiro + vendas_fevereiro + vendas_marco;
		
		//System.out.println("O faturamento foi de R$ " + faturamento);
		JOptionPane.showMessageDialog(null, "O faturamento foi de : R$ " + faturamento);
	}
}