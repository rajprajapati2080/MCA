import java.util.*;

import java.util.Scanner;

public class Mean1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input the size of the array");
        int size = sc.nextInt();

        System.out.println("enter the array elements");
        int nums[] = new int[size];
        for(int i=0 ; i<size ; i++){
            nums[i] = sc.nextInt();
        }

        System.out.println(getMean(nums));
    }

    static float getMean(int nums[]){
        int sum = 0;

        for(int i : nums){
            sum += i;
        }

        return (float)(sum/nums.length);
    }
}
