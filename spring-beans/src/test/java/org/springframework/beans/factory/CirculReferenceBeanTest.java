package org.springframework.beans.factory;

import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.Resource;

import static org.junit.Assert.assertEquals;
import static org.springframework.tests.TestResourceUtils.qualifiedResource;

/**
 * @Description: 测试循环依赖场景
 * @Author: daniel.zhao
 * @Date: 2020/8/14 14:21
 */
public class CirculReferenceBeanTest {

	private static final Class<?> CLASS = CirculReferenceBeanTest.class;

	private static final Resource CIRCULAR_CONTEXT = qualifiedResource(CLASS, "circular.xml");

	/**
	 * 测试循环依赖解决流程
	 */
	@Test
	public void testCircleReference() {
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		new XmlBeanDefinitionReader(factory).loadBeanDefinitions(CIRCULAR_CONTEXT);
		factory.addBeanPostProcessor(new MyInstantiationAwareBeanPostProcessor());

		BeanA beanA = (BeanA) factory.getBean("beanA");
		BeanB beanB = (BeanB) factory.getBean("beanB");
		assertEquals("hhhhhhA", beanA.getName());
		assertEquals("beanB", beanB.getName());
	}

	public void testApplicationContext() {

	}
}
