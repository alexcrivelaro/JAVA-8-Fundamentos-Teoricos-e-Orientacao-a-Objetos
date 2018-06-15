/*--------------------------------------------------------------------------*\
 Criação das classes e do programa principal SisalucarApp   
 Atribuição de valores aos objetos das classes  
\* -------------------------------------------------------------------------*/

package unidade3.sisalucar;

public class SisalucarApp {

	public static void main(String[] args) {
		
		Carro carro1 = new Carro(); // 1º objeto carro
		carro1.idCarro = 1;
		carro1.modelo = "gol";
		carro1.placa = "jdk-0001";
		carro1.cor = "azul";
		carro1.ano = 2015;
		carro1.fabricate = "volkswagen";
		
		Carro carro2 = new Carro(); // 2º objeto carro
		
		
		Cliente cliente1 = new Cliente();
		cliente1.idCliente = 1;
		cliente1.cpf = "123456789-00";
		cliente1.nome = "João Pedro";
		cliente1.cnh = "XYZ0001";
		
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
	
	public void realizarLocacao(long idCarro, long idCliente) {
		Locacao locacao = new Locacao();
		locacao.idLocacao = 1;
		locacao.idCarro = idCarro;
		locacao.idCliente = idCliente;
	}
}


