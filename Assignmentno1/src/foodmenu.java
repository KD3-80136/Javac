import java.util.*;
public class foodmenu 
{
	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		double dosaPrice = 5.50;
		double samosaPrice = 6.7;
		double idliPrice = 8.5;
		double momosPrice = 9.5;
		double vadapaavPrice = 10.5;
		int totalBill = 0;
		while (true) {
			// Display menu
			System.out.println("Menu:");
			System.out.println("1. Dosa - " + dosaPrice);
			System.out.println("2. Samosa - " + samosaPrice);
			System.out.println("3. Idli - " + idliPrice);
			System.out.println("4. momos - " + idliPrice);
			System.out.println("5. vadapaav - " + idliPrice);

			System.out.println("6. Generate Bill");
			System.out.print("Enter your choice: ");

			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter quantity: ");
				int dosaQuantity = sc.nextInt();
				totalBill += dosaPrice * dosaQuantity;
				break;
			case 2:
				System.out.print("Enter quantity: ");
				int samosaQuantity = sc.nextInt();
				totalBill += samosaPrice * samosaQuantity;
				break;
			case 3:
				System.out.print("Enter quantity: ");
				int idliQuantity = sc.nextInt();
				totalBill += idliPrice * idliQuantity;
				break;
			case 4:
				System.out.print("Enter quantity: ");
				int momosQuantity = sc.nextInt();
				totalBill += momosPrice * momosQuantity;
				break;
			case 5:
				System.out.print("Enter quantity: ");
				int vadapaavQuantity = sc.nextInt();
				totalBill += vadapaavPrice * vadapaavQuantity;
				break;

			case 6:
				System.out.println("Total Bill: " + totalBill);
				sc.close();
				return;
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		}
                     
	}

}
