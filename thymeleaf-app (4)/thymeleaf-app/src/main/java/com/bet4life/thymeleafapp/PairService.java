package com.bet4life.thymeleafapp;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PairService {

	@Autowired
	private PairRepository pairRepository;
	
	
	public List<Pair> getAll() {
		return (List<Pair>) pairRepository.findAll();
	}

	
	public Optional<Pair> getOne(Integer Id) {
		return pairRepository.findById(Id);
	}

	public void addNew(Pair pair) {
		pairRepository.save(pair);
	}
	
	public void update(Pair pair) {
		pairRepository.save(pair);
	}
	
	public void delete(Integer Id) {
		pairRepository.deleteById(Id);
	}
}