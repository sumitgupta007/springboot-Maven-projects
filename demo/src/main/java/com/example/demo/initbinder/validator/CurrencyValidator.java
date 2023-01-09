package com.example.demo.initbinder.validator;

import java.util.Currency;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.example.demo.initbinder.dto.Bill;

public class CurrencyValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		
		return clazz.equals(Bill.class);
	}

	@Override
	public void validate(Object target, Errors errors) {
		
		Currency cury=((Bill)target).getCurrency();
		String string = String.valueOf(cury).toUpperCase();
		if(string.equals("USD" )|| string.equals("INR")) {
			Currency currency = Currency.getInstance(string.toUpperCase());
			
		}else {
			errors.rejectValue("currency","key.currency", "enter USD,INR");
		}
		
		
		ValidationUtils.rejectIfEmpty(errors, null, null);
		
	}

}
