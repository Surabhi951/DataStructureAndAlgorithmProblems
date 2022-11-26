package com.bridgelabz;

import java.util.Arrays;

public class PrimeNumbersAreAnagramPalindrome {

    public static void checkPrimeNumber() {
        int[] array = new int[170];
        int count = 0;
        int minBound = 0;
        int maxBound = 1000;
        for(int i = minBound + 2; i < maxBound; i++) {

            int flag = 1;
            for (int j = 2; j <= i/2; j++) {
                if(i%j == 0) {
                    flag = 0;
                    break;
                }
            }
            if(flag == 1) {
                array[count++] = i;
                checkPalindromeNumbers(i);
            }
        }
        checkAnagramNumbers(array);
    }

    public static void checkPalindromeNumbers(int number) {
        int reverse = 0;
        int temp = number;
        while (number != 0) {
            int remainder = number%10;
            reverse = reverse * 10 + remainder;
            number = number/10;
        }
        if (reverse == temp) {
            System.out.println(temp+ " is prime and palindrome");
        }
    }

    public static void checkAnagramNumbers(int[] array) {
        int n = array.length;
        for (int i = 2; i < n; i++) {
            int number1 = array[i];
            for (int j = i + 2; j < n; j++) {
                int number2 = array[j];
                char[] charArray1 = String.valueOf(number1).toCharArray();
                char[] charArray2 = String.valueOf(number2).toCharArray();

                Arrays.sort(charArray1);
                Arrays.sort(charArray2);

                if (Arrays.toString(charArray1).equals(Arrays.toString(charArray2))) {
                    System.out.println(number1 + " and " + number2 + "are prime and anagram");
                }
            }
        }
    }

    public static void main(String[] args) {
        checkPrimeNumber();
    }
}
