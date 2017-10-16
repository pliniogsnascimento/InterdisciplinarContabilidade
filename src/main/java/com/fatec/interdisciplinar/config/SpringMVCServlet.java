package com.fatec.interdisciplinar.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import com.fatec.interdisciplinar.config.AppConfig;

public class SpringMVCServlet extends AbstractAnnotationConfigDispatcherServletInitializer {

	 @Override
	   protected Class<?>[] getRootConfigClasses()
	   {
	      return new Class[] { AppConfig.class };
	   }

	   @Override
	   protected Class<?>[] getServletConfigClasses()
	   {
	      return null;
	   }

	   @Override
	   protected String[] getServletMappings()
	   {
	      return new String[] { "/" };
	   }


}
