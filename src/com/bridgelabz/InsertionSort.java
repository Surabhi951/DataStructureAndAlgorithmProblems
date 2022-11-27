package com.bridgelabz;

public class InsertionSort {
    public void insertionSort(String [] array) {

        for(int i = 0; i < array.length; i++) {
            String temp = array[i];
            int index = i - 1;
            while(index >= 0 && array[index].compareTo(temp) > 0) {
                array[index + 1] = array[index];
                index--;
            }

            array[index + 1] = temp;

        }
    }

    public static void main(String[] args) {

        InsertionSort insertion = new InsertionSort();
        String[] array = {"Saniya","Rupali", "Deepika","Anshika", "Vanita", "Bani", "Siya", "Priyanka"};

        insertion.insertionSort(array);
        for (String s : array) {
            System.out.println(s);
        }
    }
}
