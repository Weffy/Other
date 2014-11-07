import java.util.Scanner;

public class SpaceBoxing
{
	public static void main(String[] args)
	{
		double weight;
		int selection;

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Please enter your weight:");
		weight = keyboard.nextInt();

		System.out.print("I have information for the following planets:");
		System.out.println("1. Venus");		
		System.out.println("2. Mars");
		System.out.println("3. Jupiter");
		System.out.println("4. Saturn");
		System.out.println("5. Uranus");
		System.out.println("6. Neptune");
		System.out.print("Which planet will you be visiting? ");
		selection = keyboard.nextInt();
		if (selection == 1)
		{
			weight = weight * .78;
			System.out.println("Your weight would be " + weight + " on Venus.");
		}
		else if (selection == 2)
		{
			weight = weight * .39;
			System.out.println("Your weight would be " + weight + " on Mars.");
		}
		else if (selection == 3)
		{
			weight = weight * 2.65;
			System.out.println("Your weight would be " + weight + " on Jupiter.");
		}
		else if (selection == 4)
		{
			weight = weight * 1.17;
			System.out.println("Your weight would be " + weight + " on Saturn.");
		}
		else if (selection == 5)
		{
			weight = weight * 1.05;
			System.out.println("Your weight would be " + weight + " on Uranus.");
		}
		else if (selection == 6)
		{
			weight = weight * 1.23;
			System.out.println("Your weight would be " + weight + " on Neptune.");
		}
	}
}
