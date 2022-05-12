package br.com.emailproject.model;

public class Email {
	
	private String desinatario;
	private String assunto;
	private String texto;

	public String getDesinatario() {
		return desinatario;
	}

	public void setDesinatario(String desinatario) {
		this.desinatario = desinatario;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

}
