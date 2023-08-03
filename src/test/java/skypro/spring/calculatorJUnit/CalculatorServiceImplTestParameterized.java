package skypro.spring.calculatorJUnit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import skypro.spring.calculatorJUnit.services.CalculatorServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorServiceImplTestParameterized {
    CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();

    @ParameterizedTest
    @DisplayName("Проверка операции сложения")
    @CsvFileSource(resources = "/plus.csv", delimiter = '|', numLinesToSkip = 1)
    void plus(int a, int b, int expected) {
        assertEquals(expected, calculatorService.plus(a, b));
    }

    @ParameterizedTest
    @DisplayName("Проверка операции вычитания")
    @CsvFileSource(resources = "/minus.csv", delimiter = '|', numLinesToSkip = 1)
    void minus(int a, int b, int expected) {
        assertEquals(expected, calculatorService.minus(a, b));
    }

    @ParameterizedTest
    @DisplayName("Проверка операции умножения")
    @CsvFileSource(resources = "/multiply.csv", delimiter = '|', numLinesToSkip = 1)
    void multiply(int a, int b, int expected) {
        assertEquals(expected, calculatorService.multiply(a, b));
    }

    @ParameterizedTest
    @DisplayName("Проверка операции деления")
    @CsvFileSource(resources = "/divide.csv", delimiter = '|', numLinesToSkip = 1)
    void divide(Double a, Double b, Double expected) throws IllegalAccessException {
        assertEquals(expected, calculatorService.divide(a, b));
    }
}