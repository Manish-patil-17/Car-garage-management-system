package org.onlineCarGarage.service;

import java.util.*;

import org.onlineCarGarage.model.CoustomerModel;
import org.onlineCarGarage.repository.*;

public class CarService {
	
	
	CarRepository cRepo = new CarRepository();
	
	public  boolean isAddCounstomer(CoustomerModel cm) // If question will get add it will return true otherwise false
	{
		int cid =cRepo.getCid();
		
		cid+=1;       // initially our id will be zero after this it will increase by one
		cm.setCid(cid);  // increased id set in book model
		boolean b= cRepo.isAddCounstomer(cm);
		return b; // from repository class
		
	}
	
	// to show book info
	public ArrayList getAllCoustomer()
	{
		ArrayList al=cRepo.getAllCoustomer();
		return al.size()>0 ? al:null;
	}
	
	
}
