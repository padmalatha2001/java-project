package com.crnts.office.feuji.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.crnts.office.feuji.entity.Domain;
import com.crnts.office.feuji.service.DomainService;

@Controller
public class DomainController {
	public static Logger log = LoggerFactory.getLogger(BookController.class.getSimpleName());
	@Autowired
	DomainService domainService;

	@RequestMapping(path = "/domain", method = RequestMethod.GET)
	public ModelAndView getDomain() {
		return new ModelAndView("Domain", "domain", new Domain());
	}

	@RequestMapping(path = "/domainForm", method = RequestMethod.POST)
	public ModelAndView saveDomain(@ModelAttribute("domain") Domain domain) {
		domainService.save(domain);
		System.out.println("data inserted");
		return new ModelAndView("Success");
	}
}
