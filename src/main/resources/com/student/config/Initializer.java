package com.student.config;

import javax.security.auth.login.AppConfigurationEntry;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class Initializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		class[] config = {AppConfiguration.class}
		return config;
	}

	@Override
	protected String[] getServletMappings() {
		String[] mapStrings = {"/"}
		return mapStrings;
	}

}
