/*--------------------------------------------------------------------------*\
 Cria��o das classes e do programa principal SisalucarApp   
 Atribui��o de valores aos objetos das classes  
\* -------------------------------------------------------------------------*/

package unidade3.sisalucar;

public class SisalucarApp {

	public static void main(String[] args) {
		
		Carro carro1 = new Carro(); // 1� objeto carro
		carro1.idCarro = 1;
		carro1.modelo = "gol";
		carro1.placa = "jdk-0001";
		carro1.cor = "azul";
		carro1.ano = 2015;
		carro1.fabricate = "volkswagen";
		
		Carro carro2 = new Carro(); // 2� objeto carro
		
		
		Cliente cliente1 = new Cliente();
		cliente1.idCliente = 1;
		cliente1.cpf = "123456789-00";
		cliente1.nome = "Jo�o Pedro";
		cliente1.cnh = "XYZ0001";
		
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
	
	public void realizarLocacao(long idCarro, long idCliente) {
		Locacao locacao = new Locacao();
		locacao.idLocacao = 1;
		locacao.idCarro = idCarro;
		locacao.idCliente = idCliente;
	}
}


