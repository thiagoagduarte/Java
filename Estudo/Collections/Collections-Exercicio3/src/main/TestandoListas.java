package main;

import java.util.List; //Essa linha n�o � utilizada pq na 15 linha utiliza-se o comando ArrayList e n�o o List no come�o
import java.util.ArrayList;

public class TestandoListas {
	public static void main(String[] args) {

		//Entrada dos valores.
		String aula1 = "Modelando a classe Aula";
		String aula2 = "Conhecendo mais de listas";
		String aula3 = "Trabalhando com Cursos e Sets";

		// Cria��o da Arraylist
		ArrayList<String> aulas = new ArrayList<>();
		
		//Adi��o dos valores na ArrayList
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		//Impress�o dos valores
		System.out.println(aulas);  //Impress�o do vetor
		System.out.println(aulas.size()); //Impress�o to tamanho do vetor

		// cuidado! <= faz sentido aqui? N�o, pois n�o h� aulas.get(3) e o programa d� erro.
		// O que ocorre a que a contagem do .size mostra quantas casas do vetor est�o alocadas e nesse caso s�o i=[0,1,2]
		for (int i = 0; i < aulas.size(); i++) {
			System.out.println("Aula: "+ aulas.get(i));//Impress�o de cada mem�ria do vetor
		}
	}
}