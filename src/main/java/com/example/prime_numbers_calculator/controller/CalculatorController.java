package com.example.prime_numbers_calculator.controller;

import com.example.prime_numbers_calculator.service.ICalculator;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/api")
public class CalculatorController {
    private final ICalculator primeNumberCalculatorService;

    public CalculatorController(@Qualifier("primeNumberCalculatorService") final ICalculator primeNumberCalculatorService) {
        this.primeNumberCalculatorService = primeNumberCalculatorService;
    }

    @GetMapping("/calculator")
    public String calculatorHome() {
        return "index";
    }
    @PostMapping("/calculate-prime")
    public String calculatePrime(@RequestParam final int boundary, Model model) {
        List<Integer> numbers = primeNumberCalculatorService.calculate(boundary);
        model.addAttribute("boundary", boundary);
        model.addAttribute("numbers", numbers);
        return "index";
    }
}
