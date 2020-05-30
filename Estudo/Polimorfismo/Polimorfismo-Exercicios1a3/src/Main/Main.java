package Main;

import classes.Cachorro;
import classes.Cavalo;
import classes.Preguica;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("\n --------------CACHORRO--------------- \n");
		
		Cachorro cachorro = new Cachorro();
		
		cachorro.setNome("Lulu");
		
		cachorro.setIdade(3);
			
		cachorro.Nome();
		
		cachorro.Idade();
		
		cachorro.EmitirSom();
		
		cachorro.Correr();
		
		cachorro.Examinar();

		System.out.println("\n --------------CAVALO--------------- \n");	
		
		Cavalo cavalo = new Cavalo();
		
		cavalo.setNome("Bojack");
		
		cavalo.setIdade(2);
		
		cavalo.Nome();
		
		cavalo.Idade();
		
		cavalo.EmitirSom();
		
		cavalo.Correr();
		
		cavalo.Examinar();

		System.out.println("\n --------------PREGUIÇA--------------- \n");
		
		Preguica preguica = new Preguica();
		
		preguica.setNome("Topper");
		
		preguica.setIdade(1);
		
		preguica.Nome();
		
		preguica.Idade();
			
		preguica.EmitirSom();
		
		preguica.SubirEmArvore();
		
		preguica.Examinar();
		
	}

}
