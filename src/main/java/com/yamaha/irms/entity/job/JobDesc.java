package com.yamaha.irms.entity.job;

import java.io.Serializable;
import java.sql.Timestamp;

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
 *       JobDesc : Entity class to map the job_desc table
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
@Table(name = "job_desc")
public class JobDesc implements Serializable {

	private static final long serialVersionUID = 1L;

	/** Primary Key : Unique Job Code for each job */
	@Id
	@NotNull
	@Column(name = "job_code")
	@Getter
	@Setter
	private String jobCode;

	/** Description about the job */
	@Column(name = "job_description")
	@Getter
	@Setter
	private String jobDescription;

	/** Location for which the job is posted */
	@Column(name = "location")
	@Getter
	@Setter
	private String location;

	/** Experience Required for the job */
	@Column(name = "experience_reqd")
	@Getter
	@Setter
	private String experienceRequired;

	/** Name of the job that would serve as the heading of the job */
	@Column(name = "job_name")
	@Getter
	@Setter
	private String jobName;

	/** Number of positions available for the job */
	@Column(name = "num_applicants")
	@Getter
	@Setter
	private Integer numOfApplicants;

	/**
	 * Boolean value to indicate whether the applicant can apply for the job or
	 * not
	 */
	@Column(name = "is_open")
	@Getter
	@Setter
	private Boolean isOpen;

	/**
	 * If the job is open, then till which the date the applicant can apply for
	 * the job
	 */
	@Column(name = "open_till_date")
	@Getter
	@Setter
	private Timestamp openTillDate;
}
