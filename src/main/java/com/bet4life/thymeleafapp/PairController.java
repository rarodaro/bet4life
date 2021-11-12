package com.bet4life.thymeleafapp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/offer")
public class PairController {
	
	@Autowired
	private PairService pairService;
	
	@RequestMapping("/getAll")
	public String getAll(Model model) {
		List<Pair> pairs = pairService.getAll();
		model.addAttribute("pairs", pairs);
		
		return "offer";
	}
	
	@RequestMapping("/getOne")
	@ResponseBody
	public Optional<Pair> getOne(Integer Id) {
		return pairService.getOne(Id);
	}
	
	@PostMapping("/addNew")
	public String addNew(Pair pair) {
		pairService.addNew(pair);
		return "redirect:/pairs/getAll";
	}
	
	
	@RequestMapping(value="/update", method = {RequestMethod.PUT, RequestMethod.GET})
	public String update(Pair pair) {
		pairService.update(pair);
		return "redirect:/pairs/getAll";		
	}
	
	
	@RequestMapping(value="/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer Id) {
		pairService.delete(Id);
		return "redirect:/pairs/getAll";		
	}
}