package com.bhas.dao;

import org.springframework.stereotype.Repository;

@Repository
public class DateDAO 
{
	public DateDAO()
	{
		System.out.println("\nDateDAO::Constructor");
	}
	
	public boolean saveUser()
	{
		System.out.println("\nUser saved to db.........");
		return true;
	}
}
