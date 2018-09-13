package br.com.ceja.classes;

import java.util.List;

public class Boletim {

	List<Disciplina> disciplinas;

	/** 
	 * 
	 * 
	 * 
	 * Lembrar do problema aqui
	 * 
	 * 
	 * 
	 * 
	 * */
	
	
	
	
	public Boletim(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
}
