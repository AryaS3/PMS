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
import com.appt.repository.AssetClassRepository;
import com.appt.repository.InvestmentThemeRepository;

@ComponentScan
@RestController
@CrossOrigin(origins="*")
@RequestMapping("/api")
public class AssetClassController {
	
	@Autowired
	private AssetClassRepository assetRepo;
	
	@Autowired
	private InvestmentThemeRepository themeRepo;
	
	
	
	@PostMapping("/add/asset")
	public AssetClass addAsset(@RequestBody AssetClass asset) {
		return assetRepo.save(asset);
		
	}
	
//	@PostMapping("/add" )
//	publicResponseEntity<String> createTheme(@RequestBody AssetClass assetClass,){
//		assetRepo.save(assetClass);
//		Optional<InvestmentTheme> optional=themeRepo.findById(id);
//		if(!optional.isPresent()) 
//			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid Theme");
//		InvestmentTheme theme=optional.get();
//		assetClass.setTheme(theme);
//		assetRepo.save(assetClass);
//		    return ResponseEntity.status(HttpStatus.OK).body("Id added Successfully");
//	}
//	
	@GetMapping("/get") 
	public List<AssetClass> getAllAssets(){
		return assetRepo.findAll();
	} 
	
//	@GetMapping("/asset/{themeName}")
//	public List<AssetDto> getAssetByThemeNmae(@PathVariable("themeName") String themeName){
//		List<AssetClass> list=assetRepo.findByThemeName(themeName);
//		
//		List<AssetDto> lDto = new ArrayList<>();
//		
//		for(AssetClass a :list) {
//			AssetDto dto= new AssetDto();
//			dto.setAsset(a.getAsset());
//			dto.setSubAssetClass(a.getSubAssetClass());
//			dto.setRisk(a.getTheme().getRisk());
//			dto.setInvestmentHorizon(a.getTheme().getInvestmentHorizon());
////			dto.setAllocation(a.getAllocation());
//			dto.setAssetDesc(a.getAssetDesc());
//			dto.setThemeName(a.getTheme().getThemeName());
//			lDto.add(dto);
//		}
//		return lDto;
//	}
//	
	
	
}
