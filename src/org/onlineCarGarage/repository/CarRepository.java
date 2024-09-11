package org.onlineCarGarage.repository;

import java.util.*;

import org.onlineCarGarage.model.*;


public class CarRepository {
	
	ArrayList al= new ArrayList();
	
	public int getCid() {
		return al.size();
	}
	
	// to add coustomer info
	public boolean isAddCounstomer(CoustomerModel cm) // If question will get add it will return true otherwise false
	{
		boolean b=al.add(cm);
		return b;  // it will return in service class
	}
	
	// to show Book info
	
	public ArrayList getAllCoustomer()
	{
		return al;
	}
	
		
}
