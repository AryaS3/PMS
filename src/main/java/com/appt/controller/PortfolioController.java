package com.appt.controller;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appt.model.InvestmentTheme;
import com.appt.model.PortfolioHeader;
import com.appt.repository.InvestmentThemeRepository;
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
	
	
	@Autowired
	private InvestmentThemeRepository themeRepo;
	
	@PostMapping("/new")

	public PortfolioHeader createPortfolio(@RequestBody PortfolioHeader portfolioHeader) {

	return portfolioRepo.save(portfolioHeader);

	}

	@PostMapping("/new/{themeId}")
	public ResponseEntity<String> portfolioByName(@RequestBody PortfolioHeader portfolioHeader,@PathVariable("themeId") long themeId){
	
	Optional<InvestmentTheme> optional=themeRepo.findById(themeId);
	if (!optional.isPresent())
		   return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid portfolio");
	InvestmentTheme theme=optional.get();
	portfolioHeader.setTheme(theme);
	portfolioRepo.save(portfolioHeader);
	return ResponseEntity.status(HttpStatus.OK).body("Theme added successfully");
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
	
//	@PutMapping("/update/{portfolioName}")
//	public ResponseEntity<String> updateBalanceByName(@PathVariable("portfolioName") String  portfolioName){
//		String str=portfolioService.updateBalanceByName()
//	}

}

