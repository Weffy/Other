import javax.swing.*;

public class Prog411
{
	public static void main(String[] args)
	{
		String name = JOptionPane.showInputDialog("What is your name?: ");

		String input = JOptionPane.showInputDialog("how old are you? ");
		int age = Integer.parseInt(input);

		System.out.print("Hello " + name + ".");
		System.out.println("  Next year, you'll be " + (age + 1) );

		System.exit(0);
	}
}
