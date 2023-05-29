package com.appt.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class PortfolioHeader {
	
	@Id
	private String portfolioName;
 	private String portfolioType;
	private String themeName;
	private String baseCurrency;
	private String rebalancingFrequency;
	private String benchMark;
	private String exchange;
	private double investmentValue;
	private double currentValue;
	private double returns;
	private double balance;
	
	
	@ManyToOne
	private InvestmentTheme theme;

	public String getPortfolioName() {
		return portfolioName;
	}
	public void setPortfolioName(String portfolioName) {
		this.portfolioName = portfolioName;
	}

	public String getPortfolioType() {
		return portfolioType;
	}
	
	
	public String getThemeName() {
		return themeName;
	}
	public void setThemeName(String themeName) {
		this.themeName = themeName;
	}
	public void setPortfolioType(String portfolioType) {
		this.portfolioType = portfolioType;
	}
	public String getBaseCurrency() {
		return baseCurrency;
	}
	public void setBaseCurrency(String baseCurrency) {
		this.baseCurrency = baseCurrency;
	}
	public String getRebalancingFrequency() {
		return rebalancingFrequency;
	}
	public void setRebalancingFrequency(String rebalancingFrequency) {
		this.rebalancingFrequency = rebalancingFrequency;
	}
	public String getBenchMark() {
		return benchMark;
	}
	public void setBenchMark(String benchMark) {
		this.benchMark = benchMark;
	}
	public String getExchange() {
		return exchange;
	}
	public void setExchange(String exchange) {
		this.exchange = exchange;
	}
	public double getInvestmentValue() {
		return investmentValue;
	}
	public void setInvestmentValue(double investmentValue) {
		this.investmentValue = investmentValue;
	}
	public double getCurrentValue() {
		return currentValue;
	}
	public void setCurrentValue(double currentValue) {
		this.currentValue = currentValue;
	}
	public double getReturns() {
		return returns;
	}
	public void setReturns(double returns) {
		this.returns = returns;
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public InvestmentTheme getTheme() {
		return theme;
	}
	public void setTheme(InvestmentTheme theme) {
		this.theme = theme;
	}
	
	public PortfolioHeader() {
		
	}
	public PortfolioHeader(String portfolioName, String portfolioType, String themeName, String baseCurrency,
			String rebalancingFrequency, String benchMark, String exchange, double investmentValue, double currentValue,
			double returns, double balance, InvestmentTheme theme) {
		super();
		this.portfolioName = portfolioName;
		this.portfolioType = portfolioType;
		this.themeName = themeName;
		this.baseCurrency = baseCurrency;
		this.rebalancingFrequency = rebalancingFrequency;
		this.benchMark = benchMark;
		this.exchange = exchange;
		this.investmentValue = investmentValue;
		this.currentValue = currentValue;
		this.returns = returns;
		this.balance = balance;
		this.theme = theme;
	}
	@Override
	public String toString() {
		return "PortfolioHeader [portfolioName=" + portfolioName + ", portfolioType=" + portfolioType + ", themeName="
				+ themeName + ", baseCurrency=" + baseCurrency + ", rebalancingFrequency=" + rebalancingFrequency
				+ ", benchMark=" + benchMark + ", exchange=" + exchange + ", investmentValue=" + investmentValue
				+ ", currentValue=" + currentValue + ", returns=" + returns + ", balance=" + balance + ", theme="
				+ theme + "]";
	}
	
	

}
