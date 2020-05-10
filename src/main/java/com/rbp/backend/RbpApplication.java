package com.rbp.backend;

import javax.faces.webapp.FacesServlet;
import javax.servlet.DispatcherType;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class RbpApplication {

	public static void main(String[] args) {
		SpringApplication.run(RbpApplication.class, args);
		System.out.println("Ajay");
	}
	
	 @Bean
	    public ServletRegistrationBean facesServlet() {
	        ServletRegistrationBean registration = new ServletRegistrationBean(new FacesServlet(), new String[]{"*.xhtml"});
	        registration.setName("Faces Servlet");
	        registration.setLoadOnStartup(1);
	        return registration;
	    }
	
	   

	    @Bean
	    public ServletContextInitializer servletContextInitializer() {
	        return servletContext -> {
	            // JSF
	            servletContext.setInitParameter("com.sun.faces.forceLoadConfiguration", Boolean.TRUE.toString());
	            servletContext.setInitParameter("javax.faces.FACELETS_SKIP_COMMENTS", Boolean.TRUE.toString());
	            // PRIMEFACES
	            servletContext.setInitParameter("primefaces.THEME", "bootstrap");
	            servletContext.setInitParameter("primefaces.CLIENT_SIDE_VALIDATION", Boolean.TRUE.toString());
	            servletContext.setInitParameter("primefaces.FONT_AWESOME", Boolean.TRUE.toString());
	            servletContext.setInitParameter("primefaces.UPLOADER", "commons");
	            // BOOTSFACES
	            servletContext.setInitParameter("net.bootsfaces.get_fontawesome_from_cdn", Boolean.TRUE.toString());
	            servletContext.setInitParameter("BootsFaces_USETHEME", Boolean.TRUE.toString());
	        };
	    }
	
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {

			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/states").allowedOrigins("http://localhost:4200");
			}
			
		};
	}

}
