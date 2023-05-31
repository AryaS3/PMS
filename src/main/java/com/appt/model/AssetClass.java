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
public class AssetClass {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long assetId;
	private String assetClass;
	private String subAssetClass;
	private String assetDesc;
	private String liquidity;
	private String returns;
	private String InvestmentHorizon;
	private String Risk;
  @ManyToOne(cascade = CascadeType.ALL)
	private InvestmentTheme theme;
	
  
  
	private int allocation;
//	
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinColumn(name="fk_asset_id",referencedColumnName="assetId")
//	private List<AssetClass> asset;
	
	
//	@OneToOne(mappedBy ="AssetClass")
//	private InvestmentTheme theme;
	
	public long getAssetId() {
		return assetId;
	}
	public void setAssetId(long assetId) {
		this.assetId = assetId;
	}
	
	public String getAssetClass() {
		return assetClass;
	}
	public void setAssetClass(String assetClass) {
		this.assetClass = assetClass;
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
	
	public InvestmentTheme getTheme() {
		return theme;
	}
	public void setTheme(InvestmentTheme theme) {
		this.theme = theme;
	}
	
	
	
	public String getInvestmentHorizon() {
		return InvestmentHorizon;
	}
	public void setInvestmentHorizon(String investmentHorizon) {
		InvestmentHorizon = investmentHorizon;
	}
	public String getRisk() {
		return Risk;
	}
	public void setRisk(String risk) {
		Risk = risk;
	}
	public String getLiquidity() {
		return liquidity;
	}
	public void setLiquidity(String liquidity) {
		this.liquidity = liquidity;
	}
	
	public String getReturns() {
		return returns;
	}
	public void setReturns(String returns) {
		this.returns = returns;
	}
	public AssetClass() {
		
	}
	
	
	
	public AssetClass(long assetId, String assetClass, String subAssetClass, String assetDesc, String liquidity,
			String returns, String investmentHorizon, String risk, InvestmentTheme theme, int allocation) {
		super();
		this.assetId = assetId;
		this.assetClass = assetClass;
		this.subAssetClass = subAssetClass;
		this.assetDesc = assetDesc;
		this.liquidity = liquidity;
		this.returns = returns;
		InvestmentHorizon = investmentHorizon;
		Risk = risk;
		this.theme = theme;
		this.allocation = allocation;
	}
	@Override
	public String toString() {
		return "AssetClass [assetId=" + assetId + ", assetClass=" + assetClass + ", subAssetClass=" + subAssetClass
				+ ", assetDesc=" + assetDesc + ", liquidity=" + liquidity + ", returns=" + returns
				+ ", InvestmentHorizon=" + InvestmentHorizon + ", Risk=" + Risk + ", theme=" + theme + ", allocation="
				+ allocation + "]";
	}
	
}