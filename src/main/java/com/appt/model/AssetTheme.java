package com.appt.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class AssetTheme {


	@Id
	private int allocation;
	
	@ManyToOne
	private AssetClass asset;
	
	@ManyToOne
	private InvestmentTheme theme;



	public int getAllocation() {
		return allocation;
	}

	public void setAllocation(int allocation) {
		this.allocation = allocation;
	}

	public AssetClass getAsset() {
		return asset;
	}

	public void setAsset(AssetClass asset) {
		this.asset = asset;
	}

	public InvestmentTheme getTheme() {
		return theme;
	}

	public void setTheme(InvestmentTheme theme) {
		this.theme = theme;
	}

	public AssetTheme(int allocation, AssetClass asset, InvestmentTheme theme) {
		super();
		this.allocation = allocation;
		this.asset = asset;
		this.theme = theme;
	}

	@Override
	public String toString() {
		return "AssetTheme [allocation=" + allocation + ", asset=" + asset + ", theme=" + theme + "]";
	}

	
}
