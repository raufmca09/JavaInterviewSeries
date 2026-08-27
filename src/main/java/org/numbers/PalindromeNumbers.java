package org.numbers;

public class PalindromeNumbers {

    public static void isPalindrome(int num){
        int temp = num;
        int rev=0;
        int rem = 0;


        while( num > 0){
            rem = num%10;
            rev =(rev * 10) + rem;
            num = num / 10;
        }

        if( temp == rev ){
            System.out.println(" given number is plaindrome -> " +temp );
        }else{
            System.out.println(" given number is not palindrome -> " + temp);
        }
    }
    public static void main(String args[]){

        isPalindrome(141);
        isPalindrome(123);
        isPalindrome(34543);
    }
}
