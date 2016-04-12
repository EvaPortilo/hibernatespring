package py.edu.facitec.hibernatespring.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import py.edu.facitec.hibernatespring.controller.HomeController;
import py.edu.facitec.hibernatespring.controller.UtilidadController;


@EnableWebMvc
@ComponentScan(basePackageClasses={HomeController.class,UtilidadController.class})

public class AppWebConfiguration  extends WebMvcConfigurerAdapter{
	//metodo con retorno
	@Bean// anotacon que indica para ser gestionado por el contenedor
	public InternalResourceViewResolver internalResourceViewResolver(){
	InternalResourceViewResolver resolver= new InternalResourceViewResolver();
	
	resolver.setPrefix("/WEB-INF/views/");
	resolver.setSuffix(".jsp");
	
	 return resolver;
	
	

}
}