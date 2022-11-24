package com.bridgelabz;

import java.util.Scanner;

public class BubbleSort {

    public void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public void printArray(int[] arr) {
        System.out.print("{");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("}");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BubbleSort sort = new BubbleSort();

        int[] array = new int[5];
        System.out.println("Enter 5 integer values: ");
        for (int i = 0; i < 5; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("before sorting: ");
        sort.printArray(array);

        sort.bubbleSort(array);

        System.out.println("after sorting: ");
        sort.printArray(array);
    }
}
