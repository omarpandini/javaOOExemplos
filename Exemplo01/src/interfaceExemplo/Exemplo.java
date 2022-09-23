package interfaceExemplo;

public class Exemplo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ControleRemoto cr = new ControleRemoto();
		
		
		cr.ligar();
		cr.abrirMenu();		
		cr.maisVolume();
		cr.abrirMenu();	
		cr.maisVolume();
		cr.abrirMenu();	
		cr.abrirMenu();
		cr.ligar();
		cr.menosVolume();
		cr.abrirMenu();	
		cr.ligarMudo();
		cr.abrirMenu();	
		cr.ligarMudo();
		cr.abrirMenu();	
		cr.desligarMudo();
		cr.abrirMenu();	
		cr.play();
		cr.abrirMenu();	
		cr.pause();
		cr.abrirMenu();	
		//cr.fecharMenu();

	}

}
