package teste;

public class Caneta {

	private String modelo;
	private float ponta;
	private boolean tampada;
	private String cor;
	

	public Caneta(String modelo, float ponta) {
		this.modelo = modelo;
		this.ponta = ponta;
		this.tampada = true;
	}
	
	public boolean isTampada() {
		return tampada;
	}

	public void setTampada(boolean tampada) {
		this.tampada = tampada;
	}

	public String getModelo() {
		return this.modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public float getPonta() {
		return this.ponta;
	}
	
	public void setPonta(float ponta) {
		this.ponta = ponta;
	}	

	
	public String getCor() {
		return this.cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	
	public void destampar() {
		this.tampada = false;
	}
	
	public void tampar() {
		this.tampada = true;
	}
	

}
