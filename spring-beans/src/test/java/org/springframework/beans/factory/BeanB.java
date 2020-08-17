package org.springframework.beans.factory;

/**
 * @Description:
 * @Author: daniel.zhao
 * @Date: 2020/8/14 14:15
 */
public class BeanB implements BeanBInterface {
	private String name;
	private BeanAInterface beanA;

	public BeanB() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BeanAInterface getBeanA() {
		return beanA;
	}

	public void setBeanA(BeanAInterface beanA) {
		this.beanA = beanA;
	}

	@Override
	public void testBeanB() {
		beanA.testBeanA();
	}
}
