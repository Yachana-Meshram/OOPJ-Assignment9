package com.example.cdac;

public class Program {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            int index = 5; 
            int value = numbers[index];
            System.out.println("Value at index " + index + ": " + value); // This line will not be reached
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of Bounds Exception caught.");
            e.printStackTrace();
        }
    }
}
