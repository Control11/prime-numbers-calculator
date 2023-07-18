package com.example.prime_numbers_calculator.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class PrimeNumberCalculatorService implements ICalculator {
    @Override
    public List<Integer> calculate(int boundary) {
        Map<Integer, Boolean> numbersStatus = new HashMap<>();
        List<Integer> primeNumbers = new ArrayList<>();

        for (int i = 2; i <= boundary; i++) {
            numbersStatus.put(i, true);
        }

        for (int i = 2; i <= Math.sqrt(boundary); i++) {
            if(numbersStatus.get(i)) {
                for (int j = i * i; j <= boundary; j += i) {
                    numbersStatus.put(j, false);
                }
            }
        }

        primeNumbers.addAll(
                numbersStatus.entrySet()
                        .stream()
                        .filter(entry -> entry.getValue())
                        .map(entry -> entry.getKey())
                        .collect(Collectors.toList())
        );

        return primeNumbers;
    }

}
