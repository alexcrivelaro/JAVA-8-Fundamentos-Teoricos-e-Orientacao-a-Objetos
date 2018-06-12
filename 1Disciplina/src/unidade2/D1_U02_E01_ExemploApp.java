package unidade2;

import javax.swing.JOptionPane;

public class D1_U02_E01_ExemploApp {

	public static void main(String[] args) {

		System.out.println("Mensagem 1");  // Exibido no console
		System.out.println("Mensagem 2");
		System.out.println("Mensagem 3");
		System.out.println("Mensagem 4");
		
		JOptionPane.showMessageDialog(null, "Mesnagem 1");  // Exibido no modo gráfico
		JOptionPane.showMessageDialog(null, "Mesnagem 2");
		JOptionPane.showMessageDialog(null, "Mesnagem 3");
		JOptionPane.showMessageDialog(null, "Mesnagem 4");
	}
}