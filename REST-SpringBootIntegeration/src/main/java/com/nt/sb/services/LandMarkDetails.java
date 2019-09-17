package com.nt.sb.services;

import org.springframework.stereotype.Service;

import com.nt.sb.model.LandmarkModel;

/*
 * 	Based on the Pin number Area or city or village Will be displayed.
 */

@Service("landmarkService")
public class LandMarkDetails {
	public LandmarkModel getLandMarkDetails(Integer pinCode) throws Exception {
		LandmarkModel model=null;
		if(pinCode==752108) {
			model=new LandmarkModel();
			model.setVillageName("Gambharipada");
			model.setPinCode(752108);
			model.setLandMark("4000000 acr");
			return model;
		}
		else {
			
			throw new RuntimeException("Invallied Pin");
		}
			
	}
}
