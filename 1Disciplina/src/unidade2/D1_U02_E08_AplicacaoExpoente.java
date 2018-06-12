package unidade2;

import java.util.Scanner;

public class D1_U02_E08_AplicacaoExpoente {

	public static void main(String[] args) {
		
		/*---------------------------------------------------------------------*\
		| Escreva um programa para gerar a seguinte série abaixo para os 50     |
		| primeiros termos.                                                     |      
		|    e^x = x^1   x^2   x^3                                              |
		|          --- + --- + --- ...											|
		|           1     2     3												|
	    \* --------------------------------------------------------------------*/

			double e = 0;
			
			Scanner scn = new Scanner(System.in);
			System.out.println("Digite o valor de x: ");
			double x = scn.nextDouble();
			
			for(int y = 1; y <= 50; y++)
				e = e + Math.pow(x, y)/y;
			
			System.out.printf("O valor de e(x)= %.2f",e);
	}
}
