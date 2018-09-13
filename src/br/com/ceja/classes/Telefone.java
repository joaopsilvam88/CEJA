package br.com.ceja.classes;

public class Telefone {

	private int prefixo, ddd, numero;
	private String operadora;
	
	public Telefone(int prefixo, int ddd, int numero, String operadora) {
		this.prefixo = prefixo;
		this.ddd = ddd;
		this.numero = numero;
		this.operadora = operadora;
	}
	
	public int getPrefixo() {
		return prefixo;
	}
	
	public void setPrefixo(int prefixo) {
		this.prefixo = prefixo;
	}
	
	public int getDdd() {
		return ddd;
	}
	
	public void setDdd(int ddd) {
		this.ddd = ddd;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String getOperadora() {
		return operadora;
	}
	
	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}
	
	
}
