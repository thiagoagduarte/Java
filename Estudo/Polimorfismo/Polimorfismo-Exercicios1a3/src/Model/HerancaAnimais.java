package Model;

public class HerancaAnimais {
	
	private String nome;
	
	private int idade;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void Nome() {
		System.out.println("\nEste animal se chama: "+nome+"\n");
	}
	
	public void Idade() {
		System.out.println("\nEste animal tem: "+idade+" ano(s)\n");
	}

}
