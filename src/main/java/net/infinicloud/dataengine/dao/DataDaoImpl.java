/**
 * 
 */
package net.infinicloud.dataengine.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import net.infinicloud.dataengine.entity.Data;
import net.infinicloud.dataengine.model.ResponseVO;

/**
 * @author SreeLakshmi
 *
 */

@Repository
public interface DataDaoImpl extends MongoRepository<Data, String>{
	

	 
}
