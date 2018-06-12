package unidade2;

public class D1_U02_E09_AplicacaoFibonacci {

	public static void main(String[] args) {
		
		/*---------------------------------------------------------------------*\
		|Escreva um programa para gerar os 20 primeiro termos da série de		|		
		|Fibonacci , sendo que F(n) = F(n-1)+F(n-2) e F(1)=F(2)=1. 				|
		|Também calcule a sua média.											|
		|F(n) = 1,1,2,3,5,...				usando array						|
	    \* --------------------------------------------------------------------*/

		int anterior1 = 1;
		int anterior2 = 1;
		int calculado = anterior1 + anterior2;
		int soma = anterior1 + anterior2 + calculado;
		System.out.print(anterior1 + ", " + anterior2 + ", " + calculado + ", ");
		
		for (int i=4; i <=20; i++)
		{
			anterior1 = anterior2;
			anterior2 = calculado;
			calculado = anterior1 + anterior2;
			soma = soma + calculado;
			System.out.print(calculado + ", ");
		}
		double media = soma / 20;
		System.out.println("\nA média é: " + media);
	}
}