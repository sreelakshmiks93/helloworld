/**
 * 
 */
package net.infinicloud.dataengine.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.infinicloud.dataengine.dao.DataDaoImpl;
import net.infinicloud.dataengine.entity.Data;
import net.infinicloud.dataengine.model.ResponseVO;

/**
 * @author SreeLakshmi
 *
 */
@Service
public class DataService implements IDataService {

	
	
	
	/*
	 * @Autowired private DataDaoImpl dataDaoImpl;
	 */
	
	  @Autowired private DataDaoImpl dataDaoImpl;
	 
	 
	  public void save(Data data) {
		dataDaoImpl.save(data);
		  
	  }
	 
}
