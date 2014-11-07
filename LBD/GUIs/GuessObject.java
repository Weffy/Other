import java.util.Scanner;

public class GuessObject
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		String q1, q2;

		System.out.println("TWO QUESTIONS!");
		System.out.println("Think of an object, and I'll try to guess it!");
		System.out.println("Question 1: Is it an animal,vegetable, or mineral?");
		q1 = keyboard.next();
		System.out.println("Question 2: Is it bigger than a breadbox?");
		q2 = keyboard.next();
		if (q1.equals("animal"))
		{
			if (q2.equals("yes"))
			{
				System.out.println("My guess is that you are thinking of a moose.");
				System.out.println("I would ask you if I am correct, but I really don't care.");
			}
			else if (q2.equals("no"))
			{
				System.out.println("My guess is that you are thinking of a squirrel.");
				System.out.println("I would ask you if I am correct, but I really don't care.");
			}
		}
		else if (q1.equals("vegetable"))
		{
			if (q2.equals("yes"))
			{
				System.out.println("My guess is that you are thinking of a watermelon.");
				System.out.println("I would ask you if I am correct, but I really don't care.");
			}
			else if (q2.equals("no"))
			{
				System.out.println("My guess is that you are thinking of a carrot.");
				System.out.println("I would ask you if I am correct, but I really don't care.");
			}

		}
		else if (q1.equals("mineral"))
		{
			if (q2.equals("yes"))
			{
				System.out.println("My guess is that you are thinking of a Camaro.");
				System.out.println("I would ask you if I am correct, but I really don't care.");
			}
			else if (q2.equals("no"))
			{
				System.out.println("My guess is that you are thinking of a paper clip.");
				System.out.println("I would ask you if I am correct, but I really don't care.");
			}

		}

	}
}
