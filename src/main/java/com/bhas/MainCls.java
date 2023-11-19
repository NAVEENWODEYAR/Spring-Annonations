package com.bhas;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bhas.service.DateService;

public class MainCls
{

	private static DateService bean;

	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans2.xml");
							context.getBean(DateService.class).saveUser();
							
	}

}
