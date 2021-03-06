package com.magfine.mockserver.Controller;


import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;

import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class welcomeIndex extends WebMvcConfigurerAdapter
{
	@Override

	public void addViewControllers(ViewControllerRegistry registry){
		registry.addViewController( "/" ).setViewName( "forward:/welcome.html" );
		registry.setOrder( Ordered.HIGHEST_PRECEDENCE );
		super.addViewControllers( registry );

	}
}
