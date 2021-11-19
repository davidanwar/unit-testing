package com.falah.unittesting;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Can not divide by zero");
        } else {
            return a / b;
        }
    }
}
