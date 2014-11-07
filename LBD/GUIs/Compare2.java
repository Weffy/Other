public class Compare2
{
	public static void main(String[] args)
	{
		//int l = "axe".length();
		//System.out.println(l);
		String str1 = "axe";
		String str2 = "dog";
		System.out.println("axe -> dog");
		System.out.println(str1.compareTo(str2));
		System.out.println("dog -> axe");
		System.out.println(str2.compareTo(str1));
		//compare axe and dog one by one
		System.out.println("letter by letter axe -> dog");
		System.out.println("a".compareTo("d"));
		System.out.println("x".compareTo("o"));
		System.out.println("e".compareTo("g"));
		System.out.println("pairing letters");
		System.out.println("ax -> do");
		System.out.println("ax".compareTo("do"));
		System.out.println("xe -> og");
		System.out.println("xe".compareTo("og"));

	}
}
