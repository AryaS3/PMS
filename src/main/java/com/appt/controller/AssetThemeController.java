package com.appt.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appt.dto.AssetDto;
import com.appt.model.AssetClass;
import com.appt.model.AssetTheme;
import com.appt.repository.AssetThemeRepository;


@RestController
@RequestMapping("/api")
public class AssetThemeController {

	@Autowired
	private AssetThemeRepository assetThemeRepo;
	
//	@GetMapping("/asset/{themeName}")
//	public List<AssetDto> getAssetByThemeNmae(@PathVariable("themeName") String themeName){
//		List<AssetTheme> list=assetThemeRepo.findByThemeName(themeName);
//		
//		List<AssetDto> lDto = new ArrayList<>();
//
//		for(AssetTheme a: list) {
//			
//			AssetDto dto= new AssetDto();
//			dto.setAllocation(a.getAllocation());
//			dto.setAsset(a.getAsset().getAsset());
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

	
}
