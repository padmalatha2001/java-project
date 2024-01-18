package com.crnts.office.feuji.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.crnts.office.feuji.Employee;

@Controller
public class EmployeeController {

	private static Logger log = LoggerFactory.getLogger(EmployeeController.class.getSimpleName());

	@RequestMapping(path = "/check", method = RequestMethod.GET)
	public ModelAndView check() {
		System.out.println("hello");
		return new ModelAndView("Demo", "demo", new Object());
	}

	@RequestMapping(path = "/employee", method = RequestMethod.GET)
	public ModelAndView employee() {

		return new ModelAndView("employee", "emp", new Employee());

	}

	@RequestMapping(path = "/employee", method = RequestMethod.POST)
	public ModelAndView createEmployee(@ModelAttribute Employee employee) {
		log.info(employee.toString());
		return new ModelAndView("employee", "emp", employee);
	}
}
