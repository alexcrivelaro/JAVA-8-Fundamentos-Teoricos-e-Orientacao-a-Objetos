package unidade2;

import java.util.Scanner;

public class D1_U02_E04_Operadores {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		System.out.println("Digite o 1º valor");
		double numero1 = scn.nextDouble();
		System.out.println("Digite o 2º valor");
		double numero2 = scn.nextDouble();
		
		System.out.println("O 1º valor é maior que o 2º valor? " + (numero1 > numero2));
		System.out.println("O 1º valor é igual ao 2º valor? " + (numero1 == numero2));
		System.out.println("O 1º valor é menor que o 2º valor? " + (numero1 < numero2));
		
		double soma = numero1 + numero2;
		double subtracao = numero1 - numero2;
		double multiplicacao = numero1 * numero2;
		double divisao = numero1 / numero2;
		double modulo = numero1 % numero2;
		
		System.out.println("Soma = " + soma);
		System.out.println("Subtração = " + subtracao);
		System.out.println("Multiplicação = " + multiplicacao);
		System.out.println("Divisão = " + divisao);
		System.out.println("Módulo = " + modulo);
	}

}
