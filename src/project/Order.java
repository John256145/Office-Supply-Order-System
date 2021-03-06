package project;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Random;
public class Order 
{
	private int uoID; //Unique order ID (numeric)
	private String cID; //Customer ID (alpha)
	private String pID; //Product ID (alphanumeric)
	private int month; // Date of the order	
	private int day;
	private int amount; // Order amount
	
	private int period; // the number of days between repeats (only for a repeated order)
	private int monthend; //End date of a repeated order
	private int dayend;
	private boolean repeated; // specifies if the order is repeated or not
	
	//These will store all of the order information (IDs, dates, names, etc)
	private ArrayList <Integer> uoIDList = new ArrayList <Integer>();
	private ArrayList <String> cIDList = new ArrayList <String>();
	private ArrayList <String> pIDList = new ArrayList <String>();
	private ArrayList <Integer> monthList = new ArrayList <Integer>();
	private ArrayList <Integer> dayList = new ArrayList <Integer>();
	private ArrayList <Integer> amountList = new ArrayList <Integer>();
	
	private ArrayList <Integer> periodList = new ArrayList <Integer>();
	private ArrayList <Integer> monthendList = new ArrayList <Integer>();
	private ArrayList <Integer> dayendList = new ArrayList <Integer>();
	private ArrayList <Boolean> repeatedList = new ArrayList <Boolean>();
	
	
	private String monthsarray [] = {"", "January", "February", "March", "April", "May", "June", 
									"July", "August", "September", "October", "November", "December"};
	
	public Order () {
		uoID = 0;
		cID = "Null, Inc,";
		pID = "00";
		month = 00;
		day = 0;
		amount = 0;
		
		
		period = 0;
		monthend = 0;
		dayend = 0;
		repeated = false;
	}
	
	public void addOrder(int uoID, String cID, String pID, int month, int day, int amount) 
	{//adding a one-time order
		this.uoID = uoID;
		this.cID = cID;
		this.pID = pID;
		this.month = month;
		this.day = day;
		this.amount = amount;
		repeated = false;

		
		
		
		uoIDList.add(uoID);
		cIDList.add(cID);
		pIDList.add(pID);
		monthList.add(month);
		dayList.add(day);
		amountList.add(amount);
		
		periodList.add(0);
		monthendList.add(0);
		dayendList.add(0);
		repeatedList.add(false);
		
	}
	
	public void addOrder (int uoID, String cID, String pID, int month, int day, int amount, int period, int monthend, int dayend) 
	{//adding a repeated order
		this.uoID = uoID;
		this.cID = cID;
		this.pID = pID;
		this.month = month;
		this.day = day;
		this.amount = amount;
		
		this.period = period;
		this.monthend = monthend;
		this.dayend = dayend;
		repeated = true;
		
		uoIDList.add(uoID);
		cIDList.add(cID);
		pIDList.add(pID);
		monthList.add(month);
		dayList.add(day);
		amountList.add(amount);
		
		periodList.add(period);
		monthendList.add(monthend);
		dayendList.add(dayend);
		repeatedList.add(true);
		
	}
	
	public boolean deleteOrder (int ID) 
	{
		boolean success = false;
		int index = 0;
		int IDinarray;
		for (int i = 0; i<uoIDList.size(); i++) 
		{
			IDinarray = uoIDList.get(i);
			if (IDinarray == ID) 
			{
				index = i;
				success = true;
				break;
			}
		}
		
		
		if (success) 
		{
			uoIDList.remove(index);
			cIDList.remove(index);
			pIDList.remove(index);
			monthList.remove(index);
			dayList.remove(index);
			amountList.remove(index);
			
			periodList.remove(index);
			monthendList.remove(index);
			dayendList.remove(index);
			repeatedList.remove(index);
		}
		
		return success;
	}
	
	public void printOrders()
	{
		for (int i=0; i<uoIDList.size(); i++)
		{
			System.out.print(uoIDList.get(i) + ", ");
			System.out.print(cIDList.get(i) + ", ");
			System.out.print(pIDList.get(i) + ", ");
			System.out.print(monthList.get(i) + "/");
			System.out.print(dayList.get(i) + "/2019, ");
			System.out.print(amountList.get(i));
			
			if (repeatedList.get(i)) {
				System.out.print(", " + periodList.get(i));
				System.out.print(", " + monthendList.get(i) + "/");
				System.out.print(dayendList.get(i) + "/2019");
			}
			
			
			System.out.println();
		}
		
	}

	
	public void printReport2()
	{
		for (int j=1; j<=12; j++)
		{//iterates over every month
			System.out.println(monthsarray[j] + ":");
			for (int i=0; i<uoIDList.size(); i++)
			{//checks every order for a match with month j. If found, it prints the order
				if (monthList.get(i) == j)
				{
					ArrayList <Integer> in = new ArrayList <Integer>();

					ArrayList <Integer> daysListNumerical = new ArrayList <Integer>();

					in.add(i);
					daysListNumerical.add(dayList.get(i));
					
					Collections.sort(daysListNumerical);
					
					int p;
					int q;
				
				
					for(int o=0; o<in.size();o++) 
					{
						
						
						
					for(int l=0;l<daysListNumerical.size();l++) 
					{
						
						
						if(in.get(o)==(dayList.indexOf(daysListNumerical.get(l)))) 
						{

							
							
							System.out.print("2019/");
							System.out.print(monthList.get(i) + "/");
							System.out.print(dayList.get(i) + ", ");
							System.out.print(pIDList.get(i) + ", ");
							System.out.print(amountList.get(i));
						
						if (repeatedList.get(i)) 
							{
								System.out.print(", " + periodList.get(i));
								System.out.print(", " + monthendList.get(i) + "/");
								System.out.print(dayendList.get(i) + "/2019");
							}
							System.out.println();
							}  
						}
					
					}
			
					
					
				}
			}
		}
	}
	
	public void printReport()
	{//keeping this one here just in case
		
		
		for (int j=1; j<=12; j++)
		{//iterates over every month
			System.out.println(monthsarray[j] + ":");
			for (int i=0; i<uoIDList.size(); i++)
			{//checks every order for a match with month j. If found, it prints the order
				if (monthList.get(i) == j)
				{
					System.out.print("2019/");
					System.out.print(monthList.get(i) + "/");
					System.out.print(dayList.get(i) + ", ");
					System.out.print(pIDList.get(i) + ", ");
					System.out.print(amountList.get(i));
					if (repeatedList.get(i)) 
					{
						System.out.print(", " + periodList.get(i));
						System.out.print(", " + monthendList.get(i) + "/");
						System.out.print(dayendList.get(i) + "/2019");
					}
					System.out.println();
				}
			}
		}
		
		
		
		
	}
	
	
	
	public boolean listOrders(String cID)
	{
		boolean success = false;
		for (int i=0; i<cIDList.size(); i++)
		{
			if (cIDList.get(i).contains(cID)) // if the customer ID is found
			{
				success = true;
				System.out.print(uoIDList.get(i) + ", ");
				System.out.print(cIDList.get(i) + ", ");
				System.out.print(pIDList.get(i) + ", ");
				System.out.print(monthList.get(i) + "/");
				System.out.print(dayList.get(i) + "/2019, ");
				System.out.print(amountList.get(i));
				
				if (repeatedList.get(i)) 
				{
					System.out.print(", " + periodList.get(i));
					System.out.print(", " + monthendList.get(i) + "/");
					System.out.print(dayendList.get(i) + "/2019");
				}
				
				
				System.out.println();
				
			}
			
		}
		return success;
		
	}
	
	public int generateID()
	{
		int id;
		Random rng = new Random();
		id = rng.nextInt(9999);
		return id;
	}
	
	
	public boolean loadOrders(String filename) 
	{
		if (filename.isEmpty())
			filename = "order.txt";
		
		boolean success = false;
		try 
		{
			Scanner file = new Scanner (new File (filename) );
			String orderhandler = "";
			
			while (file.hasNextLine()) 
			{
				boolean repeated = false;
				orderhandler = file.nextLine();
				String[] seperatedvalues = orderhandler.split(",");
				
				if (seperatedvalues[0].contains("R"))
				{
					repeated = true;
				}
				
				uoIDList.add(generateID());
				cIDList.add(seperatedvalues[1]);
				pIDList.add(seperatedvalues[2]);
				
				
				String date = seperatedvalues[3];
				String[] seperateddates = date.split("/");
				
				
				int monthfromstr = 0;
				int dayfromstr = 0;
				monthfromstr = Integer.parseInt(seperateddates[0]);
				dayfromstr = Integer.parseInt(seperateddates[1]);
				monthList.add(monthfromstr);
				dayList.add(dayfromstr);
				

				
				
				int amountfromstring = Integer.parseInt(seperatedvalues[4]);
				amountList.add(amountfromstring);
				
				if (seperatedvalues.length > 5 && seperatedvalues[5] != null)
				{
					int periodfromstring = Integer.parseInt(seperatedvalues[5]);
					periodList.add(periodfromstring);
					int monthfromstr2 = 0;
					int dayfromstr2 = 0;
					String date2 = seperatedvalues[6];
					String[] seperateddates2 = date2.split("/");
					
					monthfromstr2 = Integer.parseInt(seperateddates2[0]);
					dayfromstr2 = Integer.parseInt(seperateddates2[1]);
					monthendList.add(monthfromstr2);
					dayendList.add(dayfromstr2);
					repeatedList.add(true);
				}else
				{	
					periodList.add(0);
					monthendList.add(0);
					dayendList.add(0);
					repeatedList.add(false);
				}
				success = true;
				
			}
			
			
		}
		catch ( FileNotFoundException ioe )
		{
			
			System.out.println("Error: File not found. Was the filename given correctly?");
			ioe.printStackTrace();
		}
		catch ( IOException ioe )
		{
			
			ioe.printStackTrace();
		}
		return success;
		
	}
	
	
	
}
