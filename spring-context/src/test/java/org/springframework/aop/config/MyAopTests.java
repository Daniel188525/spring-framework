package org.springframework.aop.config;

import org.junit.Before;
import org.junit.Test;
import org.springframework.aop.config.dao.TestDao;
import org.springframework.aop.config.dao.TestDaoImpl;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
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

	@Test
	public void testAopXmlLoad() {
		this.reader = new XmlBeanDefinitionReader(this.beanFactory);
		this.reader.loadBeanDefinitions(CONTEXT);
	}

	/**
	 * 在bean初始化完成后调用AspectJAwareAdvisorAutoProxyCreator#postProcessAfterInitialization方法生成TestDao代理类[进行了增强处理]
	 */
	@Test
	public void testAopAdvice() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("org/springframework/aop/config/MyAopTests-context.xml");

		TestDao dao = (TestDao)ac.getBean("daoImpl");
		dao.select();
	}
}
