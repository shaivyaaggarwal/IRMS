package com.yamaha.irms.entity.jobskill;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * Project Name : Internal Recruitment Management System
 * 
 * @company YMSLI
 * @author Shaivya Aggarwal
 * @date July 25, 2017 Copyright (c) 2012, Yamaha Motor Solution (INDIA) Pvt
 *       Ltd.
 * 
 *       Description
 *       -----------------------------------------------------------------------
 *       JobSkill : Entity class to map the job_skills table
 *       -----------------------------------------------------------------------
 * 
 *       Revision History
 *       -----------------------------------------------------------------------
 *       Modified By Modified On Description
 *       -----------------------------------------------------------------------
 * 
 *       -----------------------------------------------------------------------
 */

@Data
@Entity
@Table(name = "job_skills")
public class JobSkill implements Serializable {

	private static final long serialVersionUID = 1L;

	/** Primary Key : Job Skills Id */
	@Id
	@NotNull
	@Column(name = "job_skills_id")
	@Getter
	@Setter
	private Integer jobSkillsId;

	/** Name of the skill. Eg: Java, Android etc */
	@Column(name = "skill")
	@Getter
	@Setter
	private String skill;

	/** Foreign Key : Unique Job Code for each job */
	@Column(name = "job_code")
	@Getter
	@Setter
	private String jobCode;
}
