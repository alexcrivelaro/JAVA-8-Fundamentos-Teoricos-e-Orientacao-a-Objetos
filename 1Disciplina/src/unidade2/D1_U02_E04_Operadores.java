package unidade2;

import java.util.Scanner;

public class D1_U02_E04_Operadores {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Digite o 1� valor");
		double numero1 = scn.nextDouble();
		System.out.println("Digite o 2� valor");
		double numero2 = scn.nextDouble();
		
		System.out.println("O 1� valor � maior que o 2� valor? " + (numero1 > numero2));
		System.out.println("O 1� valor � igual ao 2� valor? " + (numero1 == numero2));
		System.out.println("O 1� valor � menor que o 2� valor? " + (numero1 < numero2));
		
		double soma = numero1 + numero2;
		double subtracao = numero1 - numero2;
		double multiplicacao = numero1 * numero2;
		double divisao = numero1 / numero2;
		double modulo = numero1 % numero2;
		
		System.out.println("Soma = " + soma);
		System.out.println("Subtra��o = " + subtracao);
		System.out.println("Multiplica��o = " + multiplicacao);
		System.out.println("Divis�o = " + divisao);
		System.out.println("M�dulo = " + modulo);
	}

}
