package trabalhandoComClasses;

public class UtilizandoClasse {

	public static void main(String[] args) {
		//vari�veis que ser�o par�metros do m�todo construtor
		String cor="n�o sei";
		String marca="n�o sei";
		
		//instanciando a classe Carro
		//criando o objeto meucarro
		Carro meucarro = new Carro(cor, marca);
		meucarro.mostraMarcaCor();
		
		//trocando atributos do carro
		meucarro.setCor("vermelho");
		marca="Fiat";
		meucarro.setMarca(marca);
		
		//executando m�todo
		meucarro.mostraMarcaCor();
	}

}
