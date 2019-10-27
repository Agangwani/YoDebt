package com.howtodoinjava.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.howtodoinjava.demo.service.EmployeeManager;

import com.howtodoinjava.demo.company.Mortgage;

import static com.howtodoinjava.demo.dao.EmployeeDAOImpl.*;
import com.howtodoinjava.demo.dao.EmployeeDAOImpl;


@Controller
@RequestMapping("/employee-module")
public class EmployeeController 
{
	@Autowired
	EmployeeManager manager;
	Mortgage mortgage;
	/*@RequestMapping(value = "/getAllEmployees", method = RequestMethod.GET)
	public String getAllEmployees(Model model)
	{
		model.addAttribute("employees", manager.getAllEmployees());
		return "employeesListDisplay";
	}*/
	@RequestMapping(value = "/getInformation", method = RequestMethod.GET)
	public String getInformation(Model model)
	{
		model.addAttribute("Month", mortgage.getInformation());
		return "monthListDisplay";
	}
}