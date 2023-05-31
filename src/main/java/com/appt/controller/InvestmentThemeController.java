package com.appt.controller;





import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appt.model.AssetClass;
import com.appt.model.InvestmentTheme;
import com.appt.model.PortfolioComposition;
import com.appt.repository.AssetClassRepository;
import com.appt.repository.InvestmentThemeRepository;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("/api")
public class InvestmentThemeController {
	@Autowired
	private InvestmentThemeRepository themeRepository;
	
	@Autowired
	private AssetClassRepository assetRepo;
	
	@PostMapping("/add/theme")
	public InvestmentTheme addTheme(@RequestBody InvestmentTheme investmentTheme) {

		return themeRepository.save(investmentTheme);
	}
	
//	@PostMapping("/new/theme")
//	public ResponseEntity<String> createThemeAsset(@RequestBody InvestmentTheme theme,@PathVariable("assetId") long assetId){
//		Optional<AssetClass> optional=assetRepo.findById(assetId);
//		if (!optional.isPresent())
//			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid ");
//		AssetClass asset=optional.get();
//		InvestmentTheme.setTheme(asset);
//		themeRepository.save(theme);
//		return ResponseEntity.status(HttpStatus.OK).body("Asset added successfully");
//	}

	@GetMapping("/get/{themeName}")
	public InvestmentTheme getthemeName(@PathVariable("themeName") String themeName){
		return themeRepository.findBythemeNameContaining(themeName);
	}
	
	@GetMapping("/theme/getAll") 
	public List<InvestmentTheme> getTheme(){
		return themeRepository.findAll();
	}
	
}
