package classes;

import java.util.Scanner;

import superclass.Veiculo;

public class Caminhao extends Veiculo{
	
	Scanner entrada = new Scanner(System.in);
	
	private int cargaMaxima;
	
	private int alturaMax;
	
	private int comprimento;

	public int getCargaMaxima() {
		return cargaMaxima;
	}

	public void setCargaMaxima(int cargaMaxima) {
		this.cargaMaxima = cargaMaxima;
	}

	public int getAlturaMax() {
		return alturaMax;
	}

	public void setAlturaMax(int alturaMax) {
		this.alturaMax = alturaMax;
	}

	public int getComprimento() {
		return comprimento;
	}

	public void setComprimento(int comprimento) {
		this.comprimento = comprimento;
	}
	
	public void EntrCam() {
		System.out.println("\nDigite a carga m�xima do caminh�o em toneladas: ");
		this.cargaMaxima = this.entrada.nextInt();
		System.out.println("\nDigite a altura m�xima do caminh�o em metros: ");
		this.alturaMax = this.entrada.nextInt();
		System.out.println("\nDigite o comprimento do caminh�o em metros: ");
		this.comprimento = this.entrada.nextInt();
	}
	
	public void MostrCam() {
		System.out.println("\nA carga m�xima do caminh�o � de: "+this.alturaMax+" toneladas\n");
		System.out.println("\nA altura m�xima do caminh�o � de: "+this.alturaMax+" metros\n");
		System.out.println("\nO comprimento do caminh�o � de: "+this.comprimento+" metros\n");
	}

}
