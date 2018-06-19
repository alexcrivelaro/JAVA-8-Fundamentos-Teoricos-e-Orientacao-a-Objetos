package unidade4.sisalucar;

public class Carro extends Veiculo {
	
	private long idCarro;
	private String placa;
	private String fabricate;
	private String modelo;
	private int ano;
	private String cor;
	private float valorDiaria;
	private Revendedor revendedor;
	public float getValorDiaria;
	
	public long getIdCarro() {
		return idCarro;
	}

	public void setIdCarro(long idCarro) {
		this.idCarro = idCarro;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getFabricate() {
		return fabricate;
	}

	public void setFabricate(String fabricate) {
		this.fabricate = fabricate;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getValorDiaria() {
		return valorDiaria;
	}

	public void setValorDiaria(float valorDiaria) {
		this.valorDiaria = valorDiaria;
	}

	public Revendedor getRevendedor() {
		return revendedor;
	}

	public void setRevendedor(Revendedor revendedor) {
		this.revendedor = revendedor;
	}

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
		
		carro1.acelera();
		carro1.freia();
		carro1.getPassageiros();
		carro1.getVelocidade();
		carro1.autonomia = 40;
	}
}
