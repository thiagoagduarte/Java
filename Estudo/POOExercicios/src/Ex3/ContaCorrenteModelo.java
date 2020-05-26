package Ex3;

public class ContaCorrenteModelo {
	
	//Definir atributos
	private int nAgencia, nConta, saldoAtual, valor, deposito, saque;
	
	//Iniciar construtor
	public ContaCorrenteModelo(int nAgencia, int nConta, int saldoAtual, int valor, int deposito, int saque) {
		
		this.nAgencia = nAgencia;
		this.nConta = nConta;
		this.saldoAtual = saldoAtual;
		this.valor = valor;
		this.deposito = deposito;
		this.saque=saque;
		
	}

	public int getnAgencia() {
		return nAgencia;
	}

	public void setnAgencia(int nAgencia) {
		this.nAgencia = nAgencia;
	}

	public int getnConta() {
		return nConta;
	}

	public void setnConta(int nConta) {
		this.nConta = nConta;
	}

	public int getSaldoAtual() {
		return saldoAtual;
	}

	public void setSaldoAtual(int saldoAtual) {
		this.saldoAtual = saldoAtual;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public int getDeposito() {
		return deposito;
	}

	public void setDeposito(int deposito) {
		this.deposito = deposito;
	}

	public int getSaque() {
		return saque;
	}

	public void setSaque(int saque) {
		this.saque = saque;
	}

	//métodos
	public void deposito() {
		
		System.out.println();
		saldoAtual=saldoAtual+valor;
		deposito=deposito+valor;
		System.out.println("Foi efetuado um depósito no valor de: R$ "+valor+" reais. ");
				
	}
	
	public void saque() {
		
		System.out.println();
		saldoAtual=saldoAtual-valor;
		saque=saque-valor;
		System.out.println("Foi efetuado um saque no valor de: R$ "+valor+" reais. ");
		
		
	}
	
	public void ImprimirSaldoAtual() {
		
		System.out.println();
		System.out.println("Seu saldo atual é de: R$"+saldoAtual+"reais. ");
		System.out.println("\n\nO valor total de depósitos é de: R$"+deposito+"reais. ");
		System.out.println("\n\nO valor total de saques é de: R$"+(saque*-1)+"reais.");
		
	}

}
