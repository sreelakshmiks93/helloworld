/**
 * 
 */
package net.infinicloud.dataengine.entity;

import javax.persistence.Entity;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author SreeLakshmi
 *
 */
@Document(collection = "data")
public class Data {

	Object obj;
	
	public Data() {
		
	}

	public Data(Object obj) {
		super();
		this.obj = obj;
	}

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}

	@Override
	public String toString() {
		return "Data [obj=" + obj + "]";
	}
	
	
}
