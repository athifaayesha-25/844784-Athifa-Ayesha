package com.cts.springmvc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "newmanager")
public class Job {
	@Column
	private int jobid;
	@Column
	private String jobtitle;
}
