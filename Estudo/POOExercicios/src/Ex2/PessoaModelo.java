package Ex2;

public class PessoaModelo {
	
	//atributos
	private String nome;
	private int anoNascimento;
	
	//Constructor
	public PessoaModelo(String nome,int anoNascimento)
	{
		this.nome =nome;
		this.anoNascimento = anoNascimento;
	}

	//Fim Constructor
	
	//Getters and Setters
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Number getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	
	//métodos
	public void idadeAtual() {
		
		int idade = 2020-anoNascimento;
		System.out.println("Sua idade é: "+idade+" anos");

	}
	
	public void idadeDaqui50Anos() {
		
		int idade = 2020-anoNascimento;
		System.out.println("Sua idade daqui 50 anos é: "+(idade+50)+" anos");

	}

}
