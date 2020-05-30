package classes;

import interfaces.SomAnimal;
import interfaces.Veterinario;
import Model.HerancaAnimais;

public class Cavalo extends HerancaAnimais implements SomAnimal, Veterinario{

	@Override
	public void EmitirSom() {
		// TODO Auto-generated method stub
		System.out.println("\nEste cavalo emite o som tr tr tr\n");		
	}

	public void Correr() {
		System.out.println("\nEste cavalo correu\n");
	}

	@Override
	public void Examinar() {
		// TODO Auto-generated method stub
		System.out.println("\nEste cavalo emite o som tr tr tr ao ser examinado\n");				
	}

}
