package br.com.confidencecambio.javabasico.abstractClass;

import javax.validation.constraints.NotNull;


public class ModelClass {
	
	@NotNull
	private String nome;

	public ModelClass(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}
