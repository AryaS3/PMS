package com.appt.controller;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.appt.model.InvestmentTheme;

import com.appt.repository.InvestmentThemeRepository;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("/api")
public class InvestmentThemeController {
	@Autowired
	private InvestmentThemeRepository themeRepository;
	
	@PostMapping("/add/theme")
	public InvestmentTheme addTheme(@RequestBody InvestmentTheme investmentTheme) {

		return themeRepository.save(investmentTheme);
	}
	
//	public ResponseEntity<String> createThemeAsset(@RequestBody InvestmentTheme theme,@PathVariable("assetId") long assetId){
//		Optional<AssetClass> optional=
//	}

	@GetMapping("/get/{themeName}")
	public InvestmentTheme getthemeName(@PathVariable("themeName") String themeName){
		return themeRepository.findBythemeNameContaining(themeName);
	}
	
}
