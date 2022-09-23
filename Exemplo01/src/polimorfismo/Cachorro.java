package polimorfismo;

import uteis.Uteis;

public class Cachorro extends Mamifero {
	
	Uteis ut = new Uteis();
	
	@Override
	public void locomover() {
		ut.msgNL("Cachorro doido correndo");
	}
	
	@Override
	public void emitirSom() {
		ut.msgNL("Cachorro latindo muuuuito");
	}
	
	public void reagir(String frase) {
		if(frase == "COMIDA" || frase == "AGUA") {
			ut.msgNL("ABANAR E LATIR");			
		}else {
			ut.msgNL("ROSNAR");
		}
	}
	
	public void reagir(int hora, int min) {
		ut.msgNL("");
	}
	
	public void reagir(boolean dono) {
		if(dono) {
			ut.msgNL("OBAAA, CHEGOU O MEU DONO");			
		}else {
			ut.msgNL("AAAAAAAA");
		}
		
	}

}
