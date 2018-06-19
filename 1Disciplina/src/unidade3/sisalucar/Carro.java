/*------------------------------------*\
 Criação dos atributos da classe carro 
 Criação dos construtores 
 Adição do atributo Enum Revendedor   
\*------------------------------------*/

package unidade3.sisalucar;

public class Carro {
	
	long idCarro;
	String placa;
	String fabricate;
	String modelo;
	int ano;
	String cor;
	float valorDiaria;
	Revendedor revendedor;
	
	public Carro(long idCarro, String placa, String fabricate, String modelo, 
			int ano, String cor, float valorDiaria, Revendedor revendedor) {
		super(); // chama o construtor da super classe
		
		this.idCarro = idCarro;  // <this.idCarro> é o ATRIBUTO que vai receber a VARIÁVEL <idCarro>
		this.placa = placa;
		this.fabricate = fabricate;
		this.modelo = modelo;
		this.ano = ano;
		this.cor = cor;
		this.valorDiaria = valorDiaria;
		this.revendedor = revendedor;
	}
	
	public Carro() {  // criar o construtor vazio para receber objetos vazios!!!
	}
	
	public static void main(String[] args) {
		Carro carro1 = new Carro(1, "ABC-2001", "Volks", "Gol", 2013, "azul", 99.90f, Revendedor.EMANUELVEICULOS); 
		Carro carro2 = new Carro();   // objeto vazio
	}
}
