/*--------------------------------------------------------------------------*\
 Cria��o das classes e do programa principal SisalucarApp     
\* -------------------------------------------------------------------------*/

package unidade3.sisalucar;

public class SisalucarApp {

	public static void main(String[] args) {
		
		Carro carro1 = new Carro();
		Carro carro2 = new Carro();
		
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();
	
	/* <tipo> <nome> = <cria��o do objeto>	
	 *
     * Carro       - Tipo da vari�vel que � uma classe
     * carro1      - Nome da classe
     * new Carro() - instancia��o da classe
     *               ou cria��o do objeto
     *               (valores que ser�o armazenados no objeto 
     * */
    
		System.out.println(carro1);   // imprime o local da mem�ria
		System.out.println(carro2);   // imprime o local da mem�ria
		System.out.println(cliente1); // imprime o local da mem�ria
		System.out.println(cliente2); // imprime o local da mem�ria
	}
}


