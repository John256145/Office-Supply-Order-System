package project;
import java.util.ArrayList;
import java.util.Random;

public class Order 
{
	private int uoID; //Unique order ID (numeric)
	private String cID; //Customer ID (alpha)
	private String pID; //Product ID (alphanumeric)
	private String date; // Date of the order	
	private int amount; // Order amount
	
	private int period; // the number of days between repeats (only for a repeated order)
	private String dateend; //End date of a repeated order
	private boolean repeated; // specifies if the order is repeated or not
	
	//These will store all of the order information (IDs, dates, names, etc)
	private ArrayList <Integer> uoIDList = new ArrayList <Integer>();
	private ArrayList <String> cIDList = new ArrayList <String>();
	private ArrayList <String> pIDList = new ArrayList <String>();
	private ArrayList <String> dateList = new ArrayList <String>();
	private ArrayList <Integer> amountList = new ArrayList <Integer>();
	
	private ArrayList <Integer> periodList = new ArrayList <Integer>();
	private ArrayList <String> dateendList = new ArrayList <String>();
	private ArrayList <Boolean> repeatedList = new ArrayList <Boolean>();
	
	
	public Order () {
		uoID = 0;
		cID = "Null, Inc,";
		pID = "00";
		date = "1/1/2019";
		amount = 0;
		
		
		period = 0;
		dateend = "0";
		repeated = false;
	}
	
	public void addOrder(int uoID, String cID, String pID, String date, int amount) 
	{//adding a one-time order
		this.uoID = uoID;
		this.cID = cID;
		this.pID = pID;
		this.date = date;
		this.amount = amount;
		repeated = false;
		
		uoIDList.add(uoID);
		cIDList.add(cID);
		pIDList.add(pID);
		dateList.add(date);
		amountList.add(amount);
		
		periodList.add(0);
		dateendList.add(null);
		repeatedList.add(false);
		
	}
	
	public void addOrder (int uoID, String cID, String pID, String date, int amount, int period, String dateend) 
	{//adding a repeated order
		this.uoID = uoID;
		this.cID = cID;
		this.pID = pID;
		this.date = date;
		this.amount = amount;
		
		this.period = period;
		this.dateend = dateend;
		repeated = true;
		
		uoIDList.add(uoID);
		cIDList.add(cID);
		pIDList.add(pID);
		dateList.add(date);
		amountList.add(amount);
		
		periodList.add(period);
		dateendList.add(dateend);
		repeatedList.add(true);
		
	}
	
	public void deleteOrder (int ID) 
	{
		int index = 0;
		int IDinarray;
		for (int i = 0; i<uoIDList.size(); i++) 
		{
			IDinarray = uoIDList.get(i);
			if (IDinarray == ID) 
			{
				index = i;
				break;
			}
		}
		
		uoIDList.remove(index);
		cIDList.remove(index);
		pIDList.remove(index);
		dateList.remove(index);
		amountList.remove(index);
		
		periodList.remove(index);
		dateendList.remove(index);
		repeatedList.remove(index);
	}
	
	
	
	
	
}
