import java.util.Scanner;
class Even_Odd
{
    public static void main (String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number for check odd or even: ");
        int num=scan.nextInt();
        Even(num);
}

    static void Even(int num)
    {
            if(num%2==0) 
                 System.out.println(num+" is even"); 
            else 
                System.out.println(num+" is Not Even");
    }
}