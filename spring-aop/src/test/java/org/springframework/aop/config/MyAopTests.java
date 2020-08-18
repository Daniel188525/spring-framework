package org.springframework.aop.config;

import org.junit.Before;
import org.junit.Test;
import org.springframework.aop.config.dao.TestDaoImpl;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.Resource;

import static org.springframework.tests.TestResourceUtils.qualifiedResource;

/**
 * @Description: AOP TESTS
 * @Author: daniel.zhao
 * @Date: 2020/8/18 16:44
 */
public class MyAopTests {

	private static final Class<?> CLASS = MyAopTests.class;

	private static final Resource CONTEXT =  qualifiedResource(CLASS, "context.xml");

	private DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

	private XmlBeanDefinitionReader reader;


	@Before
	public void setup() {
		this.reader = new XmlBeanDefinitionReader(this.beanFactory);
	}

	@Test
	public void testAopXmlLoad() {
		this.reader.loadBeanDefinitions(CONTEXT);
	}

	public void testAopAdvice() {
		this.reader.loadBeanDefinitions(CONTEXT);
		TestDaoImpl daoImpl = beanFactory.getBean("daoImpl", TestDaoImpl.class);
		daoImpl.select();
	}
}
