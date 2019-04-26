package project;

public class OrderTest 
{

	public static void main(String[] args) 
	{
		int uoID = 2569;
		String cID = "Alphabet, Inc.";
		String pID = "A1";
		String date = "4/12/2019";
		int amount = 1;
		
		int period = 0;
		String dateend = "5/12/2019";
		
		Order myOrder = new Order();
		
		myOrder.addOrder(2569, "Alphabet, Inc.", "A1", "4/12/2019", 1);
		myOrder.addOrder(2362, "Something Inc", "C2", "4/18/2019", 7);
		myOrder.addOrder(8192, "Alphabet, Inc.", "E2", "6/12/2019", 1, 2, "6/27/2019");
		myOrder.addOrder(7623, "Idk, Inc.", "B2", "2/12/2019", 5, 2, "8/27/2019");
		myOrder.addOrder(9109, "Alphabet, Inc.", "A2", "3/18/2019", 9);
		
//		myOrder.printOrders();
		
//		myOrder.deleteOrder(8192);
		
		System.out.println();
//		myOrder.printOrders();
		
		myOrder.listOrders(cID);
	}

}
