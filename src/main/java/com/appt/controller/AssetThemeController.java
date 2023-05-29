//package com.appt.controller;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.appt.dto.AssetDto;
//import com.appt.model.AssetClass;
//import com.appt.model.AssetTheme;
//import com.appt.model.InvestmentTheme;
//import com.appt.repository.AssetClassRepository;
//import com.appt.repository.AssetThemeRepository;
//import com.appt.repository.InvestmentThemeRepository;
//
//
//@RestController
//@RequestMapping("/api")
//public class AssetThemeController {
//
//	@Autowired
//	private AssetThemeRepository assetThemeRepo;
//	
//	@Autowired
//	private AssetClassRepository assetRepo;
//	
//	@Autowired
//	private InvestmentThemeRepository themeRepo;
//	
//	@Autowired
//	private AssetThemeRepository assetThemeRepository;
//	
//	@PostMapping("/new/theme/{themeId}/{assetId}")
//	public ResponseEntity<String> createThemeAsset(@RequestBody AssetTheme theme,@PathVariable("assetId") long assetId,@PathVariable("themeId") long themeId){
//		
//		Optional<InvestmentTheme> optional=themeRepo.findById(themeId);
//		if(!optional.isPresent())
//			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid ");
//		InvestmentTheme investmentTheme=optional.get();
//		theme.setTheme(investmentTheme);
//	
//		
//		Optional<AssetClass> optional1=assetRepo.findById(assetId);
//		if (!optional.isPresent())
//			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Invalid ");
//		AssetClass asset=optional1.get();
//		theme.setAsset(asset);
//		assetThemeRepository.save(theme);
//		return ResponseEntity.status(HttpStatus.OK).body("Asset added successfully");
//	}
//	
//	@GetMapping("/asset/{themeName}")
//	public List<AssetDto> getAssetByThemeNmae(@PathVariable("themeName") String themeName){
//		List<AssetTheme> list=assetThemeRepo.findByThemeName(themeName);
//		
//		List<AssetDto> lDto = new ArrayList<>();
//
//		for(AssetTheme a: list) {
//			
//			AssetDto dto= new AssetDto();
//			dto.setThemeName(a.getThemeName());
//			dto.setAsset(a.getAsset().getAssetClass());
//			dto.setAssetDesc(a.getAsset().getAssetDesc());
//			dto.setInvestmentHorizon(a.getTheme().getInvestmentHorizon());
//			dto.setRisk(a.getTheme().getRisk());
//			dto.setSubAssetClass(a.getAsset().getAssetDesc());
//			dto.setThemeName(a.getTheme().getThemeName());
//			lDto.add(dto);
//			
//			}
//		return lDto;
//		}
//		
//
//	
//}
