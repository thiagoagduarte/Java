package superclass;

import java.util.Scanner;

public class Veiculo {
	
	Scanner entrada = new Scanner(System.in);
		
	private int pesoQuilos;
	
	private int velocMaxKmh;
	
	private float precoR$;
		
	public int getPesoQuilos() {
		return pesoQuilos;
	}

	public void setPesoQuilos(int pesoQuilos) {
		this.pesoQuilos = pesoQuilos;
	}

	public int getVelocMaxKmh() {
		return velocMaxKmh;
	}

	public void setVelocMaxKmh(int velocMaxKmh) {
		this.velocMaxKmh = velocMaxKmh;
	}

	public float getPrecoR$() {
		return precoR$;
	}

	public void setPrecoR$(float precoR$) {
		this.precoR$ = precoR$;
	}

	public void EntrVeic() {
		System.out.println("\nDigite o peso do ve�culo em quilos: ");
		this.pesoQuilos = this.entrada.nextInt();
		System.out.println("\nDigite a velocidade m�xima do ve�culo em Km/h: ");
		this.velocMaxKmh = this.entrada.nextInt();
		System.out.println("\nDigite o pre�o do ve�culo em reais: R$");
		this.precoR$ = this.entrada.nextFloat(); 
	}
	
	public void MostrVeic() {
		System.out.println("\nO peso do ve�culo �: "+this.pesoQuilos+" quilos\n");
		System.out.println("\nA velocidade m�xima do ve�culo � "+this.velocMaxKmh+" Km/h\n");
		System.out.printf("\nO pre�o do ve�culo � R$ %.2f",this.precoR$);
		System.out.println("");
	}

}
