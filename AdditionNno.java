import java.util.Scanner;

class AdditionNno
{
	public static void main(String args[])
	{
		int i,num,sum=0;
		System.out.println("Enter no : ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		for (i=1; i<=num; i++) {
			sum = sum +i;
			
		}
		System.out.println("AdditionNno is :"+sum);
	}
}