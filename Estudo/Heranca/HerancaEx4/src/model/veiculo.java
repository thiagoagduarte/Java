package model;

public class veiculo {

	private String tipo;
	
	private int velocidade;

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
	public void acelerar() {
		System.out.print("\nO veículo "+tipo+" acelerou e agora está na velocidade de "+(velocidade+5)+"km/h\n");
		velocidade = velocidade +5;
	}
	
	public void freiar() {
		System.out.print("\nO veículo "+tipo+" reduziu e agora está na velocidade de "+(velocidade-5)+"km/h\n");
		velocidade = velocidade - 5;
	}
	
	public void curva() {
		System.out.print("\nO veículo "+tipo+" fez uma curva na velocidade de "+(velocidade)+"km/h\n");
		if (velocidade >= 70) {
			System.out.println("O veículo capotou");
			velocidade=0;
	}
	
}}
