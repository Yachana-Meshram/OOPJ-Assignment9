package com.example.cdac;

public class Program {
    public static void main(String[] args) {
        try {
            // Attempting to divide by zero
            int result = 10 / 0;
            System.out.println("Result: " + result); // This line will not be reached
        } catch (ArithmeticException e) {
            // Catching the ArithmeticException
            System.out.println("Arithmetic Exception caught: Division by zero");
            e.printStackTrace();
        }
    }
}