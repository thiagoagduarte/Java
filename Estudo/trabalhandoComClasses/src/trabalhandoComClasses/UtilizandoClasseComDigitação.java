package trabalhandoComClasses;
import java.util.Scanner;
public class UtilizandoClasseComDigita��o {

	public static void main(String[] args) {
		
		String cor="";
		String marca="";
		
		//instanciando a classe carro
		//criar o objeto carro aluno
		Carro carroaluno = new Carro("","");
		
		//instanciando a classe Scanner
		Scanner entrada = new Scanner(System.in);
		
		//recebendo a digita��o do usu�rio
		System.out.print("Informe a cor: ");
		cor = entrada.nextLine();
		carroaluno.setCor(cor);
		
		System.out.print("Informe a marca: ");
		marca = entrada.nextLine();
		carroaluno.setMarca(marca);
		
		//mostrando os resultados
		carroaluno.mostraMarcaCor();
		
	}

}
