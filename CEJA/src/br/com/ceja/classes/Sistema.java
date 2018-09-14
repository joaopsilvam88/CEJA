package br.com.ceja.classes;

import java.util.ArrayList;
import java.util.List;

import br.com.ceja.exceptions.*;

public class Sistema {

	private List<Aluno> alunos;
	private List<Administrador> adms;
	
	public Sistema() {
		this(new ArrayList<Aluno>(), new ArrayList<Administrador>());
	}
	
	public Sistema(List<Aluno> alunos, List<Administrador> adms) {
		this.alunos = alunos;
		this.adms = adms;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

	public List<Administrador> getAdministradores() {
		return adms;
	}

	public void setAdministradores(List<Administrador> adms) {
		this.adms = adms;
	}
	
	public void addAluno(Aluno aluno) throws AlunoJaExisteException{
		for(Aluno a: alunos) {
			if(a.getDados().getCpf().equals(aluno.getDados().getCpf()) || a.getDados().getEmail().equals(aluno.getDados().getEmail()) || 
					a.getDados().getMatricula().equals(aluno.getDados().getMatricula()) || a.getDados().getRg().equals(aluno.getDados().getRg())) {
				throw new AlunoJaExisteException("Esse aluno j� foi cadastrado no sistema.");
			}
		}
		alunos.add(aluno);
	}
	
	public void removeAluno(Aluno aluno) {
		alunos.remove(aluno);
	}
	
	public Aluno verificaAluno(String identificacao) throws AlunoNaoExisteException{
		for(Aluno a: alunos) {
			if(a.getDados().getNome().equals(identificacao) || a.getDados().getMatricula().equals(identificacao)) {
				return a;
			}
		}
		throw new AlunoNaoExisteException("O aluno n�o foi encontrado no sistema.");
	}
	
	public void addAdministrador(Administrador adm) throws AdmJaExisteException{
		for(Administrador a: adms) {
			if(a.getLogin().equals(adm.getLogin())) {
				throw new AdmJaExisteException("Esse usu�rio j� foi cadastrado no sistema.");
			}
		}
		adms.add(adm);
	}
	
	public void removeAdministrador(Administrador adm) {
		adms.remove(adm);
	}
	
	public Administrador verificaAdministrador(String login) throws AdmNaoExisteException{
		for(Administrador a: adms) {
			if(a.getLogin().equals(login)) {
				return a;
			}
		}
		throw new AdmNaoExisteException("O usu�rio n�o foi encontrado no sistema.");	
	}
	
	public boolean logarAdministrador(String login, String senha) throws AdmNaoExisteException{
		for(Administrador a: adms) {
			if(a.getLogin().equals(login) && a.getSenha().equals(senha)) {
				return true;
			}
		}
		throw new AdmNaoExisteException("O usu�rio n�o foi encontrado no sistema.");	
	}
	
	public void exitSistem() {
		System.exit(0);
	}
}
