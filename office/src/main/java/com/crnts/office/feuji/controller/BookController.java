package com.crnts.office.feuji.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.crnts.office.feuji.Book;

@Controller
public class BookController {

	public static Logger log = LoggerFactory.getLogger(BookController.class.getSimpleName());

	@RequestMapping(path = "/book", method = RequestMethod.GET)
	public ModelAndView standard() {

		return new ModelAndView("Book", "book", new Book());
	}

	@RequestMapping(path = "/book", method = RequestMethod.POST)
	public ModelAndView createbook(@ModelAttribute Book book, ModelMap model) {
		model.addAttribute("header", "Wecome to book blogs");
		log.info(book.toString());
		String name = book.getBookName();
		String author = book.getAuthorName();
		System.out.println(name + " written by" + author);
		return new ModelAndView("Book", "book", book);
	}
}
