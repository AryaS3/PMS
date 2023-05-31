package com.appt.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import javax.annotation.PostConstruct;

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
	@PostConstruct
	public void newAssetData() throws IOException {
		
		String line = "";
		BufferedReader br = new BufferedReader(new FileReader("src/main/resources/AssetAllocation.csv"));
		try {
			

			while ((line = br.readLine()) != null) {
				String[] data = line.split(",");

				AssetClass a = new AssetClass();
				a.setAssetClass(data[0]);
				a.setSubAssetClass(data[1]);
				a.setAssetDesc(data[2]);
//				a.setTheme(data[3]);
				a.setLiquidity(data[3]);
				a.setReturns(data[4]);
				a.setInvestmentHorizon(data[5]);
				a.setRisk(data[6]);
				assetRepo.save(a);
				
		}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			br.close();
		}
	}
		
		
	}
	
