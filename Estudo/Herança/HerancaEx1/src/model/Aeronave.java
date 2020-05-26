package model;

public class Aeronave {
	
	private String nome;
	
	private String cor;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public void voar() {
		System.out.println("A aeronave "+this.nome+" de cor "+this.cor+" está voando!");
	}
	
}
