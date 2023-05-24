package com.appt.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class AssetClass {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private double equities;
	private double alternativeInvestments;
	private double commodities;
	
	@ManyToOne
	private InvestmentTheme theme;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getEquities() {
		return equities;
	}

	public void setEquities(double equities) {
		this.equities = equities;
	}

	public double getAlternativeInvestments() {
		return alternativeInvestments;
	}

	public void setAlternativeInvestments(double alternativeInvestments) {
		this.alternativeInvestments = alternativeInvestments;
	}

	public double getCommodities() {
		return commodities;
	}

	public void setCommodities(double commodities) {
		this.commodities = commodities;
	}

	public InvestmentTheme getTheme() {
		return theme;
	}

	public void setTheme(InvestmentTheme theme) {
		this.theme = theme;
	}
public AssetClass() {
	
}
	public AssetClass(long id, double equities, double alternativeInvestments, double commodities,
			InvestmentTheme theme) {
		super();
		this.id = id;
		this.equities = equities;
		this.alternativeInvestments = alternativeInvestments;
		this.commodities = commodities;
		this.theme = theme;
	}

	@Override
	public String toString() {
		return "AssetClass [id=" + id + ", equities=" + equities + ", alternativeInvestments=" + alternativeInvestments
				+ ", commodities=" + commodities + ", theme=" + theme + "]";
	}
	
	
}
