package main;

import model.Eletrodom�stico;

public class Main {

	public static void main(String[] args) {
		
		Eletrodom�stico eletrodomestico = new Eletrodom�stico();
		
		eletrodomestico.setTipo("Geladeira");
		
		eletrodomestico.setCor("cinza");
		
		eletrodomestico.quebrar();
	}

}
