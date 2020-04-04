package com.cts.springmvc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "newmanager")
public class Manager {
	@Column
	private int managerid;
	@Column
	private String managername ;
	@Column
	private String manageremailid;
	public int getManagerid() {
		return managerid;
	}
	public void setManagerid(int managerid) {
		this.managerid = managerid;
	}
	public String getManagername() {
		return managername;
	}
	public void setManagername(String managername) {
		this.managername = managername;
	}
	public String getManageremailid() {
		return manageremailid;
	}
	public void setManageremailid(String manageremailid) {
		this.manageremailid = manageremailid;
	}

}
