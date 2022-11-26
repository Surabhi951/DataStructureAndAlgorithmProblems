package com.bridgelabz;

public class PrimeNumbersInThatRange {

    public static void main(String[] args) {
        PrimeNumbersInThatRange numbers = new PrimeNumbersInThatRange();
        for (int i = 2; i < 1000; i++) {
            boolean isPrime = numbers.checkPrimeNumbers(i);
            if (isPrime){
                System.out.println(i + " ");
            }
        }
    }

    public boolean checkPrimeNumbers(int i) {
        boolean isPrime = true;
        for (int j = 2; j <= i/2; j++) {
            if (i % j == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
