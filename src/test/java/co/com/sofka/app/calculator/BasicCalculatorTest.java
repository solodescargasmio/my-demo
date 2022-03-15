package co.com.sofka.app.calculator;

import co.com.sofka.app.BasicCalculator;
import junit.framework.TestCase;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class BasicCalculatorTest extends TestCase {
    private final BasicCalculator basicCalculator = new BasicCalculator();

    @Test
    @DisplayName("Testing sum: 1+1=2")
    public void sum() {
        // Arrange
        Long number1 = 1L;
        Long number2 = 1L;
        Long expectedValue = 2L;

        // Act
        Long result = basicCalculator.sum(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @Test
    @DisplayName("Testing rest: 4-2=2")
    public void rest() {
        // Arrange
        Long number1 = 4L;
        Long number2 = 2L;
        Long expectedValue = 2L;

        // Act
        Long result = basicCalculator.rest(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }
    @Test
    @DisplayName("Testing multiplication: 5*2=10")
    public void multiplication() {
        // Arrange
        Long number1 = 5L;
        Long number2 = 2L;
        Long expectedValue = 10L;

        // Act
        Long result = basicCalculator.multiplication(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @Test()
    @DisplayName("Testing division: 10/2=5")
    public void division() {
        // Arrange
        Long number1 = 10L;
        Long number2 = 2L;
        Long expectedValue = 5L;

        // Act
        Long result = basicCalculator.division(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }
    @Test()
    @DisplayName("Testing division: 10/0=error")
    public void divisionCero() {
        // Arrange
        Long number1 = 10L;
        Long number2 = 0L;
        Long expectedValue = 5L;

        // Act
        Long result = basicCalculator.division(number1, number2);
        ArithmeticException exception = assertThrows(ArithmeticException.class,
                ()->{basicCalculator.division(number1, number2);} );

        // Assert
        assertEquals(exception.getMessage(), "No se puede dividir por cero");
    }

}