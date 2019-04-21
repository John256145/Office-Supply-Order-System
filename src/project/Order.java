package project;
import java.util.ArrayList;
import java.util.Random;

public class Order 
{
	private int uoID; //Unique order ID (numeric)
	private String cID; //Customer ID (alpha)
	private String pID; //Product ID (alphanumeric)
	private String date; // Date of the order
	private String dateend; //End date of a repeated order
	private int period; // the number of days between repeats (only for a repeated order)
	private int amount; // Order amount
	private boolean repeated; // specifies if the order is repeated or not
	
	//These will store all of the order information (IDs, dates, names, etc)
	private ArrayList <Integer> uoIDList = new ArrayList <Integer>();
	private ArrayList <String> cIDList = new ArrayList <String>();
	private ArrayList <String> pIDList = new ArrayList <String>();
	private ArrayList <String> dateList = new ArrayList <String>();
	private ArrayList <Integer> amountList = new ArrayList <Integer>();
	private ArrayList <Boolean> repeatedList = new ArrayList <Boolean>();
	
	
	private ArrayList <String> dateendList = new ArrayList <String>();
	private ArrayList <Integer> periodList = new ArrayList <Integer>();
	
	
	
	public Order () {
		uoID = 0;
		cID = "Null, Inc,";
		pID = "00";
		date = "1/1/2019";
		amount = 0;
		repeated = false;
		
		
		dateend = "0";
		period = 0;
		
	}
	
	public void addOrder() {
		
	}
	
	
	
}
