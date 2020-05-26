package Ex3;

import java.util.Scanner;

public class ContaCorrenteObjeto {

	public static void main(String[] args) {
		
		//Declarar variáveis
		
		int nAgencia=0, nConta=0, saldoAtual=0,deposito=0,saque=0,valor=0,operacao = 0;
		
		//instanciando classe Conta corrente
		
		ContaCorrenteModelo novaConta = new ContaCorrenteModelo(nAgencia, nConta, saldoAtual,deposito,saque,valor);
		
		//instanciando Scanner

		Scanner entrada = new Scanner(System.in);
		
		//Receber variáveis
		
		
		
		do {
			System.out.println(""
					+ "Digite:"
					+ "\n1)Para realizar um deposito "
					+ "\n2)Para realizar um saque"
					+ "\n3)Para ver seu saldo"
					+ "\n4)Para sair");
			operacao = entrada.nextInt();
		switch(operacao) {
		case 1:
		System.out.println("\nDigite o valor do depósito: ");
		valor=entrada.nextInt();
		novaConta.setValor(valor);
		novaConta.deposito();
		break;
		
		case 2:
		System.out.println("\nDigite o valor do saque: ");
		valor=entrada.nextInt();
		novaConta.setValor(valor);
		novaConta.saque();
		break;
				
		case 3:
		novaConta.ImprimirSaldoAtual();
		System.out.println("\n");
		break;
		}
		} while (operacao !=4);

	}

}
