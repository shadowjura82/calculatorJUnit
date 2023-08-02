package skypro.spring.calculatorJUnit.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import skypro.spring.calculatorJUnit.services.CalculatorServiceImpl;

@RestController
public class CalculatorController {
    private final CalculatorServiceImpl calculatorService;

    public CalculatorController(CalculatorServiceImpl calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String wellcome() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping(path = "/plus")
    public String plus(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " + " + num2 + " = " + calculatorService.plus(num1, num2);
    }

    @GetMapping(path = "/minus")
    public String minus(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " - " + num2 + " = " + calculatorService.minus(num1, num2);
    }

    @GetMapping(path = "/multiply")
    public String multiply(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " * " + num2 + " = " + calculatorService.multiply(num1, num2);
    }

    @GetMapping(path = "/divide")
    public String divide(Double num1, Double num2) throws IllegalAccessException {
        return num1 + " / " + num2 + " = " + calculatorService.divide(num1, num2);
    }
}