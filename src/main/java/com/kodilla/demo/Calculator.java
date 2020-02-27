package com.kodilla.demo;

public class Calculator {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        System.out.println("Result of method .addTwoValues(8.5, 16.33): " +
                calculator.addTwoValues(8.5, 16.33));
        System.out.println("Result of method .subtractTwoValues(8.5, 16.33): " +
                calculator.subtractTwoValues(8.5, 16.33));

    }

    public static double addTwoValues(double valA, double valB) {
        return valA + valB;
    }

    public static double subtractTwoValues(double valA, double valB) {
        return valA - valB;
    }

}
