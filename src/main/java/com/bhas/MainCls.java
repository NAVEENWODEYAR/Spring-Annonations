package com.bhas;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainCls
{

	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans2.xml");
	}

}
