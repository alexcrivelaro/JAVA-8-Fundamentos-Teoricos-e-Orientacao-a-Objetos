package unidade4.sisalucar;

import java.time.LocalDate;

public class SisalucarApp {
	
	static int totalCarros = 0;

	public static void main(String[] args) {
		
		Carro carro1 = new Carro(); // 1º objeto carro
		carro1.setIdCarro(1);
		carro1.setModelo("gol");
		carro1.setPlaca("jdk-0001");
		carro1.setCor("azul");
		carro1.setAno(2015);
		carro1.setFabricate("volkswagen");
		
		// SisalucarApp.totalCarros = SisalucarApp.totalCarros + 1; 
		// - está dentro do método estático - é um membro de classe
		                totalCarros = totalCarros + 1;
		
		Carro carro2 = new Carro(); // 2º objeto carro
		
		Cliente cliente1 = new Cliente();
		cliente1.setIdCliente(1);
		cliente1.setCpf("123456789-00");
		cliente1.setNome("João Pedro");
		cliente1.setCnh("XYZ0001");
		
		Cliente cliente2 = new Cliente();
	
	/* <tipo> <nome> = <criação do objeto>	
	 *
     * Carro       - Tipo da variável que é uma classe
     * carro1      - Nome da classe
     * new Carro() - instanciação da classe
     *               ou criação do objeto
     *               (valores que serão armazenados no objeto 
     * */
		
		SisalucarApp sisalucar = new SisalucarApp();
		sisalucar.realizarLocacao(carro1.getIdCarro(), cliente1.getIdCliente(), carro1.getValorDiaria());
		
		// SisalucarApp.gerarRelatorioLocacao(carro1, LocalDate.now(), LocalDate.now().plusDays(5));
		//  - está dentro do método estático - é um membro de classe
		                gerarRelatorioLocacao(carro1, LocalDate.now(), LocalDate.now().plusDays(5));
    
		System.out.println(carro1);   // imprime o local da memória
		System.out.println(carro2);   // imprime o local da memória
		System.out.println(cliente1); // imprime o local da memória
		System.out.println(cliente2); // imprime o local da memória
	}

	public void realizarLocacao(long idCarro, long idCliente, float valorDiaria) {
		Locacao locacao = new Locacao();
		locacao.setIdLocacao(1);
		locacao.setIdCarro(idCarro);
		locacao.setIdCliente(idCliente);
		locacao.setDatainicial(LocalDate.now());
		locacao.setDatafinal(LocalDate.now().plusDays(2));
		locacao.setValorLocado(2 * 99.90f); 
	}
	
	public static void gerarRelatorioLocacao(Carro carro1, LocalDate ...datas) // exemplo de varargs 
	{
		float totalFaturado = carro1.getValorDiaria();
	}
}


