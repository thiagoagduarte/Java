package main;

public class Aula {

	// Injeção das variáveis
	private String titulo;
	private int tempo;
	
	//Criação do método que será chamado na Main com os atributos necessários
	public Aula(String titulo, int tempo) {
		this.titulo = titulo;
		this.tempo = tempo;
	}

	//Getters and Setters
		public String getTitulo() {
			return titulo;
		}

		public int getTempo() {
			return tempo;
		}
}
