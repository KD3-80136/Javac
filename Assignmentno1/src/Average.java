import java.util.*;
public class Average 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter first double value: ");
		if (scanner.hasNextDouble())
		{
			double num1 = scanner.nextDouble();

			System.out.print("Enter second double value: ");
			if (scanner.hasNextDouble()) 
			{
				double num2 = scanner.nextDouble();
				double average = (num1 + num2) / 2;
				System.out.println("Average of the two double values: " + average);
			} else 
			{
				System.out.println(" Second input is not a double value.");
			}
		} else 
		{
			System.out.println(" First input is not a double value.");
		}

		scanner.close();
	}
}
