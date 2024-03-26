package com.example.cdac;

public class Program {
    public static void main(String[] args) {
        try {
            // Code that may throw different types of exceptions
            int result = divideByZero();
            System.out.println("Result: " + result); // This line will not be reached
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception caught: Division by zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of Bounds Exception caught");
        } catch (Exception e) {
            System.out.println("General Exception caught");
        }
    }
    
    public static int divideByZero() {
        // Attempting to divide by zero
        return 10 / 0;
    }
}
