public class MoreVariablesAndPrinting
{
	public static void main(String[] args)
	{
		String myName, myEyes, myTeeth, myHair;
		int myAge, myHeight, myWeight;

		myName = "Krirk Pongsema";
		myEyes = "Brown";
		myTeeth = "White...sometimes";
		myAge = 33;
		myHeight = (5 * 12) + 10;
		myWeight = 220;

		System.out.println("Let's talk about " + myName + ".");
		System.out.println("He's " + myHeight + " inches tall");
		System.out.println("He weighs " + myWeight + " lbs");
		if (myWeight > 200)
		{
			System.out.println("He need to lose a weight :(");
		}
		System.out.println("He has " + myEyes + " eyes");
		System.out.println("and his teeth are " + myTeeth);
		System.out.println("if I add " + myAge + " and " + myHeight + " and " + myWeight + " I'd get "
		+ (myAge + myHeight + myWeight));
	}
}
