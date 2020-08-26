package org.springframework.transaction.daniel;

import org.springframework.tests.sample.beans.TestBean;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Description: 测试事务注解
 * @Author: daniel.zhao
 * @Date: 2020/8/26 17:44
 */
public class TestBean2 extends TestBean {

	@Override
	@Transactional
	public Object returnsThis() {
		return super.returnsThis();
	}
}
