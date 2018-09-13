package br.com.ceja.classes;

import java.util.List;

public class Historico {

	List<Disciplina> disciplinas;
	List<Integer> notas;
	
	public Historico(List<Disciplina> disciplinas, List<Integer> notas) {
		this.disciplinas = disciplinas;
		this.notas = notas;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public List<Integer> getNotas() {
		return notas;
	}

	public void setNotas(List<Integer> notas) {
		this.notas = notas;
	}

	public void geraNotas() {
		
		for(Disciplina d: disciplinas) {
			notas.add(d.mediaFinal);
		}
	}
	
}
