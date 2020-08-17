package org.springframework.web.context;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.AbstractApplicationContextTests;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description:
 * @Author: daniel.zhao
 * @Date: 2020/8/17 16:42
 */
public class ClassPathXmlApplicationContextTests extends AbstractApplicationContextTests {

	@Override
	protected ConfigurableApplicationContext createContext() throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/org/springframework/web/context/WEB-INF/applicationContext.xml");
		context.getEnvironment().setActiveProfiles("rootProfile1");
		context.refresh();
		return context;
	}

	@Test
	public void testRefresh() {
		//
	}
}
