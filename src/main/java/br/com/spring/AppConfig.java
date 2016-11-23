package br.com.spring;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class AppConfig implements WebApplicationInitializer{

	public void onStartup(ServletContext servletContext) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("Cheguei no app config");
		AnnotationConfigWebApplicationContext webCon = new AnnotationConfigWebApplicationContext();
		webCon.setConfigLocations("br.com.configuracoes");
		Dynamic appServlet = servletContext.addServlet("appServlet", new DispatcherServlet(webCon));
		
		appServlet.setLoadOnStartup(1);
		appServlet.addMapping("/app/*");
		
		servletContext.addListener(new ContextLoaderListener(webCon));
	}

}
