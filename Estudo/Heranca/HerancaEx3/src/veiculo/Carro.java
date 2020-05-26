package veiculo;

public class Carro extends Veiculo{

	private String portamalas;

	public String getPortamalas() {
		return portamalas;
	}

	public void setPortamalas(String portamalas) {
		this.portamalas = portamalas;
	}
	
	public void freioDeMao() {
		System.out.println("O carro modelo "+getModelo()+" de cor "+getCor()+" está com o porta malas "+portamalas+" e freio de mão puxado!");
	}
	
}
