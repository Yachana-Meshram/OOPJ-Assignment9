package com.example.cdac;

class OddNumberException extends Exception {
    public OddNumberException(String message) {
        super(message);
    }
}

public class Program {
    public static void main(String[] args) {
        try {
            int number = 7; // Change this to test different numbers
            checkEvenNo(number);
            System.out.println(number + " is an even number.");
        } catch (OddNumberException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public static void checkEvenNo(int number) throws OddNumberException {
        if (number % 2 != 0) {
            throw new OddNumberException(number + " is an odd number.");
        }
    }
}

