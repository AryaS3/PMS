package com.appt.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


@Entity
public class AssetClass {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long assetId;
	private String assetClass;
	private String subAssetClass;
	private String assetDesc;
//	@OneToOne(cascade = CascadeType.ALL)
//	private InvestmentTheme theme;
	private int allocation;
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
	public AssetClass(long assetId, String assetClass, String subAssetClass, String assetDesc, int allocation) {
		super();
		this.assetId = assetId;
		this.assetClass = assetClass;
		this.subAssetClass = subAssetClass;
		this.assetDesc = assetDesc;
		this.allocation = allocation;
	}
	@Override
	public String toString() {
		return "AssetClass [assetId=" + assetId + ", assetClass=" + assetClass + ", subAssetClass=" + subAssetClass
				+ ", assetDesc=" + assetDesc + ", allocation=" + allocation + "]";
	}
	
}