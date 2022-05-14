import java.util.*;
public class Pattern
{
    public static void main(String[] args)
    {
        int rows=4;
        System.out.println("** Printing the pattern... **");
        
        for (int i = rows; i >= 1; i--)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
