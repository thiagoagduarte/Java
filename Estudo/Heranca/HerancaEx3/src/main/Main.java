package main;

import veiculo.Carro;
import veiculo.Moto;

public class Main {
	
	public static void main(String[] args) {
		
	Carro carro = new Carro();
	
	carro.setModelo("iX35");
	
	carro.setCor("preta");
	
	carro.setPortamalas("cheio");
	
	carro.funcionar();
	
	carro.freioDeMao();
	
	System.out.println("\n ------------------------\n");
	
	Moto moto = new Moto();
	
	moto.setModelo("Hornet");
	
	moto.setCor("vermelha");
	
	moto.setBagageiro("vazio");
	
	moto.funcionar();
	
	moto.empinar();
		
	}

}
