package br.com.configuracoes;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@EnableWebMvc
@Controller
@ComponentScan(basePackages="br.com")
public class ConfiguracoesWeb extends WebMvcConfigurerAdapter{
	public ConfiguracoesWeb() {
		// TODO Auto-generated constructor stub
		System.out.println("Cheguei nas configurações");
	}
}
