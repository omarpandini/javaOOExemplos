package polimorfismo;

import uteis.Uteis;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Uteis ut = new Uteis();
		
		ut.msgNL("Ola");
		
		Mamifero m1 = new Mamifero();
		
		m1.setMebros(4);
		m1.setPeso(40.5f);
		
		m1.locomover();
		m1.emitirSom();
		m1.alimentar();
		
		Cachorro c1 = new Cachorro();
		
		c1.reagir("AGUA");
		c1.reagir(true);
		
		c1.locomover();
		c1.emitirSom();
		

	}

}
