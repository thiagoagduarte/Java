package veiculo;

public class Moto extends Veiculo {
	
	private String bagageiro;

	public String getBagageiro() {
		return bagageiro;
	}

	public void setBagageiro(String bagageiro) {
		this.bagageiro = bagageiro;
	}
	
	public void empinar() {
		System.out.println("A moto modelo "+getModelo()+" de cor "+getCor()+" está com a bagageiro "+bagageiro+" e empinando!");
	}
	

}
