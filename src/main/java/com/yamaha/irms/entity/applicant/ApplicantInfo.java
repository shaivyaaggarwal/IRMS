package com.yamaha.irms.entity.applicant;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
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
 *       ApplicantInfo : Entity class to map the applicant_info table
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
@Table(name = "applicant_info")
public class ApplicantInfo implements Serializable {

	private static final long serialVersionUID = 1L;

	/** Primary Key : Applicant Info Id */
	@Id
	@NotNull
	@GeneratedValue
	@Column(name = "applicant_info_id")
	@Getter
	@Setter
	private String applicantInfoId;

	/**
	 * Foreign Key: Unique Job Code for each job. Referencing Entity Class :
	 * JobDesc
	 */
	@Column(name = "job_code")
	@Getter
	@Setter
	private String jobCode;

	/** First Name of the applicant */
	@Column(name = "first_name")
	@Getter
	@Setter
	private String firstName;

	/** Last Name of the applicant */
	@Column(name = "last_name")
	@Getter
	@Setter
	private String lastName;

	/** Phone number of the applicant */
	@Column(name = "phone_num")
	@Getter
	@Setter
	private String phoneNum;

	/** Email of the applicant */
	@Column(name = "email")
	@Getter
	@Setter
	private String email;

	/** Date of birth of the applicant */
	@Column(name = "dob")
	@Getter
	@Setter
	private String dob;

	/** Gender of the applicant */
	@Column(name = "gender")
	@Getter
	@Setter
	private String gender;

	/** Highest Qualification of the applicant */
	@Column(name = "qualification")
	@Getter
	@Setter
	private String qualification;

	/** Current Residence of the applicant */
	@Column(name = "current_location")
	@Getter
	@Setter
	private String currentLocation;

	/** The current company where the applicant is working */
	@Column(name = "current_employer")
	@Getter
	@Setter
	private String currentEmployer;

	/** Notice period of the company where the applicant is currently working */
	@Column(name = "notice_period")
	@Getter
	@Setter
	private String noticePeriod;

	/**
	 * Resume would be stored at a specific location on the server and its name
	 * would be updated in the database
	 */
	@Column(name = "resume")
	@Getter
	@Setter
	private String resume;
}
