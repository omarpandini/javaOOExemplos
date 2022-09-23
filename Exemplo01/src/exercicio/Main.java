package exercicio;

import uteis.Uteis;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Uteis ut = new Uteis();
		
		Pessoa p1 = new Pessoa("OMAR", 37, "M");
		Livro l1 = new Livro("CRONICAS DE NARNIA", "CS LEWIS", 100, p1);
		
		p1.mostraPessoa();
		p1.fazerAniver();
		
		ut.msgNL("");
		
		l1.detalhes();
		
		l1.abrir();
		l1.detalhes();
		
		for(int i=0; i <= 100;i++) {
		  l1.avancarPag();
		}
		
		l1.voltarPag();
		
		l1.fechar();
		l1.detalhes();
		
		ut.msgNL("");
		
		l1.folhear();
	}

}
