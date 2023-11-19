package com.bhas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bhas.dao.DateDAO;

@Service
public class DateService 
{
	@Autowired
	private DateDAO dao;
	
	public DateService()
	{
		System.out.println("\nDateService::Constructor");
	}
	
	public void saveUser()
	{
		dao.saveUser();
	}
	
	
}
