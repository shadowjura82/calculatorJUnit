package skypro.spring.calculatorJUnit.services;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public int plus(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int minus(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public Double divide(Double num1, Double num2) throws IllegalAccessException {
        if (num2 == 0.0) {
            throw new IllegalAccessException("Деление на 0 невозможно");
        } else {
            return num1 / num2;
        }
    }
}
