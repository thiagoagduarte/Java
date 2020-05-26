package trabalhandoComClasses;

public class UtilizandoClasse {

	public static void main(String[] args) {
		//variáveis que serão parâmetros do método construtor
		String cor="não sei";
		String marca="não sei";
		
		//instanciando a classe Carro
		//criando o objeto meucarro
		Carro meucarro = new Carro(cor, marca);
		meucarro.mostraMarcaCor();
		
		//trocando atributos do carro
		meucarro.setCor("vermelho");
		marca="Fiat";
		meucarro.setMarca(marca);
		
		//executando método
		meucarro.mostraMarcaCor();
	}

}
