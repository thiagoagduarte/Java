package main;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class MinhasCollections {
	public static void main(String[] args) {
	
		//Inicialização da listagem do Array e criação do objeto minhaLista
		List<Integer> minhaLista = new ArrayList<Integer>();
		//Adicção de valores
		minhaLista.add(1);  
		minhaLista.add(2);
		minhaLista.add(2);
		
		//Impressão dos valores
		for (Integer listaElementos : minhaLista) {
			System.out.println(listaElementos);
		}

		//Inicialização da listagem do Set e criação do objeto meuSet
		Set<Integer> meuSet = new HashSet<Integer>();
		meuSet.add(1);
		meuSet.add(2);
		meuSet.add(3);
		meuSet.add(1); //Obs: No modo Set valores repetidos não são listados no HashSet

		//Criação do Iterator que é tipo um for para imprimir os valores
		Iterator<Integer> iMeuSet = meuSet.iterator();

		//Impressão dos valores
		while(iMeuSet.hasNext()){
			System.out.println(iMeuSet.next());
		}
	}
}
