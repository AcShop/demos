/*
 * File Name: User.java
 * Copyright: Copyright 2016-2016 hdu All Rights Reserved.

 * Description: 
 * Author: Pi Chen
 * Create Date: 2016年5月24日

 * Modifier: Pi Chen
 * Modify Date: 2016年5月24日
 * Bugzilla Id: 
 * Modify Content: 
 */
package org.multi.module.common.model;

/**
 * 
 * @author    Pi Chen
 * @version   webbf V1.0.0, 2016年5月24日
 * @see       
 * @since     webbf V1.0.0
 */

public class User {

	private Long id;
	private String name;
	private String address;
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	
}
