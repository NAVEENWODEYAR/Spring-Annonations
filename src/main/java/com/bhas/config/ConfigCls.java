package com.bhas.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigCls 
{
	public ConfigCls()
	{
		System.out.println("\nConfigCls::Constructor");
	}
	
	@Bean
	public PasswordUtils getInstance()
	{
		System.out.println("\n getInstance() using @Bean!");
		PasswordUtils pwd = new PasswordUtils("SHA-1");
		return pwd;
	}
}
