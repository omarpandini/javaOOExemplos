package interfaceExemplo;

import java.util.Iterator;

public class ControleRemoto implements Controlador {
	
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	Uteis util = new Uteis();
	
	public ControleRemoto() {
		this.setVolume(5);
		this.setLigado(false);
		this.setTocando(false);
		
	}
	
	private int getVolume() {
		return volume;
	}
	private void setVolume(int volume) {
		this.volume = volume;
	}
	private boolean isLigado() {
		return ligado;
	}
	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	private boolean isTocando() {
		return tocando;
	}
	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}

	@Override
	public void ligar() {
		// TODO Auto-generated method stub
		if(this.isLigado()) {
			util.msgNL("ERRO: TV JÁ ESTÁ LIGADA");
		}else{
			this.setLigado(true);
		}
		
		
	}

	@Override
	public void desligar() {
		// TODO Auto-generated method stub
		this.setLigado(false);
	}

	@Override
	public void abrirMenu() {
		// TODO Auto-generated method stub
		System.out.println("Está ligado? " + this.isLigado());
		System.out.println("Está Tocando? " + this.isTocando());
		System.out.print("Volume: " + this.getVolume());
		
		for (int i = 0; i < this.getVolume(); i++) {
			System.out.print("|");			
		}
		
		util.msgNL("");
		
	}

	@Override
	public void maisVolume() {
		// TODO Auto-generated method stub
		util.msgNL("AUMENTANDO O VOLUME");
		if(this.isLigado()) {
			this.setVolume(this.getVolume() + 1);
		}else {
			util.msgNL("ERRO: TV DESLIGADA");
		}
		
	}

	@Override
	public void menosVolume() {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		util.msgNL("DIMINUINDO O VOLUME");
		if(this.isLigado()) {
			this.setVolume(this.getVolume() - 1);
		}else {
			util.msgNL("ERRO: TV DESLIGADA");
		}
		
	}

	@Override
	public void ligarMudo() {
		// TODO Auto-generated method stub
		if(this.isLigado()) {
			if(this.getVolume() > 0) {
				util.msgNL("MUDO ATIVADO");
				this.setVolume(0);
			}else {
				util.msgNL("ERRO: TV JÁ ESTÁ COM O VOLUME NO MÍNIMO");
			}
		}else {
			util.msgNL("ERRO: TV DESLIGADA");
		}
		
	}

	@Override
	public void desligarMudo() {
		// TODO Auto-generated method stub
		if(this.isLigado()) {
			if(this.getVolume() == 0) {
				util.msgNL("MUDO DESATIVADO");
				this.setVolume(50);
			}else {
				util.msgNL("ERRO: TV NÃO ESTÁ COM O VOLUME NO MÍNIMO");
			}
		}else {
			util.msgNL("ERRO: TV DESLIGADA");
		}
		
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		if(this.isLigado()) {
			if(!this.isTocando()) {
				util.msgNL("PLAY OK");
				this.setTocando(true);
			}else {
				util.msgNL("ERRO: TV JÁ ESTÁ TOCANDO");
			}
		}else {
			util.msgNL("ERRO: TV DESLIGADA");			
		}
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		if(this.isLigado()) {
			if(this.isTocando()) {
				util.msgNL("PAUSE OK");
				this.setTocando(false);
			}else {
				util.msgNL("ERRO: TV NÃO ESTÁ TOCANDO");
			}
		}else {
			util.msgNL("ERRO: TV DESLIGADA");			
		}
		
	}

	@Override
	public void fecharMenu() {
		// TODO Auto-generated method stub
		util.msgNL("Fechando menu");
		
	}
	
	

}
