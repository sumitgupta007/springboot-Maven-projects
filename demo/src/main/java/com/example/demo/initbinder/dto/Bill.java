package com.example.demo.initbinder.dto;

import java.util.Currency;
import java.util.Date;

//import com.example.demo.initbinder.CreditCard;

public class Bill {

	private CreditCard creditCard;
	private Date date;
	private Currency currency;
	private long amount;
	
	
	
	

	public CreditCard getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(CreditCard creditCard) {
		this.creditCard = creditCard;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	@Override
	public String toString() {
		return "Bill [creditCard=" + creditCard + ", date=" + date + ", currency=" + currency + ", amount=" + amount
				+ "]";
	}

	

}
