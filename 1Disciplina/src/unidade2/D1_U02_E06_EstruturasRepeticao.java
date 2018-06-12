package unidade2;

public class D1_U02_E06_EstruturasRepeticao {

	public static void main(String[] args) {
		
		int x = 0, y = 0, z = 0;
		
		while (x < 5) 
		{
			System.out.println("while = " + x);
			//x = x + 1;
			x++;
		}
		
		do
		{
			System.out.println("do while = " + y);
			//y = y + 1;
			y++;
		} while (y < 5);
		
		for(z = 0; z < 5; z++)
			System.out.println("for = " + z);
		
		int vetor[] = {1, 2, 3, 4, 5};
		
		for (int a: vetor)
			System.out.println("for estendido = " + a);
	}
}
