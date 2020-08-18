package org.springframework.aop.config.dao;

/**
 * @Description:
 * @Author: daniel.zhao
 * @Date: 2020/8/18 16:53
 */
public class TestDaoImpl implements TestDao {
	@Override
	public void select() {
		System.out.println("......select()......");
	}

	@Override
	public void insert() {
		System.out.println("......insert()......");
	}
}
