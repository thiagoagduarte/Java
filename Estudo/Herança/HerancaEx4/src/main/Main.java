package main;

import java.util.Scanner;

import model.veiculo;

public class Main {

	public static void main(String[] args) {
		
		veiculo veiculo = new veiculo();
		
		Scanner entrada = new Scanner(System.in);
		
		int x=0, velocidade=0;
		String tipo;
		
		System.out.println("Digite o tipo do veículo(carro ou moto): ");
		tipo = entrada.next();
		veiculo.setTipo(tipo);
		
		System.out.println("Digite a velocidade inicial do veículo: ");
		velocidade = entrada.nextInt();
		veiculo.setVelocidade(velocidade);
		
		do {			
			System.out.println("\nDigite:"
					+ "\n1)Para acelerar"
					+ "\n2)Para freiar"
					+ "\n3)Para fazer uma curva"
					+ "\n4)Para sair da simulação\n");
			x = entrada.nextInt();
			
		switch(x) {
		case 1:
			veiculo.acelerar();
			break;
		case 2:
			veiculo.freiar();
			break;
		case 3:
			veiculo.curva();
			break;
		}
			
		}while(x!=4);

	}

}
