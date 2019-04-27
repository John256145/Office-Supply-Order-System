package project;
import java.util.Scanner;
public class UserInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int selection = 0;
		boolean repeat = true;
		
		Scanner scan = new Scanner(System.in);
		Order myOrder = new Order();
		
		
		
		do
		{
		System.out.println("1: Specify a file name of orders to load");
		System.out.println("2: Add an order or repeated order");
		System.out.println("3: Specify an orderID to delete");
		System.out.println("4: Specify a CustomerID to display a list of orders for that customer in increasing date sorted order");
		System.out.println("5: Calculate and output an order inventory report (sorted by year, month and productID)");
		System.out.println("6: Exit");
		
		System.out.println("Please make a selection: > ");
		
		try
		{
			selection = scan.nextInt();
		}catch (Exception e)
		{
			System.out.println("Please enter a valid integer.");
			scan.next();
		}
		
		
		
		
		
		switch(selection)
		{
		case 1:
			//
			break;
		case 2:
			boolean repeated = false;
			boolean loop1 = true, loop2 = true, loop5 = true, loop6 = true, loop7=true, loop8 = true, loop9 = true, loop10 = true;
			String input1;
			int input2 = 0;
			String input3;
			String input4;
			int input5 = 0;
			int input6 = 0;
			int input7 = 0;
			int input8 = 0;
			int input9 = 0;
			int input10 = 0;
			
			while (loop1) 
			{
				System.out.println("One time or Repeated? (O/R): ");
				
					input1 = scan.next();
					if (input1.contains("R") || input1.contains("r"))
					{
						repeated = true;
						loop1 = false;
					}else if (input1.contains("O") || input1.contains("o"))
					{
						repeated = false;
						loop1 = false;
					}
			}
			while (loop2)
			{
				System.out.println("Enter the unique Order ID (numeric): ");
				try
				{
					input2 = scan.nextInt();
					loop2 = false;
				}catch (Exception e)
				{
					System.out.println("Please enter a valid integer");
					scan.next();
				}
			}
			
				System.out.println("Enter the customer ID (alpha): ");
				input3 = scan.next();
				
				System.out.println("Enter the product ID (alphanumeric): ");
				input4 = scan.next();
			
			while (loop5)
			{
				System.out.println("Enter the month of the order (1-12): ");
				try
				{
					input5 = scan.nextInt();
					if (input5 >= 1 && input5 <= 12)
					{
						loop5 = false;
					}else 
					{
						System.out.println("Please enter a valid month");
						scan.next();
					}
					
					
					
				}catch (Exception e)
				{
					System.out.println("Please enter a valid integer");
					scan.next();
				}
				
			}
			
			while (loop6)
			{
				System.out.println("Enter the day of the order: ");
				try 
				{
					input6 = scan.nextInt();
					if (input6 >= 1 && input6 <= 31)
					{
						loop6 = false;
					}else 
					{
						System.out.println("Please enter a valid day");
						scan.next();
					}
				}catch (Exception e)
				{
					System.out.println("Please enter a valid integer");
					scan.next();
				}
				
			}
			
			while (loop7)
			{
				System.out.println("Enter the amount: ");
				
				try
				{
					input7 = scan.nextInt();
					loop7 = false;
				}catch (Exception e)
				{
					System.out.println("Please enter a valid integer");
					scan.next();
				}
			}
			
			if (repeated)
			{
				while (loop8)
				{
					System.out.println("Enter the period: ");
					try
					{
						input8 = scan.nextInt();
						loop8 = false;
					}catch (Exception e)
					{
						System.out.println("Please enter a valid integer");
						scan.next();
					}
					
				}
				
				while (loop9)
				{
					System.out.println("Enter the end month of the order (1-12): ");
					try
					{
						input9 = scan.nextInt();
						if (input9 >= 1 && input9 <= 12)
						{
							loop9 = false;
						}else 
						{
							System.out.println("Please enter a valid month");
							scan.next();
						}
					}catch (Exception e)
					{
						System.out.println("Please enter a valid integer");
						scan.next();
					}
				}
				while (loop10)
				{
					System.out.println("Enter the end day of the order: ");
					try 
					{
						input10 = scan.nextInt();
						if (input10 >= 1 && input10 <= 31)
						{
							loop10 = false;
						}else 
						{
							System.out.println("Please enter a valid day");
							scan.next();
						}
					}catch (Exception e)
					{
						System.out.println("Please enter a valid integer");
						scan.next();
					}
				}
			}
			
			if (repeated)
			{
				myOrder.addOrder(input2, input3, input4, input5, input6, input7, input8, input9, input10);
				System.out.println("Suceess");
			}else
			{
				myOrder.addOrder(input2, input3, input4, input5, input6, input7);
				System.out.println("Suceess");
			}
			
			System.out.println("Would you like to return to the main menu? (Y/N): ");
			String input0 = scan.next();
			if (input0.contains("y") || input0.contains("Y") )
			{
				selection = 6;
			}else
			{
				selection = 0;
			}
			
			break;
		case 3:
			//
			break;
		case 4:
			//
			break;
		case 5:
			//
			break;
		case 6:
			System.out.print("Bye");
			selection = 0;
			break;
		
		default:
			selection = 0;
			break;
			
		}
	
		}while (selection >= 1 && selection <= 6);
		
	}

}
