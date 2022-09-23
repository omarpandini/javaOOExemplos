package heranca;

import uteis.Uteis;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Uteis ut = new Uteis();
		
		ut.msgNL("Hello");
		
	
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		
		Visitante v1 = new Visitante();
		
		v1.setNome("VISITANTE SILVA");
		
		ut.msgNL(v1.mostraPessoa());
		
		p3.setNome("PROFESSOR PACHECO");
		
		p2.setNome("OMAR");
		p2.setIdade(37);
		p2.setSexo("M");
		p2.pagarMensalidade();
		
		Bolsista b1 = new Bolsista();
		
		b1.setNome("Ze Bolsita");
		b1.pagarMensalidade();
		
		
		ut.msgNL(p2.mostraPessoa());
		ut.msgNL(p2.mostraPessoa());
		ut.msgNL(p3.mostraPessoa());

	}

}
