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
	public AssetClass() {
		
	}
	
	public AssetClass(long assetId, String assetClass, String subAssetClass, String assetDesc, InvestmentTheme theme,
			int allocation) {
		super();
		this.assetId = assetId;
		this.assetClass = assetClass;
		this.subAssetClass = subAssetClass;
		this.assetDesc = assetDesc;
		this.theme = theme;
		this.allocation = allocation;
	}
	@Override
	public String toString() {
		return "AssetClass [assetId=" + assetId + ", assetClass=" + assetClass + ", subAssetClass=" + subAssetClass
				+ ", assetDesc=" + assetDesc + ", theme=" + theme + ", allocation=" + allocation + "]";
	}
	
}