package com.appt.dto;

public class AssetDto {

	private String themeName;
	private String asset;
	private String subAssetClass;
	private String assetDesc;
	private int allocation;
	private String risk;
	private String investmentHorizon;
	
	public String getThemeName() {
		return themeName;
	}
	public void setThemeName(String themeName) {
		this.themeName = themeName;
	}
	
	public String getAsset() {
		return asset;
	}
	public void setAsset(String asset) {
		this.asset = asset;
	}
	public String getSubAssetClass() {
		return subAssetClass;
	}
	public void setSubAssetClass(String subAssetClass) {
		this.subAssetClass = subAssetClass;
	}
	public String getAssetDesc() {
		return assetDesc;
	}
	public void setAssetDesc(String assetDesc) {
		this.assetDesc = assetDesc;
	}
	public int getAllocation() {
		return allocation;
	}
	public void setAllocation(int allocation) {
		this.allocation = allocation;
	}
	public String getRisk() {
		return risk;
	}
	public void setRisk(String risk) {
		this.risk = risk;
	}
	public String getInvestmentHorizon() {
		return investmentHorizon;
	}
	public void setInvestmentHorizon(String investmentHorizon) {
		this.investmentHorizon = investmentHorizon;
	}
	
		
}
