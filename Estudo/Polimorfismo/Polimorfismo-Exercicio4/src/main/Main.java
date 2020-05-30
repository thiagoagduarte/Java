package main;

import classes.Caminhao;
import classes.CarroPasseio;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("\n ------------------CARRO PASSEIO ----------------\n");
		
		CarroPasseio carropasseio = new CarroPasseio();

		System.out.println("\n ------------------ENTRADA VALORES ----------------\n");
		
		carropasseio.EntrVeic();
		
		carropasseio.EntrPass();

		System.out.println("\n ------------------APRESENTAÇÃO VALORES ----------------\n");
		
		carropasseio.MostrVeic();
		
		carropasseio.MostrPass();
		
		System.out.println("\n ---------------------CAMINHÃO-------------------");
		
		Caminhao caminhao = new Caminhao();

		System.out.println("\n ------------------ENTRADA VALORES ----------------\n");
		
		caminhao.EntrVeic();
		
		caminhao.EntrCam();
		
		System.out.println("\n ------------------APRESENTAÇÃO VALORES ----------------\n");
		
		caminhao.MostrVeic();
		
		caminhao.MostrCam();
		
	}

}
