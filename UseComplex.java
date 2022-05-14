import java.util.Scanner;
public class UseComplex{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first complex Number: ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		Complex c1 = new Complex(x,y);
		System.out.print("Enter Second complex Number: ");
		x = sc.nextInt();
		y = sc.nextInt();
		Complex c2 = new Complex(x,y);
		Complex c3 = c1.addition(c2);
		System.out.println("Addition of two complex number: ");
		c3.display();
		Complex c4 = c1.subtraction(c2);
		System.out.println("Subtraction of two complex number: ");
		c4.display();
		Complex c5 = c1.multiplication(c2);
		System.out.println("Multiplication of two complex number: ");
		c5.display();
	}
} 