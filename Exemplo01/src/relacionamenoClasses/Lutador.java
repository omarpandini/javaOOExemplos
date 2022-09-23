package relacionamenoClasses;

import java.util.Objects;

import uteis.Uteis;

public class Lutador implements LutadorInterface {

	private String nome;
	private String nacionalidade;
	private int idade;
	private int peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;

	Uteis ut = new Uteis();

	public Lutador(String nome, String nacionalidade, int idade, int peso, int vitorias, int derrotas, int empates) {
		super();
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.peso = peso;
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;

		this.setCategoria();
	}

	public String getNome() {
		return nome;
	}

	private void setNome(String nome) {
		this.nome = nome;
	}

	private String getNacionalidade() {
		return nacionalidade;
	}

	private void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	private int getIdade() {
		return idade;
	}

	private void setIdade(int idade) {
		this.idade = idade;
	}

	private int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
		setCategoria();
	}

	public String getCategoria() {
		return categoria;
	}

	private void setCategoria() {

		int peso = this.getPeso();

		if (peso < 52.2) {
			ut.msgNL("ERRO: PESO ABAIXO DO MINIMO");
			return;
		}

		if (peso <= 70.3) {
			this.categoria = "LEVE";
			return;
		}

		if (peso <= 83.9) {
			this.categoria = "MEDIO";
			return;
		}

		if (peso <= 120.2) {
			this.categoria = "PESADO";
			return;
		}

		ut.msgNL("ERRO: PESO ACIMA DO PERMITIDO");

	}

	private int getVitorias() {
		return vitorias;
	}

	private void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	private int getDerrotas() {
		return derrotas;
	}

	private void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	private int getEmpates() {
		return empates;
	}

	private void setEmpates(int empates) {
		this.empates = empates;
	}

	@Override
	public void apresentar() {
		// TODO Auto-generated method stub
		ut.msgNL("================================================");
		ut.msgNL("E LÁ VEM O LUTADOR: " + this.getNome());
		ut.msgNL("PESANDO: " + this.getPeso());
		ut.msgNL("NA CATEGORIA: " + this.getCategoria());
		ut.msgNL("COM " + this.getVitorias() + " DE VITÓRIAS , " + this.getDerrotas() + " DE DERROTAS E "+ this.getEmpates() + " EMPATES ");
		ut.msgNL("================================================");

	}

	@Override
	public void status() {
		// TODO Auto-generated method stub

	}

	@Override
	public void ganharLuta() {
		// TODO Auto-generated method stub
		this.setVitorias(this.getVitorias() + 1);

	}

	@Override
	public void perderLuta() {
		// TODO Auto-generated method stub
		this.setDerrotas(this.getDerrotas() + 1);

	}

	@Override
	public void empatarLuta() {
		// TODO Auto-generated method stub
		this.setEmpates(this.getEmpates() + 1);

	}

	@Override
	public int hashCode() {
		return Objects.hash(categoria, derrotas, empates, idade, nacionalidade, nome, peso, vitorias);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lutador other = (Lutador) obj;
		return Objects.equals(categoria, other.categoria) && derrotas == other.derrotas && empates == other.empates
				&& idade == other.idade && Objects.equals(nacionalidade, other.nacionalidade)
				&& Objects.equals(nome, other.nome) && peso == other.peso && vitorias == other.vitorias;
	}
	
	

}
