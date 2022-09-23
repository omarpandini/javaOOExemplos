package relacionamenoClasses;


import java.util.Iterator;
import java.util.Random;

import uteis.Uteis;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Uteis ut = new Uteis();
		 /*
		String[][] usuario = new String[10000][10000] ;
		
		for (int i = 0; i < 10; i++) {
			int idade = 38;
			usuario[0][i] = "OMAR PANDINI";
			usuario[1][i] = Integer.toString(idade+i);
		}
		
		
		
		for (int i = 0; i < usuario.length; i++) {
			if( usuario[1][i] != null ) {
			  ut.msgNL(usuario[1][i] );
			}
		}
		
	   
		
		int[] myNum = {10, 20, 30, 40, 1,2,3,4,5};
		
		for (int i : myNum) {
			ut.msgNL("  "+ myNum + "  "+ i);
		}
		
		*/
	    
		
		Lutador l[] = new Lutador[6];	
		
		l[0] = new Lutador("OMAR", "BRASIL", 35, 68, 0, 0, 0);
		l[1] = new Lutador("JOAO", "BRASIL", 35, 68, 0, 0, 0);
		l[2] = new Lutador("RICARDO", "BRASIL", 56, 73, 0, 0, 0);
		l[3] = new Lutador("JOSE", "BRASIL", 22, 68, 0, 0, 0);
		l[4] = new Lutador("REINALDO", "BRASIL", 34, 72, 0, 0, 0);
		l[5] = new Lutador("MARCOS", "BRASIL", 32, 68, 0, 0, 0);
		
			
		Luta lt1 = new Luta();
		
		lt1.marcarLuta(l[0], l[1]);
		lt1.lutar();
		
		l[0].apresentar();
		l[1].apresentar();
		

	}

}
