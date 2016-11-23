package br.com.controllers;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import org.springframework.context.annotation.Scope;
import org.springframework.web.context.WebApplicationContext;

@Scope(value = WebApplicationContext.SCOPE_SESSION)
@Named(value = "testeController")
public class TesteController implements Serializable{
	
	private String teste;
	
	public TesteController() {
		// TODO Auto-generated constructor stub
	}
	
	@PostConstruct
	private void init(){
		System.out.println("Iniciou");
	}
	
	public void mudarNome(){
		setTeste("Ola");
	}

	public String getTeste() {
		return teste;
	}

	public void setTeste(String teste) {
		this.teste = teste;
	}
	
	
	
	
}
