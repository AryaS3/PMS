package com.appt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appt.model.AssetClass;
import com.appt.model.Nse;
import com.appt.repository.AssetClassRepository;

@Service
public class AssetService {

	@Autowired
	private AssetClassRepository assetRepo;
//	
//	public List<AssetClass> allStocks() {
//		return assetRepo.findAll();
//	}

	public List<AssetClass> findAll() {
		
		return assetRepo.findAll();
	}
	
}
