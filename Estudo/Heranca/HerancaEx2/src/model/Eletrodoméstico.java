package model;

public class Eletrodom�stico {
	
	private String tipo;
	
	private String cor;

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void quebrar() {
		System.out.println("O eletrodom�stico "+tipo+" de cor "+cor+" quebrou!");
	}

}
