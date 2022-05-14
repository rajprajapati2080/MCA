import java.util.Scanner;  
class StringIndexOutOfBound_Demo
{
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter indexno :");
		int b = sc.nextInt();
		String a = "hy this is ram";

		try
		{
			char c = a.charAt(b);
			System.out.println("char is : "+c);
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("please Enter Valide index");
		}
		
	}
}