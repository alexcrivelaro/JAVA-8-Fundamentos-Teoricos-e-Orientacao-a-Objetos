/*--------------------------------------------------------------------------*\
 Criação das classes e do programa principal SisalucarApp     
\* -------------------------------------------------------------------------*/

package unidade3.sisalucar;

public class SisalucarApp {

	public static void main(String[] args) {
		
		Carro carro1 = new Carro();
		Carro carro2 = new Carro();
		
		Cliente cliente1 = new Cliente();
		Cliente cliente2 = new Cliente();
	
	/* <tipo> <nome> = <criação do objeto>	
	 *
     * Carro       - Tipo da variável que é uma classe
     * carro1      - Nome da classe
     * new Carro() - instanciação da classe
     *               ou criação do objeto
     *               (valores que serão armazenados no objeto 
     * */
    
		System.out.println(carro1);   // imprime o local da memória
		System.out.println(carro2);   // imprime o local da memória
		System.out.println(cliente1); // imprime o local da memória
		System.out.println(cliente2); // imprime o local da memória
	}
}


