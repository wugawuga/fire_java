package wuga.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import wuga.intercepter.AuthCheckIntercepter;

@Configuration
@EnableWebMvc
public class Spring_mvc extends WebMvcConfigurerAdapter{
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}

	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		registry.jsp().prefix("/WEB-INF/views/");
	}
	
	@Bean
	public AuthCheckIntercepter authCheckIntercepter() {
		return new AuthCheckIntercepter();
	}
}
