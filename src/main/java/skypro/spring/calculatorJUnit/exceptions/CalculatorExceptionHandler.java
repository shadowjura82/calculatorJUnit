package skypro.spring.calculatorJUnit.exceptions;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CalculatorExceptionHandler {
    @ExceptionHandler({IllegalAccessException.class, RuntimeException.class})
    public void displayError(Exception e) {
        System.out.println("Упс, что-то пошло не так");
        System.out.println(e.getMessage());
    }
}