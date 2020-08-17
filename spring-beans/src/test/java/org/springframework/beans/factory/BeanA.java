package org.springframework.beans.factory;

/**
 * @Description:
 * @Author: daniel.zhao
 * @Date: 2020/8/14 14:15
 */
public class BeanA implements BeanAInterface {
	private String name;
	private String descript;
	private BeanBInterface beanB;
	private BeanCInterface beanC;

	public BeanA() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BeanBInterface getBeanB() {
		return beanB;
	}

	public void setBeanB(BeanBInterface beanB) {
		this.beanB = beanB;
	}

	@Override
	public void testBeanA() {
		beanB.testBeanB();
	}

	@Override
	public void setDescript(String descript) {
		this.descript = descript;
	}

	public String getDescript() {
		return descript;
	}

	public BeanCInterface getBeanC() {
		return beanC;
	}

	public void setBeanC(BeanCInterface beanC) {
		this.beanC = beanC;
	}
}
