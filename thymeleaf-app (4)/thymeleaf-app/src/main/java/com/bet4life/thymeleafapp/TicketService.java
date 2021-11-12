package com.bet4life.thymeleafapp;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketService {

	@Autowired
	private TicketRepository ticketRepository;
	
	
	public List<Ticket> getAll() {
		return (List<Ticket>) ticketRepository.findAll();
	}

	
	public Optional<Ticket> getOne(Integer Id) {
		return ticketRepository.findById(Id);
	}

	public void addNew(Ticket Ticket) {
		ticketRepository.save(Ticket);
	}
	
	public void update(Ticket Ticket) {
		ticketRepository.save(Ticket);
	}
	
	public void delete(Integer Id) {
		ticketRepository.deleteById(Id);
	}

}