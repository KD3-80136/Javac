import java.util.*;
public class Javatest
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Enter the number=");
		num = sc.nextInt();
		System.out.println("Binary equivalent=" + Integer.toBinaryString(num));
		System.out.println("octal equivalent=" + Integer.toOctalString(num));
		System.out.println("Hexadecimal equivalent=" + Integer.toHexString(num));
	}
}
