package org.springframework.beans.factory;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValue;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;

/**
 * @Description:
 * @Author: daniel.zhao
 * @Date: 2020/8/14 15:05
 */
public class MyInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {

	@Override
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
		return true;
	}

	@Override
	public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
		if ("beanA".equalsIgnoreCase(beanName)) {
			PropertyValue name = pvs.getPropertyValue("name");
			System.out.println("修改前的name: " + name.getValue());
			name.setConvertedValue("hhhhhhA");
		}
		return pvs;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if (bean instanceof BeanAInterface) {
			BeanAInterface beanA = (BeanAInterface) bean;
			beanA.setDescript("初始化后添加了个描述");
		}
		return bean;
	}
}
