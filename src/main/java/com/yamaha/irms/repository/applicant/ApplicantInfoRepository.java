package com.yamaha.irms.repository.applicant;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.yamaha.irms.entity.applicant.ApplicantInfo;

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
 *       ApplicantInfoRepository : Respository Interface for database queries
 *       related to applicant_info table
 *       -----------------------------------------------------------------------
 * 
 *       Revision History
 *       -----------------------------------------------------------------------
 *       Modified By Modified On Description
 *       -----------------------------------------------------------------------
 * 
 *       -----------------------------------------------------------------------
 */

@Repository
@Transactional
public interface ApplicantInfoRepository extends CrudRepository<ApplicantInfo, String> {

}
