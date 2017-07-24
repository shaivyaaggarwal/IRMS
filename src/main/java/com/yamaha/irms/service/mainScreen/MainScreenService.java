package com.yamaha.irms.service.mainScreen;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.yamaha.irms.entity.job.JobDesc;
import com.yamaha.irms.repository.job.JobDescRepository;

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
 *       MainScreenService : Service class to perform actions on main screen
 *       -----------------------------------------------------------------------
 * 
 *       Revision History
 *       -----------------------------------------------------------------------
 *       Modified By Modified On Description
 *       -----------------------------------------------------------------------
 * 
 *       -----------------------------------------------------------------------
 */

@Service
public class MainScreenService {

	@Inject
	private JobDescRepository oJobDescRepository;

	/** logger to log the information on the console */
	private Logger logger = LoggerFactory.getLogger(MainScreenService.class);

	public List<JobDesc> viewAllJobs() {

	}

}
