package com.appt.dto;

import java.sql.Date;


public class PortfolioDto {
	
	
	private String portfolioName;
	private Date transactionDate;
	private String securityName;
	private double price;
	private Integer units;
	private double totalTransaction;

	
	public PortfolioDto() {
		super();
	}
	
	public String getPortfolioName() {
		return portfolioName;
	}

	public void setPortfolioName(String portfolioName) {
		this.portfolioName = portfolioName;
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




	

	public double getTotalTransaction() {
		return totalTransaction;
	}


	public void setTotalTransaction(double totalTransaction) {
		this.totalTransaction = totalTransaction;
	}


	@Override
	public String toString() {
		return "PortfolioDto [portfolioName=" + portfolioName + ", transactionDate=" + transactionDate
				+ ", securityName=" + securityName + ", price=" + price + ", units=" + units + ", totalTransaction="
				+ totalTransaction + "]";
	}



	
}
