import java.util.*;
import java.lang.*;


class Arithex
{
	int a;
	int b;

	 Arithex(int a, int b)
	{
		this.a=a;
		this.b=b;
		try
		{
			int c = a/b;
		}
		catch(ArithmeticException e)
		{
			System.out.println("cant devide by zero");
		}
	}
}

class ArithmeticException_Demo
{
	public static void main (String args [])
	{
		Arithex sc = new Arithex(2,0);
	}
}