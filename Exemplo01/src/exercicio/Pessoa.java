package exercicio;

import uteis.Uteis;

public class Pessoa {

	Uteis ut = new Uteis();

	private String nome;
	private int idade;
	private String sexo;
	private boolean status = true;

	public Pessoa(String nome, int idade, String sexo) {
		super();
		this.setNome(nome);
		this.setIdade(idade);
		this.setSexo(sexo);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		if (idade > 120) {
			ut.msgNL("ERRO: IDADE INVALIDA");
			this.setStatus(false);
		} else {
			this.idade = idade;
		}

	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	private boolean isStatus() {
		return status;
	}

	private void setStatus(boolean status) {
		this.status = status;
	}

	public void mostraPessoa() {
		if (isStatus()) {
			ut.msgNL("========================");
			ut.msgNL("Nome Pessoa: " + this.getNome());
			ut.msgNL("Idade Pessoa: " + this.getIdade());
			ut.msgNL("Sexo Pessoa: " + this.getSexo());
			ut.msgNL("========================");
		}else {
			ut.msgNL("PESSOA INVALIDA");
		}
	}
	
	public void fazerAniver() {
		this.setIdade(getIdade() + 1);
	}

}
