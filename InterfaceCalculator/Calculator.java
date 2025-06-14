package InterfaceCalculator;

public class Calculator implements ICalculator {

    @Override
    public float add(float a, float b) {
        return a + b;
    }

    @Override
    public float subtract(float a, float b) {
        return a - b;
    }

    @Override
    public float multiply(float a, float b) {
        return a * b;
    }

    @Override
    public float divide(float a, float b) throws ArithmeticException {
        if (b == 0.0f) {
            throw new ArithmeticException("Cannot divide by Zero.");
        }
        return a / b;
    }
}
