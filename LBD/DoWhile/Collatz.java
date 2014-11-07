import java.util.Scanner;
public class Collatz
{
	public static void main(String[] args)
	{
		int input = 0;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter a number to process");
		input = keyboard.nextInt();
		int count = 0;
		int maxValue = 1;			
		while (input != 1)
		{
			if (input % 2 == 0)
			{
				input = input / 2;
				System.out.print(input + " ");
				count++;
				if (input > maxValue)
				{
					maxValue = input;
				}
			}
			else
			{
				input = (input * 3) + 1;
				System.out.print(input + " ");
				count++;
				if (input > maxValue)
				{
					maxValue = input;
				}
			}
		}
		System.out.println();
		System.out.println("Collatz Sequence terminated after " + count + " steps.");
		System.out.println("Max value encountered was: " + maxValue);
	}
}
