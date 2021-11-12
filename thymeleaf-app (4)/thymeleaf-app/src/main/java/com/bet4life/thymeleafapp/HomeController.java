package com.bet4life.thymeleafapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	
	private PairRepository pairRepository;
	
	@RequestMapping("/home")
	public @ResponseBody Iterable<Pair> getAllPairs(Model model) {
	    // This returns a JSON or XML with the users
	    return pairRepository.findAll();
	  }
}