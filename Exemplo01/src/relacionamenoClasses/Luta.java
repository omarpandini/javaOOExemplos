package relacionamenoClasses;

import java.util.Random;

import uteis.Uteis;

public class Luta {
	private Lutador desafiado;
	private Lutador desafiante;
	private int rounds;
	private boolean aprovada;

	Uteis ut = new Uteis();

	public void marcarLuta(Lutador l1, Lutador l2) {
		if (l1.getCategoria().equals(l2.getCategoria()) && !l1.equals(l2) ) {
			this.aprovada = true;
			this.desafiado = l1;
			this.desafiante = l2;

		} else {
			this.aprovada = false;
			this.desafiado = null;
			this.desafiante = null;
		}
	}

	public void lutar() {
		if (this.aprovada) {
			ut.msgNL("### DESAFIADO ###");
			this.desafiado.apresentar();
			ut.msgNL("### DESAFIANTE ###");
			this.desafiante.apresentar();

			Random aleatorio = new Random();
			int vencedor = aleatorio.nextInt(3);

			switch (vencedor) {
			case 0: { // Empate

				ut.msgNL("EMPATOU");
				this.desafiado.empatarLuta();
				this.desafiante.empatarLuta();
				break;
			}
			case 1: { // Desafiado vence

				ut.msgNL("VENCEU " + this.desafiado.getNome());
				this.desafiado.ganharLuta();
				this.desafiante.perderLuta();

				break;

			}
			case 2: { // Desafiante vence

				ut.msgNL("VENCEU " + this.desafiante.getNome());
				this.desafiante.ganharLuta();
				this.desafiado.perderLuta();

				break;

			}
			}

		} else {
			ut.msgNL("ERRO: A LUTA NAO PODE ACONTECER");
		}
	}

	public Lutador getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}

	public Lutador getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}

	public int getRounds() {
		return rounds;
	}

	public void setRounds(int rounds) {
		this.rounds = rounds;
	}

	public boolean isAprovada() {
		return aprovada;
	}

	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}

}
