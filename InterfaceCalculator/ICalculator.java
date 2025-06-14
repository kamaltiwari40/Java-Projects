package InterfaceCalculator;

public interface ICalculator {
    float add(float a, float b);

    float subtract(float a, float b);

    float multiply(float a, float b);

    float divide(float a, float b) throws ArithmeticException;
}
