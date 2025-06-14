package BasicSciCalculator;

public class Main {
    public static void main(String[] args) {
        Calculator basicCalculator = new BasicCalculator();
        ScientificCalculatorInterface sciCalculator = new ScientificCalculator();

        System.out.println("---- Basic Calculator ----");
        System.out.println("Add: " + basicCalculator.add(10, 5));
        System.out.println("Subtract: " + basicCalculator.subtract(10, 5));
        System.out.println("Multiply: " + basicCalculator.multiply(10, 5));
        System.out.println("Divide: " + basicCalculator.divide(10, 5));

        System.out.println("\n---- Scientific Calculator ----");
        System.out.println("Add: " + sciCalculator.add(10, 5));
        System.out.println("Subtract: " + sciCalculator.subtract(10, 5));
        System.out.println("Multiply: " + sciCalculator.multiply(10, 5));
        System.out.println("Divide: " + sciCalculator.divide(10, 5));
        System.out.println("Add: " + sciCalculator.power(15, 5));
        System.out.println("Subtract: " + sciCalculator.square(6));
        System.out.println("Multiply: " + sciCalculator.squareRoot(25));

    }

}
