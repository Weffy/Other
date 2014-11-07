import java.util.Scanner;

public class RightTriangle
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int side1 = 0;
		int side2 = 0;
		int side3 = 0;
		System.out.println("Enter three integers in ascending order");
		System.out.println("the sides must be positive numbers");
		while (side1 <= 0)
		{
			System.out.print("Side 1: ");
			side1 = input.nextInt();
		}
		while (side2 <= 0 || side2 < side1)
		{
			System.out.print("Side 2: ");
			side2 = input.nextInt();
			if (side2 < side1)
			{
				System.out.println(side2 + " is less than " + side1);
			}
		}
		while (side3 <= 0 || side3 < side2)
		{
			System.out.print("Side 3: ");
			side3 = input.nextInt();
			if (side3 < side2)
			{
				System.out.println(side3 + " is less than " + side2);
			}
		}
		int a = side1 * side1;
		int b = side2 * side2;
		int c = side3 * side3;
		if (a + b == c)
		{
			System.out.println("That is a right triangle!");
		}
		else
		{
			System.out.println("This does not make a right triangle");
		}
	}
}
