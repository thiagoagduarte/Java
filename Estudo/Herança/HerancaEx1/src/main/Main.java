package main;

import model.Aeronave;

public class Main {

	public static void main(String[] args) {
		
		Aeronave aeronave = new Aeronave();
		
		aeronave.setNome("Águia");
		
		aeronave.setCor("Vermelha");
		
		aeronave.voar();

	}

}
