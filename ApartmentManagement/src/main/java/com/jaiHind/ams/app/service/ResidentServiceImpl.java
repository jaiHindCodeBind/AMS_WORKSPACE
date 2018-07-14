/**
 * 
 */
package com.jaiHind.ams.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jaiHind.ams.app.dao.ResidentDao;
import com.jaiHind.ams.app.model.Resident;

/**
 * @author dell
 *
 */

@Service 
public class ResidentServiceImpl implements ResidentService{

	@Autowired
	ResidentDao residentDao;
	
	/* (non-Javadoc)
	 * @see com.example.demo.service.ResidentService#saveResident(com.example.demo.model.Resident)
	 */
	@Override
	public Resident saveResident(Resident resident) {

		residentDao.save(resident);
		return resident;
	}

	/* (non-Javadoc)
	 * @see com.example.demo.service.ResidentService#showResidentInfo(java.lang.Integer)
	 */
	@Override
	public Optional<Resident> showResidentInfo(Integer residentId) {

		return residentDao.findById(residentId);
	}

	/* (non-Javadoc)
	 * @see com.example.demo.service.ResidentService#showAllResidentInfo()
	 */
	@Override
	public Iterable<Resident> showAllResidentInfo() {
	
		return residentDao.findAll();
	}

}
