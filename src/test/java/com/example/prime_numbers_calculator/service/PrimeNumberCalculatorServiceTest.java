package com.example.prime_numbers_calculator.service;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PrimeNumberCalculatorServiceTest {
    private static PrimeNumberCalculatorService primeNumberCalculatorService;

    @BeforeAll
    static void setUp() {
        primeNumberCalculatorService = new PrimeNumberCalculatorService();
    }

    @Test
    void shouldCalculatePrimeNumbersWithBoundaryEqualThirty() {
        int boundary = 30;

        List<Integer> primeNumbers = primeNumberCalculatorService.calculate(boundary);

        assertEquals(List.of(2, 3, 5, 7, 11, 13, 17, 19, 23, 29), primeNumbers);
    }

    @Test
    void shouldDontReactToNegativeValues() {
        int boundary = -30;

        List<Integer> primeNumbers = primeNumberCalculatorService.calculate(boundary);

        assertEquals(new ArrayList<>(), primeNumbers);
    }

}