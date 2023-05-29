package com.appt.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;




@Entity
public class InvestmentTheme {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long themeId;
	private String themeName;
	private String risk;
	private String investmentHorizon;
	
	
//	@OneToOne(cascade = CascadeType.ALL)
//	@OneToMany(mappedBy="InvestmentTheme")
//	@JoinColumn(name="fk_asset_id",referencedColumnName="assetId")
//	private List<AssetClass> asset;
	
	public long getThemeId() {
		return themeId;
	}
	public void setThemeId(long themeId) {
		this.themeId = themeId;
	}
	public String getThemeName() {
		return themeName;
	}
	public void setThemeName(String themeName) {
		this.themeName = themeName;
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
	
//	public AssetClass getAsset() {
//		return asset;
//	}
//	public void setAsset(AssetClass asset) {
//		this.asset = asset;
//	}
	public InvestmentTheme() {
		
	}
public InvestmentTheme(long themeId, String themeName, String risk, String investmentHorizon) {
	super();
	this.themeId = themeId;
	this.themeName = themeName;
	this.risk = risk;
	this.investmentHorizon = investmentHorizon;
}
@Override
public String toString() {
	return "InvestmentTheme [themeId=" + themeId + ", themeName=" + themeName + ", risk=" + risk
			+ ", investmentHorizon=" + investmentHorizon + "]";
}
	
	
	
	
}
