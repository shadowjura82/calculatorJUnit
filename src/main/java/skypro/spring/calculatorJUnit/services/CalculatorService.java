package skypro.spring.calculatorJUnit.services;

import org.springframework.web.bind.annotation.RequestParam;

public interface CalculatorService {
    int plus(@RequestParam int num1, @RequestParam int num2);
    int minus(@RequestParam int num1, @RequestParam int num2);
    int multiply(@RequestParam int num1, @RequestParam int num2);
    Double divide(@RequestParam Double num1, @RequestParam Double num2) throws IllegalAccessException;
}
