import java.util.Random;
public class Doubles
{
	public static void main(String[] args)
	{
		Random rng = new Random();
		int die1 = 0;
		int die2 = 1;
		int count = 0;

		while (die1 != die2)
		{
			die1 = 1+rng.nextInt(6);
			die2 = 1+rng.nextInt(6);
			System.out.println("die #1 is: " + die1);
			System.out.println("die #2 is: " + die2);
			System.out.println();
			count++;
		}
		System.out.println("That took " + count + " die rolls");
	}
}
