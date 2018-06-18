/*--------------------------------------*\
 Criação dos atributos da classe cliente  
 Criação dos construtores   
\*--------------------------------------*/

package unidade3.sisalucar;

public class Cliente {

	long idCliente;
	String cpf;
	String nome;
	String cnh;
	
	public Cliente(long idCliente, String cpf, String nome, String cnh) {
		super();
		this.idCliente = idCliente;
		this.cpf = cpf;
		this.nome = nome;
		this.cnh = cnh;
	}
	
	public Cliente() {
	}
	
	
}
