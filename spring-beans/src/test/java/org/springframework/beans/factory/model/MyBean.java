package org.springframework.beans.factory.model;

/**
 * @Description:
 * @Author: daniel.zhao
 * @Date: 2020/8/13 10:19
 */
public class MyBean {

	private String name;

	public MyBean(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
