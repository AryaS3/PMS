package com.appt.controller;

import java.util.ArrayList;
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
import com.appt.dto.PortfolioDto;
import com.appt.model.PortfolioComposition;
import com.appt.model.PortfolioHeader;
import com.appt.repository.CompositionRepository;
import com.appt.repository.PortfolioRepository;
import com.appt.service.CompositionService;

@RestController
@CrossOrigin(origins="*")

@RequestMapping("/api/composition/")
public class CompositionController {
	
	@Autowired
	private CompositionRepository compositionRepository;
	

	
	@Autowired
	private PortfolioRepository portRepo;
	@Autowired
	private CompositionService service; 
	
	@PostMapping("/new/{portfolioName}")
	public ResponseEntity<String> createPortfolio(@RequestBody PortfolioComposition portfolioComposition,@PathVariable("portfolioName") String portfolioName) {
		
		Optional<PortfolioHeader> optional=portRepo.findById(portfolioName);
		if (!optional.isPresent())
	   return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid portfolio");
		PortfolioHeader portfolioHeader = optional.get();
		portfolioComposition.setHeader(portfolioHeader);
		compositionRepository.save(portfolioComposition);

		return ResponseEntity.status(HttpStatus.OK).body("Security added successfully");
		

	}
	
	
	
	@GetMapping("/get") 
	public List<PortfolioComposition> getcompo(){
		return compositionRepository.findAll();
	}
	
	@GetMapping("/get/security/{portfolioName}")
	public List<PortfolioDto> getSecurityByPortfolioName(@PathVariable("portfolioName") String portfolioName){
		List<PortfolioComposition> list=compositionRepository.findByPortfolioName(portfolioName);
		
		List<PortfolioDto> lDto=new ArrayList<>();
		for(PortfolioComposition composition:list) {
			PortfolioDto dto=new PortfolioDto();
			dto.setPortfolioName(composition.getHeader().getPortfolioName());
			dto.setTotalTransaction(composition.getTotalTransaction());
			dto.setPrice(composition.getPrice());
			dto.setSecurityName(composition.getSecurityName());
			dto.setTransactionDate(composition.getTransactionDate());
			dto.setUnits(composition.getUnits());
			lDto.add(dto);
		}
		return lDto;
	}
	

	@PutMapping("/securityname/{securityName}/{id}")
	public ResponseEntity<String> updateNoOfSecurity(@PathVariable("securityName") String securityName, @PathVariable("id") long id){
		String str=service.updateNoOfSecurity(securityName,id);
		return ResponseEntity.ok().body(str);
	}
	

	@DeleteMapping("/delete/{securityName}")
	@Transactional
	public ResponseEntity<String> removeBysecurityName(@PathVariable("securityName") String securityName) {
		String str = service.deleteBysecurityName(securityName);
		return ResponseEntity.ok().body(str);
	}

}
	
