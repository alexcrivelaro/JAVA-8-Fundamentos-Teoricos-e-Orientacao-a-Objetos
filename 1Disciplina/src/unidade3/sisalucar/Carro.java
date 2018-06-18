/*------------------------------------*\
 Criação dos atributos da classe carro -------- Aula 41
 Criação dos construtores    
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
	
	public Carro(long idCarro, String placa, String fabricate, String modelo, int ano, String cor, float valorDiaria) {
		super(); // chama o construtor da super classe
		
		this.idCarro = idCarro;  // <this.idCarro> é o ATRIBUTO que vai receber a VARIÁVEL <idCarro>
		this.placa = placa;
		this.fabricate = fabricate;
		this.modelo = modelo;
		this.ano = ano;
		this.cor = cor;
		this.valorDiaria = valorDiaria;
	}
	
	public Carro() {  // criar o construtor vazio para receber objetos vazios!!!
	}
	
	public static void main(String[] args) {
		Carro carro1 = new Carro(1, "ABC-2001", "Volks", "Gol", 2013, "azul", 99.90f); 
		Carro carro2 = new Carro();   // objeto vazio
	}
}
