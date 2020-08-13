package org.springframework.beans.factory.model;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.config.AbstractFactoryBean;

/**
 * @Description:
 * @Author: daniel.zhao
 * @Date: 2020/8/13 10:13
 */
public class MyFactoryBean extends AbstractFactoryBean<MyBean> {

	@Override
	public Class<?> getObjectType() {
		return MyBean.class;
	}

	@Override
	protected MyBean createInstance() throws Exception {
		return new MyBean("hello-world");
	}
}
