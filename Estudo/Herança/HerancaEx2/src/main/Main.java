package main;

import model.Eletrodoméstico;

public class Main {

	public static void main(String[] args) {
		
		Eletrodoméstico eletrodomestico = new Eletrodoméstico();
		
		eletrodomestico.setTipo("Geladeira");
		
		eletrodomestico.setCor("cinza");
		
		eletrodomestico.quebrar();
	}

}
