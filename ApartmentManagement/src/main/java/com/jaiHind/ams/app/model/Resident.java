/**
 * 
 */
package com.jaiHind.ams.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author dell
 *
 */

@Entity
@Table(name="resident_mst")
public class Resident {
	
	@Id
	@GeneratedValue
	@Column(name = "resident_id")
	private Integer residentId;
	
	@Column(name = "room_no", nullable=false)
	private String roomNo;
	
	@Column(name = "resident_name")
	private String residentName;
	
	@Column(name = "mob_no")
	private String mobNo;

	/**
	 * @return the residentId
	 */
	public Integer getResidentId() {
		return residentId;
	}

	/**
	 * @param residentId the residentId to set
	 */
	public void setResidentId(Integer residentId) {
		this.residentId = residentId;
	}

	/**
	 * @return the roomNo
	 */
	public String getRoomNo() {
		return roomNo;
	}

	/**
	 * @param roomNo the roomNo to set
	 */
	public void setRoomNo(String roomNo) {
		this.roomNo = roomNo;
	}

	/**
	 * @return the residentName
	 */
	public String getResidentName() {
		return residentName;
	}

	/**
	 * @param residentName the residentName to set
	 */
	public void setResidentName(String residentName) {
		this.residentName = residentName;
	}

	/**
	 * @return the mobNo
	 */
	public String getMobNo() {
		return mobNo;
	}

	/**
	 * @param mobNo the mobNo to set
	 */
	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}
	
}
