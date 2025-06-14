package InterfaceCalculator;

public class Main {
    public static void main(String[] args) {
        ICalculator cal = new Calculator();

        System.out.println("Add: " + cal.add(5.2f, 3.1f));
        System.out.println("Subtract: " + cal.subtract(15.5f, 6.2f));
        System.out.println("Multiply: " + cal.multiply(4.5f, 5.0f));

        try {
            System.out.println("Divide: " + cal.divide(10.0f, 0.0f));
        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
