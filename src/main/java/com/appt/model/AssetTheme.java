//package com.appt.model;
//
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.ManyToOne;
//
//@Entity
//public class AssetTheme {
//
//
//	@Id
//	private String themeName;
//	
//	@ManyToOne
//	private AssetClass asset;
//	
//	@ManyToOne
//	private InvestmentTheme theme;
//
//
//
//	
//
//	public String getThemeName() {
//		return themeName;
//	}
//
//	public void setThemeName(String themeName) {
//		this.themeName = themeName;
//	}
//
//	public void setTheme(InvestmentTheme theme) {
//		this.theme = theme;
//	}
//
//	public AssetClass getAsset() {
//		return asset;
//	}
//
//	public void setAsset(AssetClass asset) {
//		this.asset = asset;
//	}
//
//	public InvestmentTheme getTheme() {
//		return theme;
//	}
//	public AssetTheme() {
//		
//	}
//
//	public AssetTheme(String themeName, AssetClass asset, InvestmentTheme theme) {
//		super();
//		this.themeName = themeName;
//		this.asset = asset;
//		this.theme = theme;
//	}
//
//	@Override
//	public String toString() {
//		return "AssetTheme [themeName=" + themeName + ", asset=" + asset + ", theme=" + theme + "]";
//	}
//
//	
//	
//	
//}
