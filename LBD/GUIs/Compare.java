public class Compare
{
	public static void main(String[] args)
	{
		System.out.print("Comparing \"axe\" with \"dog\" produces ");
		int i = "axe".compareTo("dog");
		System.out.println(i);

		System.out.print("Comparing \"apple\" with \"applebee's\" produces ");
		System.out.println("applebee's".compareTo("apple"));
		System.out.println("'".compareTo(" "));
	}
}
