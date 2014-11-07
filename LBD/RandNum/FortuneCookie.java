import java.util.Random;
import java.util.Scanner;
public class FortuneCookie
{
	public static void main(String[] args)
	{
		int finished = 1;
		Random r = new Random();
		Scanner keyboard = new Scanner(System.in);
		while (finished != 2)
		{		
			int x = r.nextInt(5);
			int lotto1 = 1+ r.nextInt(54);
			int lotto2 = 1+ r.nextInt(54);
			int lotto3 = 1+ r.nextInt(54);
			int lotto4 = 1+ r.nextInt(54);
			int lotto5 = 1+ r.nextInt(54);
			int lotto6 = 1+ r.nextInt(54);
			String message = "";
			if (x == 0)
			{
				message = "\"Happy wife, happy life\"";
			}
			else if (x == 1)
			{
				message = "\"Don't piss in the wind\"";
			}
			else if (x == 2)
			{
				message = "\"Digital fortunte cookies are 0 calories\"";
			}
			else if (x == 3)
			{
				message = "\"When behind, Dark Shrine\"";
			}
			else if (x == 4)
			{
				message = "\"404 error, eat another cookie\"";
			}
			System.out.println("Fortune cookie says: " + message);
			System.out.println(lotto1 + " " + lotto2 + " " + lotto3
+ " " + lotto4 + " " + lotto5 + " " + lotto6);
			System.out.println("Would you like another cookie?");
			System.out.println("1. Yes");
			System.out.println("2. No");
			finished = keyboard.nextInt();
		}
	}
}
