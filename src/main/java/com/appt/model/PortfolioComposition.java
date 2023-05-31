package com.appt.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.springframework.beans.factory.annotation.Autowired;


@Entity
public class PortfolioComposition {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private long portfolioCompositionId;
	private Date transactionDate;
	private String securityName;
	private String assetClass;
	private String equityCategory;
	private String exchangeName;
	private String transactionType;
	private double price;
	private Integer units;
	private int  quantity;
	private double valueOfSecurity;
	private int allocation;
	private double totalTransaction;
	private double estimatedTax;
	
	
   @OneToOne
   public InvestmentTheme theme;
	
	@ManyToOne
	private PortfolioHeader header;
	
	@ManyToOne
	private Nse nse;
	
	public PortfolioComposition() {
		super();
	}
	
	
	
	public long getPortfolioCompositionId() {
		return portfolioCompositionId;
	}



	public void setPortfolioCompositionId(long portfolioCompositionId) {
		this.portfolioCompositionId = portfolioCompositionId;
	}



	public InvestmentTheme getTheme() {
		return theme;
	}

	public void setTheme(InvestmentTheme theme) {
		this.theme = theme;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public void setAllocation(int allocation) {
		this.allocation = allocation;
	}


	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

	public String getSecurityName() {
		return securityName;
	}

	public void setSecurityName(String securityName) {
		this.securityName = securityName;
	}

	public String getAssetClass() {
		return assetClass;
	}

	public void setAssetClass(String assetClass) {
		this.assetClass = assetClass;
	}

	public String getEquityCategory() {
		return equityCategory;
	}

	public void setEquityCategory(String equityCategory) {
		this.equityCategory = equityCategory;
	}

	public String getExchangeName() {
		return exchangeName;
	}

	public void setExchangeName(String exchangeName) {
		this.exchangeName = exchangeName;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Integer getUnits() {
		return units;
	}

	public void setUnits(Integer units) {
		this.units = units;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public double getValueOfSecurity() {
		return valueOfSecurity;
	}

	public void setValueOfSecurity(double valueOfSecurity) {
		this.valueOfSecurity = valueOfSecurity;
	}

	public Integer getAllocation() {
		return allocation;
	}

	public void setAllocation(Integer allocation) {
		this.allocation = allocation;
	}

	public double getTotalTransaction() {
		return totalTransaction;
	}

	public void setTotalTransaction(double totalTransaction) {
		this.totalTransaction = totalTransaction;
	}

	public double getEstimatedTax() {
		return estimatedTax;
	}

	public void setEstimatedTax(double estimatedTax) {
		this.estimatedTax = estimatedTax;
	}



	public PortfolioHeader getHeader() {
		return header;
	}

	public void setHeader(PortfolioHeader header) {
		this.header = header;
	}

@Autowired
	public PortfolioComposition(long portfolioCompositionId, Date transactionDate, String securityName,
			String assetClass, String equityCategory, String exchangeName, String transactionType, double price,
			Integer units, int quantity, double valueOfSecurity, int allocation, double totalTransaction,
			double estimatedTax, InvestmentTheme theme, PortfolioHeader header) {
		super();
		this.portfolioCompositionId = portfolioCompositionId;
		this.transactionDate = transactionDate;
		this.securityName = securityName;
		this.assetClass = assetClass;
		this.equityCategory = equityCategory;
		this.exchangeName = exchangeName;
		this.transactionType = transactionType;
		this.price = price;
		this.units = units;
		this.quantity = quantity;
		this.valueOfSecurity = valueOfSecurity;
		this.allocation = allocation;
		this.totalTransaction = totalTransaction;
		this.estimatedTax = estimatedTax;
		this.theme = theme;
		this.header = header;
	}



	@Override
	public String toString() {
		return "PortfolioComposition [portfolioCompositionId=" + portfolioCompositionId + ", transactionDate="
				+ transactionDate + ", securityName=" + securityName + ", assetClass=" + assetClass
				+ ", equityCategory=" + equityCategory + ", exchangeName=" + exchangeName + ", transactionType="
				+ transactionType + ", price=" + price + ", units=" + units + ", quantity=" + quantity
				+ ", valueOfSecurity=" + valueOfSecurity + ", allocation=" + allocation + ", totalTransaction="
				+ totalTransaction + ", estimatedTax=" + estimatedTax + ", theme=" + theme + ", header=" + header + "]";
	}
	

	
	
}
