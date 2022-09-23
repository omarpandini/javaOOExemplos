package teste;

public class Exemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Caneta c1 = new Caneta("BIC", 0.2f);
		
		//c1.setModelo("BIC");
		//c1.setPonta(0.5f);
		
		/*System.out.println("Modelo "+c1.getModelo());
		System.out.println("Ponta "+c1.getPonta());
		System.out.println("Tampada? "+c1.isTampada());
		*/
		
		//Abrindo uma conta
		ContaBanco cb = new ContaBanco(10, "P", "OMAR PANDINI");
		
		cb.mostraStatusConta();
		cb.abrirConta();
		cb.mostraStatusConta();
		//cb.abrirConta();
		cb.sacar(100);
		cb.mostraStatusConta();
		cb.sacar(100);
		cb.mostraStatusConta();
		cb.sacar(15);
		cb.mostraStatusConta();
		cb.depositar(1000.50f);
		cb.mostraStatusConta();
		
		cb.encerrarConta();
		
		cb.sacar(1035.50f);
		
		cb.mostraStatusConta();
		
		cb.encerrarConta();
		
		cb.mostraStatusConta();

	}

}
