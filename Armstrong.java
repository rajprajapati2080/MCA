import java.util.*;
import java.util.Scanner;

class Armstrong 
{
	public static void main(String args[])
	{
		int num , temp , rem , sum = 0;
		System.out.println("Enter number :");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		temp = num ;
		while(num>0)
		{
			rem = num%10;
			sum = (sum)+rem*rem*rem;
			num = num / 10;
		}
		System.out.println(sum);
		if (sum == temp) {
			
			System.out.println("Armstrong No.");
		}
		else
			System.out.println("Not Armstrong No");
	}
}