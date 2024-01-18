package com.springmvc.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.bean.DomainBean;
import com.springmvc.entity.Domain;
import com.springmvc.service.DomainService;

@Controller
public class DomainController {
	public static Logger log = LoggerFactory.getLogger(DomainController.class.getSimpleName());
	@Autowired
	DomainService domainService;

	@RequestMapping(path = "/get", method = RequestMethod.GET)
	public ModelAndView getDomain(Model model) {
		model.addAttribute("cmd", new Domain());
		return new ModelAndView("Domain", "domain",new Domain() );
	}
	
	@RequestMapping(path= "/save", method = RequestMethod.POST)
	public ModelAndView saveDomain(@ModelAttribute(name="domain") DomainBean domain) {
		System.out.println(domain);
		domainService.save(domain);
		return new ModelAndView("Success");
	}
	
	@RequestMapping(path = "/update", method = RequestMethod.GET)
	public ModelAndView updateDomain(Model model) {
		model.addAttribute("cmd", new Domain());
		return new ModelAndView("UpdateDomain", "domain",new Domain() );
	}
	
	@RequestMapping(path= "/updateDomain", method = RequestMethod.POST)
	public ModelAndView updateDomain(@ModelAttribute(name="domain") DomainBean domain)
	{
		domainService.update(domain);
		return new ModelAndView("Success");
	}
	
	@RequestMapping(path = "/delete", method = RequestMethod.GET)
	public ModelAndView delDomain(Model model) {
		model.addAttribute("cmd", new Domain());
		return new ModelAndView("Delete", "domain",new Domain() );
	}
	
	@RequestMapping(path= "/deleteDomain", method = RequestMethod.POST)
	public ModelAndView deleteDomain(@ModelAttribute(name="domain") DomainBean domain)
	{
		domainService.delete(domain);
		return new ModelAndView("Success");
	}
	
	@RequestMapping(path = "/search/city/{searchCity}", method = RequestMethod.GET)
	public ModelAndView seachCity(@PathVariable(value = "searchCity") String searchCity,
			@RequestParam(value = "city") String city,
			@RequestParam(value = "altercity") String altercity, ModelMap map) {
		// String parameter = request.getParameter("altercity");
		Map<String, Object> cities = getCities();
		Optional<Entry<String, Object>> findFirst = cities.entrySet().stream()
				.filter(e -> e.getKey().equalsIgnoreCase(searchCity)).findFirst();
		// try {

//		Entry<String, Object> entry = findFirst
//				.orElseThrow(() -> new IllegalArgumentException("City not found"));
		if (findFirst.isPresent()) {
			Object value = findFirst.get().getValue();
			if (value == null) {
				map.addAttribute("message", "City not found");
			} else {
				map.addAttribute("city", value);
			}
		} else {
			map.addAttribute("message", "City not found");
		}

		// } catch (IllegalArgumentException e1) {
		// map.addAttribute("message", e1.getMessage());
		// }

		return new ModelAndView("citySearch");
	}
	
	private Map<String, Object> getCities() {
		Map<String, Object> map = new HashMap<>();

		map.put("BENGALURU", "BENGALURU");
		map.put("HYDERABAD", "HYDERABAD");
		map.put("KOCHI", "KOCHI");
		map.put("THRIVENDRAM", "THRIVENDRAM");

		return map;
	}
}
