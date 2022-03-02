import javax.security.auth.login.AppConfigurationEntry;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		class[]   config = {AppConfiguration.class}
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		String[]  map= {"/"}
		return map;
	}

}
