package skypro.spring.calculatorJUnit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import skypro.spring.calculatorJUnit.exceptions.MyIllegalArgumentException;
import skypro.spring.calculatorJUnit.services.CalculatorServiceImpl;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplTest {
    int a;
    int b;
    Double c;
    Double d;
    Random random = new Random();
    CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();

    @Test
    @DisplayName("Проверка операции сложения")
    void plus() {
        test("plus");
    }

    @Test
    @DisplayName("Проверка операции вычитания")
    void minus() {
        test("minus");
    }

    @Test
    @DisplayName("Проверка операции умножения")
    void multiply() {
        test("multiply");
    }

    @Test
    @DisplayName("Проверка операции деления")
    void divide() throws IllegalAccessException {
        for (int i = 0; i < 2; i++) {
            c = random.nextDouble();
            d = random.nextDouble();
            assertEquals(c / d, calculatorService.divide(c, d));
        }

    }

    @Test
    @DisplayName("Проверка деления на 0")
    void divideNull() throws IllegalAccessException {
        Exception e = assertThrows(MyIllegalArgumentException.class, () -> calculatorService.divide(1.0, 0.0));
        assertEquals(e.getMessage(), "Деление на 0 невозможно");
    }

    void test(String param) {
        for (int i = 0; i < 2; i++) {
            a = random.nextInt(100);
            b = random.nextInt(100);
            switch (param) {
                case "plus":
                    assertEquals(a + b, calculatorService.plus(a, b));
                    break;
                case "minus":
                    assertEquals(a - b, calculatorService.minus(a, b));
                    break;
                case "multiply":
                    assertEquals(a * b, calculatorService.multiply(a, b));
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + param);
            }
        }
    }
}