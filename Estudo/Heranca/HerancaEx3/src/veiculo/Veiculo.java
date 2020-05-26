package veiculo;

public class Veiculo {
	
	private String modelo;
	
	private String cor;

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void funcionar() {
		System.out.println("O veículo "+modelo+" na cor "+cor+" está funcionando corretamente!");
	}

}
