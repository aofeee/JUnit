package ru.netology;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @BeforeAll
    static void Before() {
        System.out.println("Начало тестов");
    }


    @AfterAll
    static void After() {
        System.out.println("Тесты завершены");
    }

    @Test
    void sum() {
        Calculator calc = new Calculator();
        System.out.println("Тест сложения");
        try {
            int actual = calc.sum(50, 50);
            assertEquals(100, actual);
        } catch (ArithmeticException e) {
            e.getMessage();
        }

    }

    @Test
    void div() {
        Calculator calc = new Calculator();
        System.out.println("Тест деления");
        try {
            int actual = calc.div(12, 0);
            assertEquals(0, actual);
        } catch (ArithmeticException e) {
            e.getMessage();
        }
    }

    @Test
    void multiply() throws Exception {
        Calculator calc = new Calculator();
        System.out.println("Тест умножения");
        int actual = calc.multiply(4, 2);
        assertEquals(8, actual);
    }

    @Test
    void sub() throws Exception {
        Calculator calc = new Calculator();
        System.out.println("Тест вычетания");
        int actual = calc.sub(100, 2);
        assertEquals(98, actual);
    }

    @Test
    void dontEquals() {
        System.out.println("неравенство");
        int actual = 100;
        assertNotEquals(10, actual);
    }
}