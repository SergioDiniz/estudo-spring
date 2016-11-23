package br.com.controladores;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pizzas")
public class PizzariaController {

	public PizzariaController() {
		// TODO Auto-generated constructor stub
		System.out.println("Cheguei no controller");
	}
	
	@RequestMapping("/ola/{nome}")
	public String ola(@PathVariable String nome){
		return "Ola " + nome;
	}
	
}
