package ru.netology;

public class Main {

    public static void main(String[] args) throws Exception {

        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(15, 78));
        System.out.println(calculator.multiply(78, 12));
        System.out.println(calculator.div(10, -2));

    }
}