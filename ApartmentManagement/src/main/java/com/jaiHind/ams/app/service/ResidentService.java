/**
 * 
 */
package com.jaiHind.ams.app.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.jaiHind.ams.app.model.Resident;

/**
 * @author dell
 *
 */

@Service
public interface ResidentService {
 
	/**
	 * @param resident
	 * @return
	 */
	public Resident saveResident(Resident resident);

	/**
	 * @param residentId
	 * @return
	 */
	public Optional<Resident> showResidentInfo(Integer residentId);

	/**
	 * @return
	 */
	public Iterable<Resident> showAllResidentInfo();
	
	
}
