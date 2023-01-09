package com.example.demo.initbinder.controller;

import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.initbinder.dto.Bill;
import com.example.demo.initbinder.formatter.CreditCardformatter;
import com.example.demo.initbinder.validator.CurrencyValidator;

@Controller
@RequestMapping("/bill")
public class InItController {
	
	
	@RequestMapping("/page")
	public String BillDto(@ModelAttribute("billdto") Bill bill) {
		System.out.println("-----------------------billdtp="+bill);
		return "bill-page";
	}
		
	
	@RequestMapping("/success")
    public String billRecieved(@ModelAttribute("billdto") Bill bil) {
		System.out.println(">>>>>>>>>>>inside success method"+bil);
		return "bill-paid";	

}
	
	
	
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat date=new SimpleDateFormat("dd/MM/yyyy");
		CustomDateEditor editor=new CustomDateEditor(date,true);
		binder.registerCustomEditor(Date.class,"date", editor);
		binder.addCustomFormatter(new CreditCardformatter());
//		binder.addValidators(new CurrencyValidator());
	}
	
	
	
	
	
	
	
	
}
