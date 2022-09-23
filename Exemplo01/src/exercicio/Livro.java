package exercicio;

import uteis.Uteis;

public class Livro implements Publicacao {
	
	Uteis ut = new Uteis();
	
	private String titulo,autor;
	private int totPaginas,pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	
	public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.totPaginas = totPaginas;
		this.pagAtual = 0;
		this.aberto = false;
		this.leitor = leitor;
	}
	
	
	@Override
	public void abrir() {
		// TODO Auto-generated method stub
		if(this.isAberto()) {
			ut.msgNL("ERRO: LIVRO JA ESTA ABERTO");
		}else {
			ut.msgNL("Abrindo livro, bem vindo a leitura de "+this.getTitulo());
			this.setAberto(true);
		}
		
	}
	@Override
	public void fechar() {
		// TODO Auto-generated method stub
		if(!this.isAberto()) {
			ut.msgNL("ERRO: LIVRO JA ESTA FECHADO");
		}else {
			ut.msgNL("Fechando o livro, estamos na pagina "+this.getPagAtual());
			this.setAberto(false);
		}
		
	}
	@Override
	public void folhear() {
		// TODO Auto-generated method stub
		ut.msgNL("====  FOLHANDO AS PÁGINAS ====");
		
		for(int i = 1; i <= this.getTotPaginas();i++) {
			ut.msgNL("Folhando a Pagina "+i);
		}
		
		ut.msgNL("Chegou ao fim");
		
	}
	@Override
	public void avancarPag() {
		// TODO Auto-generated method stub
		int pagAtual = this.getPagAtual();
		int totPagina = this.getTotPaginas();
		
		if(!this.isAberto()) {
			ut.msgNL("ERRO AO AVANCAR PAGINA: LIVRO ESTA FECHADO");
		}else if(pagAtual >= totPagina) {
			ut.msgNL("ERRO AO AVANCAR PAGINA: LIVRO CHEGOU AO FIM");			
		}else {
			ut.msgNL("Vamos para pagina "+(pagAtual+1));
			this.setPagAtual(pagAtual+1);
			
		}		
		
		
	}
	@Override
	public void voltarPag() {
		// TODO Auto-generated method stub
		
		int pagAtual = this.getPagAtual();
		int totPagina = this.getTotPaginas();
		
		if(!this.isAberto()) {
			ut.msgNL("ERRO AO VOLTAR PAGINA: LIVRO ESTA FECHADO");
		}else if(pagAtual == 0) {
			ut.msgNL("ERRO AO VOLTAR PAGINA: VOCE ESTA NA PAGINA "+this.getPagAtual());			
		}else {
			ut.msgNL("Vamos voltar para a pagina "+(pagAtual-1));
			this.setPagAtual(pagAtual-1);
			
		}
		
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getTotPaginas() {
		return totPaginas;
	}
	public void setTotPaginas(int totPaginas) {
		this.totPaginas = totPaginas;
	}
	public int getPagAtual() {
		return pagAtual;
	}
	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}
	public boolean isAberto() {
		return aberto;
	}
	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}
	public Pessoa getLeitor() {
		return leitor;
	}
	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}
	
	public void detalhes() {
		ut.msgNL("========= INFORMACOES DO LIVRO / LEITOR ==================");
		ut.msgNL("Livro " + this.getTitulo());
		ut.msgNL("Autor " + this.getAutor());
		ut.msgNL("Paginas " + this.getTotPaginas());
		ut.msgNL("Livro Aberto? " + this.isAberto());
		ut.msgNL("Pagina atual " + this.getPagAtual());
		ut.msgNL("Leitor " + this.getLeitor().getNome() + ". Idade:  " + this.getLeitor().getIdade());
		ut.msgNL("===========================");
	}
	
	

}
