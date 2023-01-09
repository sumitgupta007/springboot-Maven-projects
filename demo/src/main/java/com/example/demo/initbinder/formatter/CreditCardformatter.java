package com.example.demo.initbinder.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.example.demo.initbinder.dto.CreditCard;

//import org.hibernate.engine.jdbc.internal.Formatter;

public class CreditCardformatter implements Formatter<CreditCard> {

	@Override
	public String print(CreditCard cc, Locale locale) {
		cc.setFnumber("xxxx");
		cc.setSnumber("xxxx");
		cc.setTnumber("xxxx");
		cc.setFourthnumber("xxxx");
		cc.setFifthnumber("xxxx");
		String str=cc.getFnumber()+"-"+cc.getSnumber()+"-"+cc.getFifthnumber()+"-"+
	cc.getFourthnumber()+"-"+cc.getFifthnumber();
		return str;
	}

	@Override
	public CreditCard parse(String text, Locale locale) throws ParseException {
		String[] cc = text.split("-");
		System.out.println("CreditCard============================"+cc);
		CreditCard credit=new CreditCard();
		credit.setFnumber(cc[0]);
		credit.setSnumber(cc[1]);
		credit.setTnumber(cc[2]);
		credit.setFourthnumber(cc[3]);
		credit.setFifthnumber(cc[4]);
		return credit;
	}

	
	

}
