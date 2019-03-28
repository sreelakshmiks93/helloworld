package net.infinicloud.dataengine.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import net.infinicloud.dataengine.entity.Data;
import net.infinicloud.dataengine.model.ResponseVO;
import net.infinicloud.dataengine.service.DataService;
import net.infinicloud.dataengine.service.IDataService;

@Controller
public class DataController {

	
	/*
	 * @Autowired public IDataService dax;
	 */
	 
	@Autowired
	private IDataService dataService;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String hello(ModelMap model) {
		String name = "test";
		return "hello";

	}
 
	@RequestMapping(value = "/{application_id}/{device_id}", method = RequestMethod.POST)
	@ResponseBody
	public ResponseVO postData(@PathVariable(value = "application_id") String applicationId, @PathVariable(value = "device_id") String deviceId) {
		ResponseVO responseVO = new ResponseVO();
		responseVO.setStatusCode(200);
		responseVO.setData(applicationId);
		Data data = new Data();
		data.setObj(responseVO);
		dataService.save(data);
		return responseVO;

	}
}