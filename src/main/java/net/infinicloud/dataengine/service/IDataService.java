/**
 * 
 */
package net.infinicloud.dataengine.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import net.infinicloud.dataengine.entity.Data;

/**
 * @author SreeLakshmi
 *
 */

public interface IDataService {
	public void save(Data data);
}
