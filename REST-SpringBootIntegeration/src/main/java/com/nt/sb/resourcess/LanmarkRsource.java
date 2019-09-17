package com.nt.sb.resourcess;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nt.sb.model.LandmarkModel;
import com.nt.sb.services.LandMarkDetails;

@RestController("lndmark")
public class LanmarkRsource {
	
	public LanmarkRsource() {
		System.out.println("LanmarkRsource.LanmarkRsource()");
	}
	//inject landmarkDetails..
	@Autowired
	private LandMarkDetails landmarkDetails;
	
	@RequestMapping(value = "/getlndmrkdetails/{pinCode}",method = RequestMethod.GET,produces = {"application/xml","application/json"})
	public @ResponseBody String getlandMarkDetails(@PathVariable("pinCode") Integer pinCode) throws Exception {
		System.out.println("LanmarkRsource.getlandMarkDetails()");
		LandmarkModel model=null;
		model=landmarkDetails.getLandMarkDetails(pinCode);
		if(model!=null) 
			return "Landmark Details"+model;
		else
			return "Sorry we dont have details for this pin "+pinCode;
	}
}
