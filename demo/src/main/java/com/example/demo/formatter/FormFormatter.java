package com.example.demo.formatter;
import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.example.demo.dto.FormDto;

public class FormFormatter implements Formatter<FormDto> {

	@Override
	public String print(FormDto dto, Locale locale) {
		String str=dto.setUsername("abc_5678");
		return str;
	}

	@Override
	public FormDto parse(String text, Locale locale) throws ParseException {
		FormDto f=new FormDto();
		if(text.contains("_")) {
			 f.setUsername(text);
		}
		
//		catch(Exception e) {
//			  
//			e.printStackTrace();
//		}
		
		
		return f;
	}
	

}
