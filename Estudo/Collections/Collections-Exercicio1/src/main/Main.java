package main;

import java.util.*;

import model.Telefone;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Telefone> lista = new ArrayList<Telefone>();
		
		Telefone a = new Telefone("11-99999999", 1);
		Telefone b = new Telefone("11-88888888", 2);
		Telefone c = new Telefone("11-77777777", 3);
		
		lista.add(a);
		lista.add(b);
		lista.add(c);
		
		Telefone telefone;
		Iterator<Telefone> itr = lista.iterator();
		while (itr.hasNext()) {
			telefone=itr.next();
		System.out.println("Número do telefone: "+telefone.getNrTelefone());
		System.out.println("Tipo do telefone: "+telefone.getTipoTelefone());
		System.out.println("\n");
		}
	}

}
