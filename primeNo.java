import java.util.*;
import java.util.Scanner;

class PrimeNo
{
	public static void main (String args[])
	{
		int num , i,count = 0;
		System.out.println("Enter No. :");
		Scanner sc =  new Scanner(System.in);
		num = sc.nextInt();
		for (i=1; i<=num; i++) {
			if (num % i == 0) {
				count++;
				
			}
			
		}
		if (count ==2)
		{
			System.out.println("PrimeNo");	
		}
		else
			System.out.println("Not a PrimeNo ");
	}
}