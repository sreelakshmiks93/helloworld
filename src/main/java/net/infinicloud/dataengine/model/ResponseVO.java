/**
 * 
 */
package net.infinicloud.dataengine.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author SreeLakshmi
 *
 */

public class ResponseVO {

	@JsonProperty("status_code")
	private int statusCode;
	
	@JsonProperty("status_value")
	private String statusValue;
	
	@JsonProperty("data")
	private String data;
	
	public ResponseVO() {
		
	}

	public ResponseVO(int statusCode, String statusValue, String data) {
		super();
		this.statusCode = statusCode;
		this.statusValue = statusValue;
		this.data = data;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getStatusValue() {
		return statusValue;
	}

	public void setStatusValue(String statusValue) {
		this.statusValue = statusValue;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "ResponseVO [statusCode=" + statusCode + ", statusValue=" + statusValue + ", data=" + data + "]";
	}

	
}
