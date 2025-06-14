package BasicSciCalculator;

public class ScientificCalculator implements ScientificCalculatorInterface {

    @Override
    public double add(double a, double b) {
        return a + b;
    }

    @Override
    public double subtract(double a, double b) {
        return a - b;
    }

    @Override
    public double multiply(double a, double b) {
        return a * b;
    }

    @Override
    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by Zero.");
        }
        return a / b;
    }

    @Override
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    @Override
    public double square(double number) {
        return number * number;
    }

    @Override
    public double squareRoot(double number) {
        if (number < 0) {
            throw new IllegalArgumentException("Cannot take square root of a negative number.");
        }
        return Math.sqrt(number);
    }
}
