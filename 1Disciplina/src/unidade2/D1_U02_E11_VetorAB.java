
/*---------------------------------------------------------------------*\
|Escreva um programa que leia um vetor A de 50 elementos, construa e	|
|imprima outro vetor B da seguinte forma:								|
|	- Os elementos de ordem par são correspondentes a (2*A);			|
|	- Os elementos de ordem ímpar são correspondentes a (A/2).			|										|
\* --------------------------------------------------------------------*/

package unidade2;

public class D1_U02_E11_VetorAB {

	public static void main(String[] args) {
		int A[] = new int[50];
		int B[] = new int[50];
		
		for (int i=0; i<50; i++)
		{
			A[i] = i;
			
			if (i%2 == 0)  // resto da divisão por 2 é zero (Par)
				B[i] = 2*A[i];
			else // é impar
				B[i] = A[i]/2;
		}
		
		
		for(int a: A)
			System.out.print(a + ", ");

		System.out.println("\n---------------------------------------------------------------------"); 
		for(int b: B)
			System.out.print(b + ", ");
	}
}
