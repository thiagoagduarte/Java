package trabalhandoComClasses;

public class Carro {
	//atributos(private = encapsulado)
	private String cor;
	private String marca;
	//fim dos atributos
	
	//m�todo construtor - sempre o mesmo nome da classe
	public Carro(String cor, String marca)
	{
		this.cor = cor;
		this.marca = marca;
	}
	//fim do m�todo construtor
	
	//inicio getters e setters

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	//fim dos getters e setters
	
	//outros m�todos da classe Carro
	public void mostraMarca()
	{
		System.out.println("A marca do carro � "+getMarca());
	}
	public void mostraMarcaCor()
	{
		System.out.println("Meu carro � "+getCor()+
				" e a marca do carro � "+getMarca());
	}
}
