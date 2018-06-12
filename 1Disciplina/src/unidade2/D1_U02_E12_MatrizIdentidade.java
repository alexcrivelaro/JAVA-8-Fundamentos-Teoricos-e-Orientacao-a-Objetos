/*--------------------------------------------------------------------------*\
  Construa uma matriz Identidade I=3 (apenas os valores diagonais são = 1).
  Todos os outros são 0.    
\* -------------------------------------------------------------------------*/

package unidade2;

public class D1_U02_E12_MatrizIdentidade {

	public static void main(String[] args) {
		int matriz[][] = new int[3][3];
		
		for(int x = 0; x<=2; x++)
			for(int y = 0; y<=2; y++)
			{
				if (x != y)
					matriz[x][y] = 0;
				else
					matriz[x][y] = 1;
			}
		for(int x = 0; x<=2; x++)
		{
			for(int y = 0; y<=2; y++)
			{
				System.out.print(matriz[x][y]);
			}
			System.out.println("");
		}
	}
}
