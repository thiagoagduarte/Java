package main;

import java.util.List; //Essa linha não é utilizada pq na 15 linha utiliza-se o comando ArrayList e não o List no começo
import java.util.ArrayList;

public class TestandoListas {
	public static void main(String[] args) {

		//Entrada dos valores.
		String aula1 = "Modelando a classe Aula";
		String aula2 = "Conhecendo mais de listas";
		String aula3 = "Trabalhando com Cursos e Sets";

		// Criação da Arraylist
		ArrayList<String> aulas = new ArrayList<>();
		
		//Adição dos valores na ArrayList
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		//Impressão dos valores
		System.out.println(aulas);  //Impressão do vetor
		System.out.println(aulas.size()); //Impressão to tamanho do vetor

		// cuidado! <= faz sentido aqui? Não, pois não há aulas.get(3) e o programa dá erro.
		// O que ocorre a que a contagem do .size mostra quantas casas do vetor estão alocadas e nesse caso são i=[0,1,2]
		for (int i = 0; i < aulas.size(); i++) {
			System.out.println("Aula: "+ aulas.get(i));//Impressão de cada memória do vetor
		}
	}
}