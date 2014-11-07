import java.util.Scanner;

public class Alpha
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is your last name?");
		String lastName = keyboard.next();
		String currentCustomer = "Adams";
		int result = lastName.compareTo(currentCustomer);
		if (result <= 5)
		{
			System.out.println("you're coming up soon!");
		}
		else if (result <= 10)
		{
			System.out.println("you don't have to wait too long");
		}
		else if (result <= 15)
		{
			System.out.println("thats not bad");
		}
		else if (result <= 20)
		{
			System.out.println("looks like a bit of a wait");
		} 
		else if (result <= 25)
		{
			System.out.println("it's gonna be a while");
		}
		else
		{
			System.out.println("not going anywhere for a while?");
		}
	}
}
