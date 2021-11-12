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
@RequestMapping("/ticket")
public class TicketController {
	
	@Autowired
	private TicketService ticketService;
	
	@RequestMapping("/getAll")
	public String getAll(Model model) {
		List<Ticket> Tickets = ticketService.getAll();
		model.addAttribute("Tickets", Tickets);
		
		return "offer";
	}
	
	@RequestMapping("/getOne")
	@ResponseBody
	public Optional<Ticket> getOne(Integer Id) {
		return ticketService.getOne(Id);
	}
	
	@PostMapping("/addNew")
	public String addNew(Ticket Ticket) {
		ticketService.addNew(Ticket);
		return "redirect:/Tickets/getAll";
	}
	
	
	@RequestMapping(value="/update", method = {RequestMethod.PUT, RequestMethod.GET})
	public String update(Ticket Ticket) {
		ticketService.update(Ticket);
		return "redirect:/Tickets/getAll";		
	}
	
	
	@RequestMapping(value="/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer Id) {
		ticketService.delete(Id);
		return "redirect:/Tickets/getAll";		
	}
}