package teste;

public class ContaBanco {

	private int numConta;
	private String tipo;
	private String dono;
	private float saldo;
	private boolean status;

	public ContaBanco(int numConta, String tipo, String dono) {
		super();
		this.numConta = numConta;
		this.tipo = tipo;
		this.dono = dono;
		this.saldo = 0;
		this.status = false;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public void abrirConta() {

		if (!isStatus()) {

			if (getTipo() == "P") {
				this.setSaldo(150);
			} else {
				this.setSaldo(100);
			}
			this.status = true;
			System.out.println("CONTA ABERTA COM SUCESSO!");
		}else {
			System.out.println("ERRO AO ABRIR CONTA: CONTA JÁ ESTÁ ABERTA");
		}
	}
	
	
	public void sacar(float valor) {
		float saldoAtual = (this.saldo - valor);
		
		if(saldoAtual < 0) {
			System.out.println("=========================");
			System.out.println("ERRO NO SAQUE: SALDO NEGATIVO");
			System.out.println("=========================");
		}else {
			this.saldo -= valor;
		}
	}
	
	public void depositar(float valor) {
		this.saldo += valor;
	}
	
	public void encerrarConta() {
		if (this.saldo != 0) {
			System.out.println("=====================================================");
			System.out.println("ERRO: PARA ENCERRAR A CONTA SAQUE O DINHEIRO EM CONTA");
			System.out.println("=====================================================");
		}else {
			this.status = false;
			System.out.println("CONTA ENCERRADA COM SUCESSO!");
		}
	}
	
	public void mostraStatusConta() {
		String statusConta;
		
		if (isStatus()) {
			statusConta = "Aberta";
		}else {
			statusConta = "Fechada";			
		}
		
		System.out.println("Num Conta: "+getNumConta());
		System.out.println("Nome Titular: "+getDono());
		System.out.println("Status Conta: "+statusConta);
		System.out.println("Tipo de Conta: "+getTipo());
		System.out.println("Saldo Conta: "+getSaldo());
		System.out.println("========================================");
	}

}
