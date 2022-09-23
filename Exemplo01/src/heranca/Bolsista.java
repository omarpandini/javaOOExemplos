package heranca;

import uteis.Uteis;

public class Bolsista extends Aluno {
	
	private float bolsa;
	
	Uteis ut = new Uteis();
	
	public void renovarBolsa() {
		ut.msgNL("Renovando bolsa do aluno "+ this.getNome());
	}
	
	@Override
	public void pagarMensalidade() {
		ut.msgNL(this.getNome() + " e bolsista. Pagamento efetuado ");
	}


	public float getBolsa() {
		return bolsa;
	}


	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}

}
