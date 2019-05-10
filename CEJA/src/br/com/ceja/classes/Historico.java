package br.com.ceja.classes;

import java.util.ArrayList;
import java.util.List;

public class Historico {

	List<Disciplina> disciplinas;

	public Historico(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public Historico() {
		this(new ArrayList<Disciplina>());
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
}
