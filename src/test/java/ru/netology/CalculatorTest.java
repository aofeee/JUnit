package ru.netology;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    static Calculator calc = new Calculator();

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Начало тестов");
    }


    @AfterAll
    static void After() {
        System.out.println("Тесты завершены");
    }


    @Test
    void sum() {
        System.out.println("Тест сложения");
        int actual = calc.sum(50, 50);
        assertEquals(100, actual);
    }

    @Test
    void div() {
        System.out.println("Тест деления");
        int actual = calc.div(12, 2);
        assertEquals(6, actual);
    }

    @Test
    void divArithmeticExeption() {
        System.out.println("Деление на ноль, ожидание исключения");
        assertThrows(ArithmeticException.class, () -> calc.div(4, 0));
    }


    @Test
    void multiply() {
        System.out.println("Тест умножения");
        int actual = calc.multiply(4, 2);
        assertEquals(8, actual);
    }


    @Test
    void sub() {
        System.out.println("Тест вычетания");
        int actual = calc.sub(100, 2);
        assertEquals(98, actual);
    }

    @Test
    void dontEquals() {
        System.out.println("неравенство");
        int actual = calc.sum(100, 100);
        assertNotEquals(100, actual);
    }
}