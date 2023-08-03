package skypro.spring.calculatorJUnit.exceptions;

import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CalculatorExceptionHandler {
    @ExceptionHandler({IllegalAccessException.class, MissingServletRequestParameterException.class})
    public void displayError(Exception e) {
        System.out.println("Упс, что-то пошло не так");
        System.out.println(e.getMessage());
    }

    @ExceptionHandler(MyIllegalArgumentException.class)
    public void MyIllegalArgumentException(Exception e) {
        System.out.println("Упс, что-то пошло не так");
        System.out.println(e.getMessage());
    }
}