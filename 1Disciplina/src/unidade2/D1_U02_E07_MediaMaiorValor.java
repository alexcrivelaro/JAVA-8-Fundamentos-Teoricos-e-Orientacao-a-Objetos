package unidade2;

import java.util.Scanner;

public class D1_U02_E07_MediaMaiorValor {

	public static void main(String[] args) {
		
	/*---------------------------------------------------------------------*\
	| Escreva um programa para calcular a m�dia aritm�tica, maior e menor   |
    | valores de um conjunto de valores inteiros positivos.                 |
    | - Observa��o: considere o valor (-1) como finalizador.                |
    \* --------------------------------------------------------------------*/

		Scanner scn = new Scanner(System.in);
		System.out.println("Digite o valor ");
		int valor = scn.nextInt();
		int maior, menor;
		menor = maior = valor;
		double media = 0, soma = 0;
		int numeros = 0;
		
		while (valor != -1)
		{
			soma = soma + valor;
			numeros++;
			if (valor > maior)
				maior = valor;
			else if (valor < menor)
				menor = valor;
			System.out.println("Digite o valor ");
			valor = scn.nextInt();
		}
		media = soma / numeros;

		System.out.println("O maior valor �: " + maior);
		System.out.println("O menor valor �: " + menor);
		System.out.printf("M�dia = %.2f", media);
	}
}
