package Ex2;
import java.util.Scanner;
public class PessoaObjeto {

	public static void main(String[] args) {
		
		//iniciando variáveis
		String nome="";
		int anoNascimento = 0;
		
		//instanciando a classe Pessoa
		PessoaModelo novapessoa = new PessoaModelo(nome, anoNascimento);
		
		//instanciando a classe entrada
		Scanner entrada = new Scanner(System.in);
		
		//recebe variáveis
		System.out.println("Digite o nome: ");
		nome=entrada.nextLine();
		novapessoa.setNome(nome);
		
		System.out.println("Digite o seu ano de nascimento: ");
		anoNascimento=entrada.nextInt();
		novapessoa.setAnoNascimento(anoNascimento);
		
		//executa o método
		System.out.println();
		novapessoa.idadeAtual();
		System.out.println();
		novapessoa.idadeDaqui50Anos();

	}

}
