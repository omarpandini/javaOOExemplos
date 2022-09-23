package heranca;

import uteis.Uteis;

public class Aluno extends Pessoa {
	
	Uteis ut = new Uteis();
	
	
	private int matricula;
	private String curso;		
	
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public void cancelarMatricula() {
		ut.msgNL("Matricula sera cancelada");
	}
	
	public void pagarMensalidade() {
		ut.msgNL("Pagando mensalidade de aluno");
	}
	
	

}
