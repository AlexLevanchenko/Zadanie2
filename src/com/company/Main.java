package com.company;

public class Main {

    public static void main(String[] args) {
        int number = 1;
        for (int i = 1; i <= 100; i++) {
            number *= i;
            System.out.println("Result: " + number);
            if (number >= 1000) {
                break;
            }
        }
    }
}

