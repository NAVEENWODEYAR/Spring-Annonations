package com.bhas.utils;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainCls 
{

	public static void main(String[] args) 
	{
		// Object for ClassPathXmlApplicationContext,
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
	}

}
