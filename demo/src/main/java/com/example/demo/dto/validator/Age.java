package com.example.demo.dto.validator;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;
@Constraint(validatedBy = AgeValidator.class)
@Documented
@Retention(RUNTIME)
@Target(FIELD)
public @interface Age {
	
	 int lower() default 18;
	 int upper() default 80;
	 
	 String message() default  "{error.Age.age}"; 
	 
	 Class<?>[] groups() default { };

		Class<? extends Payload>[] payload() default { };


}
