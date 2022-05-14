import java.util.*;
import java.lang.*;
class ExcepDemo
{
	public static void main (String args[])
	{
		private static int Div(int a,int b)
		{
			try
			{
				int result = a/b;
				return (result);
			}
			catch(ArithmeticException ex)
			{
				System.out.println("cant divide by zero");
			}

		}
		ExcepDemo sc = new ExcepDemo();
		sc.Div(89,0);


	}
}