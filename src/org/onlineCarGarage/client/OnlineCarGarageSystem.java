package org.onlineCarGarage.client;

import java.util.*;
import org.onlineCarGarage.model.*;
import org.onlineCarGarage.service.CarService;

 
public class OnlineCarGarageSystem {

	private static final CoustomerModel CoustomerModel = null;
	private static CarService cService;

	public static void main(String[] args) {
		
		CarService coService=new CarService();
		
		do{
			
			System.out.println("case 1:Add new coustomer");
			System.out.println("case 2:Show the Info Coustomer & Car");
			System.out.println("case 3:Search Car Using Coustomer ID");
			System.out.println("case 4:Serach Car Using  car NUMBER");
			System.out.println("case 5:Generate Car Status");
			System.out.println("case 6:Check Car is Ready or Not");
			System.out.println("case 7:Generate the Bill ");
			System.out.println("case 8:Show the Total Bill");
			
			Scanner xy= new Scanner(System.in);
			
			System.out.println("Enter your choice");
			int choice=xy.nextInt();
			
			switch(choice)
			{
			
			 case 1:
			 {
				 System.out.println("======================================================");
				 System.out.println("...........Enter the coustomer information............");
				 System.out.println("======================================================");
				 
					 
				 System.out.println("Enter the coustomer Id");
				 int cid=xy.nextInt();
				 
				 xy.nextLine();
				 System.out.println("Enter the coustomer Name");
				 String cname=xy.nextLine();
				 
				 System.out.println("Enter the coustomer Contact");
				 int ccontact=xy.nextInt();
				 
				 xy.nextLine();
				 System.out.println("Enter the coustomer Address");
				 String caddress=xy.nextLine();
				 
				 System.out.println("Enter the Car name");
				 String carname=xy.nextLine();
				 
				 System.out.println("Enter the Car number");
				 int cnumber=xy.nextInt();
				 
				 CoustomerModel cm= new CoustomerModel(cid,cname,ccontact,caddress,carname,cnumber);
				 
				 
				 
				 boolean b= coService.isAddCounstomer(cm);
				 {
					 if (b) {
							System.out.println("    .......Coustomer Added Successfully..........    \n");
						}

						else {
							System.out.println("<===============There Is Some Problem==================>");
						}
					 System.out.println("=====================xxxx=============================");
					 
				 }
				 break;			 
			 }
			 
			 case 2:
			 {
				 System.out.println("=======================================================================================");
				 System.out.println(".........................Information of Coustomer & Car................................");
				 System.out.println("=======================================================================================");
				 ArrayList al= coService.getAllCoustomer();
				 if(al!=null)
				 {
					 System.out.println("C id \t C Name \t  C Cont \t C address \t car name \t car number");
					 for(Object obj:al)
					 {
						 CoustomerModel cm= (CoustomerModel)obj;
						 
						 System.out.println(cm.getCid()+ "\t" +cm.getName()+ "\t\t" +cm.getCcontact()+ "\t\t" +cm.getCaddress()+ "\t\t" +cm.getCarname()+"\t\t" +cm.getCnumber());
					 }		 
				 }
				 else
				 {
					 System.out.println("........There is no data present in collection........");
				 }
				 System.out.println("=========================================xxxxx=========================================");
					break;
			 }

			 case 3:
			 {
				 System.out.println("======================================================");
				 System.out.println(".........Search the Car Info by Coustomer id..........");
				 System.out.println("======================================================");
				 
				 int flag=0;
				 ArrayList al1= coService.getAllCoustomer();
				 System.out.println("Enter the Coustomer id");
				 int ccdi=xy.nextInt();
				 for(Object obj:al1)
				 {
					 CoustomerModel cm= (CoustomerModel)obj;
					 if(cm.getCid()==ccdi)
					 {
						 System.out.println(cm.getCid()+ "\t" +cm.getName()+ "\t\t" +cm.getCcontact()+ "\t\t" +cm.getCaddress()+ "\t\t" +cm.getCarname()+"\t\t" +cm.getCnumber());
						 flag=1;
					 }

				 }
				 if(flag==0)
				 {
					 System.out.println("..........Coustomer id is not found...........");
				 }
				 System.out.println("=====================xxxx=============================");
				 break;
			 }
			 
			 case 4:
			 {
				 System.out.println("======================================================");
				 System.out.println("..........Search the Car Info by Car Number...........");
				 System.out.println("======================================================");
				 
				 int flag=0;
				 ArrayList al1= coService.getAllCoustomer();
				 System.out.println("Enter the Car Number");
				 int cno=xy.nextInt();
				 for(Object obj:al1)
				 {
					 CoustomerModel cm= (CoustomerModel)obj;
					 if(cm.getCnumber()==cno)
					 {
						 System.out.println(cm.getCid()+ "\t" +cm.getName()+ "\t\t" +cm.getCcontact()+ "\t\t" +cm.getCaddress()+ "\t\t" +cm.getCarname()+"\t\t" +cm.getCnumber());
						 flag=1;
					 }

				 }
				 if(flag==0)
				 {
					 System.out.println("...........Car Number is not found............");
				 }
				 System.out.println("=====================xxxx=============================");
				 break;
				 		 
			 }
			 case 5:
			 {
				 System.out.println("======================================================");
				 System.out.println("...............Generate the Car Status................");
				 System.out.println("======================================================");
				 
				 ArrayList al1= coService.getAllCoustomer();
				 System.out.println("Enter the Coustomer id");
				 int ccdi=xy.nextInt();
				 for(Object obj:al1)
				 {
					 CoustomerModel cm= (CoustomerModel)obj;
					 if(cm.getCid()==ccdi)
					 {
						 xy.nextLine();
						 System.out.println("Car Service is Complete? (yes/no)");
						 String replay=xy.nextLine();
						 
						 if(replay.equals("yes"))
						 {
							 cm.setCarStatus(true);
						 }
						 else 
						 {
							 cm.setCarStatus(false);
						 }
					 }

				 } 
					 System.out.println(".........Your Car Status Changed Successfully.........");
				 
				 System.out.println("=====================xxxx=============================");
				 break;		 
			 }
			 
			 case 6:
			 {
				 System.out.println("======================================================");
				 System.out.println("..............Check Car is Ready OR Not...............");
				 System.out.println("======================================================");
				  
				 ArrayList al1= coService.getAllCoustomer();
				 System.out.println("Enter the Coustomer id");
				 int ccdi=xy.nextInt();
				 
				 for(Object obj:al1)
				 {
					 CoustomerModel cm= (CoustomerModel)obj;
					 if(cm.getCid()==ccdi)
					 {
						 boolean b= cm.isCarStatus();
						 if(b==true)
						 {
							 System.out.println("................Your Car is Ready for Run.............");
						 }
						 else
						 {
							 System.out.println("............Your Car Not is Ready for Run.............");
							                                                                            
						 }
					 }
				 } 		 
				 System.out.println("=====================xxxx=============================");
				 break;	 
			 }
			 
			 case 7:
			 {
				 System.out.println("======================================================");
				 System.out.println("...................Generate the Bill..................");
				 System.out.println("======================================================");
				 
				 ArrayList al1= coService.getAllCoustomer();
				 System.out.println("Enter the Coustomer id");
				 int ccdi=xy.nextInt();
				 
				 for(Object obj:al1)
				 {
					 CoustomerModel cm= (CoustomerModel)obj;
					 if(cm.getCid()==ccdi)
					 {
						 System.out.println("How many components you have repared");
						 int num=xy.nextInt();
						 xy.nextLine();
						 
						 for(int i=0;i<num;i++)
						 {
							 System.out.println("Enter component name & price");
							 String component=xy.nextLine();
							 int price=xy.nextInt(); 
							 xy.nextLine();
							 
							 HashMap hmap=cm.getBill();
							 hmap.put(component, price);
							 
						 }
						 
						 System.out.println("Bill Generated Successfully...... ");

					 }

				 } 

				 
				 System.out.println("=====================xxxx=============================");
				 break; 				 
			 }
			 
			 case 8:
			 {
				 System.out.println("======================================================");
				 System.out.println("..................Show Total The Bill.................");
				 System.out.println("======================================================");
				 
				 ArrayList al1= coService.getAllCoustomer();
				 System.out.println("Enter the Coustomer id");
				 int ccdi=xy.nextInt();
				 
				 for(Object obj:al1)
				 {
					 CoustomerModel cm= (CoustomerModel)obj;
					 
					 if(cm.getCid()==ccdi)
					 {
						 
						 HashMap hmap=cm.getBill();
						 float sum=0f;
						 
						Set<Map.Entry<String, Integer>>set=hmap.entrySet();
						
						for(Map.Entry<String, Integer>d:set)
						{
							sum=sum+(Integer)d.getValue();
						}
						
						System.out.println("Your Total Bill is:=>"+sum);
									 
						 System.out.println(".................Thank you Visit Again............./n ");
					 }

				 } 		 
				 System.out.println("=====================xxxx=============================");
				 break; 
				 
			 }
				 			 
			 default :
			 {
				 System.out.println("Wrong choice.................");
			 }
			
		    } 
			
			
		}while(true);

	}

}
