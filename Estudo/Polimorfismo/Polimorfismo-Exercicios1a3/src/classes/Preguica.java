package classes;

import interfaces.SomAnimal;
import interfaces.Veterinario;
import Model.HerancaAnimais;

public class Preguica extends HerancaAnimais implements SomAnimal, Veterinario {

	@Override
	public void EmitirSom() {
		// TODO Auto-generated method stub
		System.out.println("\nEsta preguiça emite o som tec tec tec\n");		
	}

	public void SubirEmArvore() {
		System.out.println("\nEsta preguiça subiu em uma árvore\n");
	}

	@Override
	public void Examinar() {
		// TODO Auto-generated method stub
		System.out.println("\nEsta preguiça emite o som tec tec tec ao ser examinada\n");	
	}
		
	
}
