package org.onlineCarGarage.model;
import java.util.*;
public class CoustomerModel {
	
	private int cid;
	private String name;
	private int ccontact;
	private String caddress;
	private String carname;
	private int cnumber;
	boolean CarStatus;
	
	HashMap <String,Integer>Bill= new HashMap<String,Integer>();
    

	public HashMap<String, Integer> getBill() {
		return Bill;
	}

	public void setBill(HashMap<String, Integer> bill) {
		Bill = bill;
	}

	public CoustomerModel() {
		
	}

	public CoustomerModel(int cid, String name, int ccontact, String caddress, String carname, int cnumber) {
		
		this.cid = cid;
		this.name = name;
		this.ccontact = ccontact;
		this.caddress = caddress;
		this.carname= carname;
		this.cnumber=cnumber;
	}

	public String getCarname() {
		return carname;
	}

	public void setCarname(String carname) {
		this.carname = carname;
	}

	public int getCnumber() {
		return cnumber;
	}

	public void setCnumber(int cnumber) {
		this.cnumber = cnumber;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCcontact() {
		return ccontact;
	}

	public void setCcontact(int ccontact) {
		this.ccontact = ccontact;
	}

	public String getCaddress() {
		return caddress;
	}

	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}
	
	public boolean isCarStatus() {
		return CarStatus;
	}

	public void setCarStatus(boolean carStatus) {
		CarStatus = carStatus;
	}
		

}
