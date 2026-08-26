package org.numbers;

import java.util.Arrays;

public class NumberPrograms {

    public static void main(String args[]){

        //swap 2 number without temp variable
        int x = 9;
        int y = 10;
        int a = 15;
        int b = 22;
        int m = 17;
        int n = 16;

        //1 using + operator
        x = x+y ; //19
        y = x-y; // 9
        x = x - y; // 10
        System.out.println("using + operator -> x -> "+x + " Y -> " + y );
        //2. using * operator
        a = a * b;
        b = a/b;
        a = a/b;
        System.out.println("Using * operator a -> "+a + " b -> " + b);
        //3. Using XOR method ^
        m = m ^ n;
        n = m ^ n;
        m = m ^ n;
        System.out.println("Using XOR method m -> "+m + " n -> "+n);



        System.out.println("Reverse number of 12345 -> " + reverseNumber(12345));

        //using string buffee method
        long num = 123456;
        System.out.println(new StringBuffer(String.valueOf(num)).reverse());

        int[] nums = {-10, 30, 24, 54, -88, 1231};
        LargestSmallest(nums);
    }

    public static int reverseNumber(int n){
        int rev=0;
        while(n != 0){
            rev = rev *10 + n%10;
            n = n/10;
        }
        return rev;
    }

    public static void LargestSmallest(int... nums){
        int ln = nums[0];
        int sn = nums[0];

        for(int i=1; i <nums.length; i++){
            if(nums[i] > ln){
                ln = nums[i];
            } else if (nums[i] < sn){
                sn = nums[i];
            }
        }
        System.out.println("Given Array -> " + Arrays.toString(nums));
        System.out.println("Larsgest -> " + ln + " Smallest -> "+sn);
    }


}
