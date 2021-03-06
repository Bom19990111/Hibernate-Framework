package edu.phuxuan.k17.spring.democontroller.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import edu.phuxuan.k17.spring.democontroller.repository.ProductRepository;
import edu.phuxuan.k17.spring.democontroller.repository.ProductRepositoryImpl;
import edu.phuxuan.k17.spring.democontroller.services.ProductService;
import edu.phuxuan.k17.spring.democontroller.services.ProductServiceImpl;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {
	    "edu.phuxuan.k17.spring.democontroller"
	})
public class AppConfig {
	
	@Bean
    public InternalResourceViewResolver resolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setViewClass(JstlView.class);
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        return resolver;
    }
	
	@Bean
    public ProductService productService(){
        return new ProductServiceImpl();
    }

    @Bean
    public ProductRepository productRepository(){
        return new ProductRepositoryImpl();
    }

}
