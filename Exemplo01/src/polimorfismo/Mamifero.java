package polimorfismo;

import uteis.Uteis;

public class Mamifero extends Animal {
	
	Uteis ut = new Uteis();
	
	private String corPelop;

	@Override
	public void locomover() {
		// TODO Auto-generated method stub
		ut.msgNL("Correndo");
		
	}

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		ut.msgNL("Tomando leite");
		
	}

	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
		ut.msgNL("Fazendo um som de mamifero");
		
	}

}
