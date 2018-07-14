/**
 * 
 */
package com.jaiHind.ams.app.dao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jaiHind.ams.app.model.Resident;

/**
 * @author dell
 *
 */
@Repository
public interface ResidentDao extends CrudRepository<Resident, Integer> {

}
