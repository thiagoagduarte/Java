package trabalhandoComClasses;

public class Carro {
	//atributos(private = encapsulado)
	private String cor;
	private String marca;
	//fim dos atributos
	
	//método construtor - sempre o mesmo nome da classe
	public Carro(String cor, String marca)
	{
		this.cor = cor;
		this.marca = marca;
	}
	//fim do método construtor
	
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
	
	//outros métodos da classe Carro
	public void mostraMarca()
	{
		System.out.println("A marca do carro é "+getMarca());
	}
	public void mostraMarcaCor()
	{
		System.out.println("Meu carro é "+getCor()+
				" e a marca do carro é "+getMarca());
	}
}
