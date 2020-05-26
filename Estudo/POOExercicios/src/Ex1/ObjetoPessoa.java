package Ex1;
import java.util.Scanner;
public class ObjetoPessoa {

	public static void main(String[] args) {
		

		String nome="",email="",telefone="";
		
		//instanciando a classe pessoa
		Pessoa novaPessoa = new Pessoa(nome,email,telefone);
		
		//instanciando Scanner
		Scanner entrada = new Scanner(System.in);
		
		//recebendo as variáveis
		System.out.println("Digite o nome: ");
		nome = entrada.nextLine();
		novaPessoa.setNome(nome); 
		
		System.out.println("Digite o email: ");
		email = entrada.nextLine();
		novaPessoa.setEmail(email);
		
		System.out.println("Digite o telefone: ");
		telefone = entrada.nextLine();
		novaPessoa.setTelefone(telefone);
		
		//mostrando resultados
		novaPessoa.ImprimeCartao();
	}

}
