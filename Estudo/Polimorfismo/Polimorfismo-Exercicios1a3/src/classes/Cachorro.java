package classes;

import interfaces.SomAnimal;
import interfaces.Veterinario;
import Model.HerancaAnimais;

public class Cachorro extends HerancaAnimais implements SomAnimal, Veterinario{

	@Override
	public void EmitirSom() {
		// TODO Auto-generated method stub
		System.out.println("\nEste cachorro emite o som au au au\n");
	}

	public void Correr() {
		System.out.println("\nEste cachorro correu\n");
	}

	@Override
	public void Examinar() {
		// TODO Auto-generated method stub
		System.out.println("\nEste cachorro emitiu o som au au au ao ser examinado\n");
	}
		
	
}
