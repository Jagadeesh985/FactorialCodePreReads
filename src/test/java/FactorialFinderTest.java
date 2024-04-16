import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialFinderTest {
    @Test
    void shouldReturnOneForFactorialOfZero() {
        FactorialFinder factorialFinder = new FactorialFinder(0);
        int factorialOfZero = factorialFinder.getFactorial();

        assertEquals(factorialOfZero,1);
    }

    @Test
    void shouldReturnOneForFactorialOfOne() {
        FactorialFinder factorialFinder = new FactorialFinder(1);

        int factorialOfOne = factorialFinder.getFactorial();

        assertEquals(factorialOfOne,1);
    }

    @Test
    void shouldReturnNegativeOneForNegativeNumbers() {
        FactorialFinder factorialFinder = new FactorialFinder(-1);

        int factorialOfNegativeOne = factorialFinder.getFactorial();

        assertEquals(factorialOfNegativeOne,-1);
    }

    @Test
    void shouldReturnValidFactorialForFive() {

        FactorialFinder factorialFinder = new FactorialFinder(5);

        int factorialOfFive = factorialFinder.getFactorial();

        assertEquals(factorialOfFive,120);
    }

    @Test
    void shouldReturnValidFactorialForLargeNumbersLikeNine() {
        FactorialFinder factorialFinder = new FactorialFinder(9);

        int factorialOfNine = factorialFinder.getFactorial();

        assertEquals(factorialOfNine,362880);

    }
}