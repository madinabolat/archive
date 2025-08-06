public class BasicCalculator {
    public static void main(String[] args) {
        Double a = Double.parseDouble(args[0]);
        Double b = Double.parseDouble(args[1]);
        System.out.println("Sum: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
    }
}
