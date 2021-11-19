package com.falah.unittesting;

import org.junit.jupiter.api.*;

@DisplayName("Test for calculator class")
public class CalculatorTest {

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Before all");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("After all");
    }

    @BeforeEach
    public void setUp() {
        System.out.println("Before each");
    }

    @AfterEach
    public void tearDown() {
        System.out.println("After each");
    }

    @Test
    @DisplayName("Test success scenario for method add(int a, int b) ")
    public void addSuccess() {
        var calculator = new Calculator();
        int result = calculator.add(5,5);
        Assertions.assertEquals(10, result);
    }

    @Test
    @DisplayName("Test success scenario for method divide(int a, int b) ")
    public void divideSuccess() {
        var calculator = new Calculator();
        int result = calculator.divide(100,10);
        Assertions.assertEquals(10, result);
    }

    @Test
    @DisplayName("Test fail scenario for method divide(int a, int b) ")
    public void divideFail() {
        var calculator = new Calculator();
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(100, 0);
        });
    }
}
