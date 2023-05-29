package com.appt.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appt.dto.AssetDto;
import com.appt.model.AssetClass;
import com.appt.model.InvestmentTheme;
import com.appt.model.Nse;
import com.appt.repository.AssetClassRepository;
import com.appt.repository.InvestmentThemeRepository;
import com.appt.service.AssetService;

@ComponentScan
@RestController
@CrossOrigin(origins="*")
@RequestMapping("/api")
public class AssetClassController {
	
	@Autowired
	private AssetClassRepository assetRepo;
	
	@Autowired
	private AssetService assetService;
	
	
	@Autowired
	private InvestmentThemeRepository themeRepo;
	
	
	
	@PostMapping("/add/asset")
	public AssetClass addAsset(@RequestBody AssetClass asset) {
		return assetRepo.save(asset);
		
	}
	
	@PostMapping("/new/{themeId}")
	public  ResponseEntity<String> createAsset(@RequestBody AssetClass asset,@PathVariable("themeId")long themeId){
		Optional<InvestmentTheme> optional=themeRepo.findById(themeId);
		if (!optional.isPresent())
			   return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid portfolio");
		InvestmentTheme theme=optional.get();
		asset.setTheme(theme);
		assetRepo.save(asset);
		return ResponseEntity.status(HttpStatus.OK).body("Security added successfully");
	}
//	@PostMapping("add/new/{themeId}")
//	public
//	

	@GetMapping("/get") 
	public List<AssetClass> getAllAssets(){
		return assetService.findAll();
	} 
	
	
//	@GetMapping("/all")
//	public List<Nse> getAllStocks(){
//		return nseService.allStocks();
//	}
	
	
	
	@GetMapping("/asset/{themeName}")
	public List<AssetDto> getAssetByThemeNmae(@PathVariable("themeName") String themeName){
		List<AssetClass> list=assetRepo.findByThemeName(themeName);
		
		List<AssetDto> lDto = new ArrayList<>();
		
		for(AssetClass a :list) {
			AssetDto dto= new AssetDto();
			dto.setAsset(a.getAssetClass());
			dto.setSubAssetClass(a.getSubAssetClass());
//			dto.setRisk(a.getTheme().getRisk());
//			dto.setInvestmentHorizon(a.getTheme().getInvestmentHorizon());
//			dto.setAllocation(a.getAllocation());
			dto.setAssetDesc(a.getAssetDesc());
//			dto.setThemeName(a.getTheme().getThemeName());
			lDto.add(dto);
		}
		return lDto;
	}
	
	
	
}
