package classes;

import java.util.Scanner;

import superclass.Veiculo;

public class CarroPasseio extends Veiculo{

	Scanner entrada = new Scanner(System.in);
	
	private String cor;
	
	private String modelo;
	
	public String getCor() {
		return cor;
	}



	public void setCor(String cor) {
		this.cor = cor;
	}



	public String getModelo() {
		return modelo;
	}



	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void EntrPass(){
		System.out.println("\nDigite a cor do veículo de passeio: ");
		this.cor = this.entrada.nextLine();
		System.out.println("\nDigite o modelo do veículo de passeio: ");
		this.modelo = this.entrada.nextLine();
	}
	
	public void MostrPass(){
		System.out.println("\nA cor do veículo de passeio é: "+this.cor+"\n");
		System.out.println("\nO modelo do veículo de passeio é: "+this.modelo+"\n");
	}

}
