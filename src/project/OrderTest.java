package project;
import java.util.Scanner;
public class OrderTest 
{

	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		Order myOrder = new Order();
							//Company ID, Product ID, month, day, amount.
													//If a repeated order: period, month end, day end.
		
		
		myOrder.addOrder(2569, "Alphabet, Inc.", "A1", 4, 12, 1);
		myOrder.addOrder(2362, "Something Inc", "C2", 4, 18, 7);
		myOrder.addOrder(8192, "Alphabet, Inc.", "E2", 6, 12, 1, 2, 6, 27);
		myOrder.addOrder(7623, "Idk, Inc.", "B2", 2, 12, 5, 2, 8, 27);
		myOrder.addOrder(9109, "Alphabet, Inc.", "A2", 3, 18, 9);
		
		myOrder.printOrders();
		
//		myOrder.deleteOrder(8192);
		
		System.out.println();
		myOrder.printOrders();

		System.out.println();
		
		myOrder.listOrders("Alphabet, Inc.");
		
		
		
		
	}

}
