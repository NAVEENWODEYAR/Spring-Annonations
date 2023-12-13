package com.bhas.beanScope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "prototype")
public class BeanScope 
{
	public void m1()
	{
		System.out.println("\n Bean Scopes,");
	}
}
