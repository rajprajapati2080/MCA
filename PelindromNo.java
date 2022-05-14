import java.util.*;
import java.util.Scanner;
 class PelindromNo
 {
 	public static void main(String args[])
 	{
 		int num , temp , sum=0 , rem;
 		Scanner sc = new Scanner(System.in);
 		System.out.println("Enter Number ;");
 		num = sc.nextInt();
 		temp=num;
 		while(num>0)
 		{
 			rem = num % 10;
 			sum = (sum*10)+rem;
 			num = num/10;
 		}
 		if(temp==sum)
 		{
 			System.out.println("Number is Palindrom");
 		}
 		else
 			System.out.println("not Palindrom no :");
 	}
 }