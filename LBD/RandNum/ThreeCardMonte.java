import java.util.Random;
import java.util.Scanner;

public class ThreeCardMonte
{
	public static void main(String[] args)
	{
		Random r = new Random();
		Scanner keyboard = new Scanner(System.in);

		int again = 1;
		while (again != 2)
		{

			System.out.println("You slide up to Fast Eddie's card table and you plop down your cash.");
			System.out.println("He glances at you out of the corner of his eye and starts shuffling.");
			System.out.println("He lays down three cards.");
			System.out.println();
			System.out.println("Which one is the ace?");
			System.out.println();
			System.out.println("\t##\t##\t##");
			System.out.println("\t##\t##\t##");
			System.out.println("\t##\t##\t##");
			System.out.println("\t1\t2\t3");
			int card = 1 + r.nextInt(3);
			int choice = keyboard.nextInt();

			if (choice == card)
			{
				System.out.println("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.");
				if (choice == 1)
				{
					System.out.println();
					System.out.println("\tAA\t##\t##");
					System.out.println("\tAA\t##\t##");
					System.out.println("\tAA\t##\t##");
					System.out.println("\t1\t2\t3");
				}
				else if (choice == 2)
				{
					System.out.println();
					System.out.println("\t##\tAA\t##");
					System.out.println("\t##\tAA\t##");
					System.out.println("\t##\tAA\t##");
					System.out.println("\t1\t2\t3");
				}
				else
				{
					System.out.println();
					System.out.println("\t##\t##\tAA");
					System.out.println("\t##\t##\tAA");
					System.out.println("\t##\t##\tAA");
					System.out.println("\t1\t2\t3");
				}
			}
			else
			{
				System.out.println("Ha! Fast Eddie wins again!  The ace card was number " + card);
				if (card == 1)
				{
					System.out.println();
					System.out.println("\tAA\t##\t##");
					System.out.println("\tAA\t##\t##");
					System.out.println("\tAA\t##\t##");
					System.out.println("\t1\t2\t3");
				}
				else if (card == 2)
				{
					System.out.println();
					System.out.println("\t##\tAA\t##");
					System.out.println("\t##\tAA\t##");
					System.out.println("\t##\tAA\t##");
					System.out.println("\t1\t2\t3");
				}
				else
				{
					System.out.println();
					System.out.println("\t##\t##\tAA");
					System.out.println("\t##\t##\tAA");
					System.out.println("\t##\t##\tAA");
					System.out.println("\t1\t2\t3");
				}

			}
			System.out.println("Play again?");
			System.out.println("1. Yes");
			System.out.println("2. No");
			again = keyboard.nextInt();
			
		}
	}
}
