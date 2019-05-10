package project;
import java.util.Random;
import java.util.Scanner;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
public class InputFileGenerator 
{

	public static void main(String[] args) 
	{		
		int orderamount = 30;
		int count = 0;
		String [] alphabet = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", 
							"N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
		
		
		Random rng = new Random();
		try
		{
			FileOutputStream fos = new FileOutputStream ("order.txt", false );
			PrintWriter pw = new PrintWriter(fos);
		do
		{
			boolean repeat = rng.nextBoolean();
			if (repeat)
				pw.print("R,");
			else
				pw.print("O,");
			
			
			
			// Find a random company
			int randomcompany = rng.nextInt(3116);
			String company = "";
			try 
			{
				Scanner file = new Scanner (new File ("companylist.txt") );
				int linecounter = 0;
				while (linecounter < randomcompany)	
				{	
					company = file.nextLine();
					linecounter++;
				}
			}
			catch ( IOException ioe )
			{
				ioe.printStackTrace();
			}
			// code continues here
			
			if (company.contains(","))
			{//Some company names have commas and others don't. This will remove the commas from those that do
				company = company.replace(",", "");
			}
			
			if (company.contains(","))
			{
				company = company.replace(",", "");
			}
			
			if (company.contains(","))
			{
				company = company.replace(",", "");
			}
			
			
			
			pw.print(company + ",");
			
			int alphaindex = rng.nextInt(26);
			pw.print(alphabet[alphaindex]);
			int pID = rng.nextInt(10);
			pw.print(pID + ",");
			
			int randmonth = rng.nextInt(12 + 1 - 1) + 1;
			pw.print(randmonth + "/");
			int randday = rng.nextInt(31 + 1 - 1) + 1;
			pw.print(randday + "/2019,");
			
			int randamount = rng.nextInt(150);
			pw.print(randamount);
			
			if (repeat)
			{
				int randperiod = rng.nextInt(30 + 1 - 1) + 1;
				pw.print("," + randperiod);
				int randmonth2 = rng.nextInt(12 + 1 - randmonth) + randmonth;
				pw.print("," + randmonth2 + "/");
				int randday2 = rng.nextInt(31 + 1 - 1) + 1;
				pw.print(randday2 + "/2019");
			}
			
			
			
			pw.println();
			count++;
			
		}while (count < orderamount);
		pw.close();
		}

		
		catch ( IOException ioe )
		{
			ioe . printStackTrace ();
		}
	}

}
