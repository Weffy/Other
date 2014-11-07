import java.util.Scanner;

public class AskingQuestions
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		
		int age;
		int height;
		double weight;

		System.out.print ("How old are you? ");
		age = keyboard.nextInt();

		System.out.print("How tall are you in inches? ");
		height = keyboard.nextInt();

		System.out.print("How much do you weigh? ");
		weight = keyboard.nextDouble();

		int heightFt = height / 12;
		int heightIn = height % 12;

		System.out.println("So you are " + age + " years old, " + heightFt + "\'" + heightIn 
		+ "\"" + " tall, and " + weight + " pounds.");
	}
}
