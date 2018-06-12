package unidade2;

public class D1_U02_E10_VetorApp {

	public static void main(String[] args) {
		
		/*---------------------------------------------------------------------*\
		|Escreva um programa para gerar os 20 primeiro termos da série de		|		
		|Fibonacci , sendo que F(n) = F(n-1)+F(n-2) e F(1)=F(2)=1. 				|
		|Também calcule a sua média.											|
		|F(n) = 1,1,2,3,5,...				Agora usando vetor.					|
	    \* --------------------------------------------------------------------*/	
		
		// Vetor de tipos primitivos
		System.out.println("Vetor de tipos primitivos - Fibonacci");
		int fibo[] = new int[20];
		
		fibo[0]=1;
		fibo[1] = fibo[0];
		fibo[2] = fibo[0] + fibo[1];
		
		for(int i=3; i<20; i++) 
			fibo[i] = fibo[i-1] + fibo[i-2];
		
		for(int f: fibo)
			System.out.print(f + ", ");
		
		// Vetor de objetos - String
		System.out.println("\n\nVetor de objetos - String");
		String vetor[] = new String[10];
		vetor[0] = new String("Antonio");
		vetor[1] = new String("Pedro");
		
		for (String z: vetor)
			System.out.print(z + ", ");
		
		// Vetor de matrizes
		System.out.println("\n\nVetor de matrizes");
		int matriz[][] = new int[3][3];
		matriz[0][0] = 100;
		
	}
}
