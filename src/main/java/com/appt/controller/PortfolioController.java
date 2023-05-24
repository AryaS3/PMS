package com.appt.controller;

import java.util.List;


import javax.transaction.Transactional;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.appt.model.PortfolioHeader;
import com.appt.repository.PortfolioRepository;
import com.appt.service.PortfolioControllerService;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("/api/portfolio/")
public class PortfolioController {
	
	@Autowired
	private PortfolioRepository portfolioRepo;
	

	@Autowired
	private PortfolioControllerService service;
	
	@PostMapping("/new")

	public PortfolioHeader createPortfolio(@RequestBody PortfolioHeader portfolioHeader) {

	return portfolioRepo.save(portfolioHeader);

	}

	
	@GetMapping("/get") 
	public List<PortfolioHeader> getportfolios(){
		return portfolioRepo.findAll();
	}
	
	@GetMapping("/name/{portfolioName}")
	public PortfolioHeader getPortfolioByName(@PathVariable("portfolioName") String portfolioName) {
		return portfolioRepo.findByPortfolioNameContaining(portfolioName);
		
	}
	
	
	
	@DeleteMapping("/delete/{portfolioName}")
	@Transactional
	public ResponseEntity<String> removePortfolioByName(@PathVariable("portfolioName") String portfolioName) {
		String str = service.deletePortfolioByName(portfolioName);
		return ResponseEntity.ok().body(str);
	}
	
	

}

