import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialFinderTest {
    @Test
    void shouldReturnOneForFactorialOfZero() {
        FactorialFinder factorialFinder = new FactorialFinder(0);
        int factorialOfZero = factorialFinder.getFactorial();

        assertEquals(1,factorialOfZero);
    }

    @Test
    void shouldReturnOneForFactorialOfOne() {
        FactorialFinder factorialFinder = new FactorialFinder(1);

        int factorialOfOne = factorialFinder.getFactorial();

        assertEquals(1,factorialOfOne);
    }

    @Test
    void shouldReturnNegativeOneForNegativeNumbers() {
        FactorialFinder factorialFinder = new FactorialFinder(-1);

        int factorialOfNegativeOne = factorialFinder.getFactorial();

        assertEquals(-1,factorialOfNegativeOne);
    }

    @Test
    void shouldReturnValidFactorialForFive() {

        FactorialFinder factorialFinder = new FactorialFinder(5);

        int factorialOfFive = factorialFinder.getFactorial();

        assertEquals(120,factorialOfFive);
    }

    @Test
    void shouldReturnValidFactorialForLargeNumbersLikeNine() {
        FactorialFinder factorialFinder = new FactorialFinder(9);

        int factorialOfNine = factorialFinder.getFactorial();

        assertEquals(362880,factorialOfNine);

    }
}