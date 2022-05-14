import java.util.*;

import java.util.Scanner;

public class Palindrome{
    public static void main(String[] args) {
        System.out.println("Enter a String you want to check");
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        boolean b = isPalindrome(s.toCharArray());

        if(b)
            System.out.println("char is palindrome");
        else
            System.out.println("char is not palindrome");
    }

    static boolean isPalindrome(char arr[]){
        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            if(arr[start]!=arr[end])
                return false;

            start++;
            end--;
        }

        return true;
    }
}
