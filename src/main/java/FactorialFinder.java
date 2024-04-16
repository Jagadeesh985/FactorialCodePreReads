public class FactorialFinder {
    private final int number;

    public FactorialFinder(int number) {
        this.number = number;
    }

    public int getFactorial() {
        if(number < 0) return -1;
        if(number == 0) return 1;
        if(number == 1) return 1;

        int factorial = 1;

        for (int num = 2; num <= number ; num++) {
            factorial *= num;
        }
        return factorial;
    }
}
