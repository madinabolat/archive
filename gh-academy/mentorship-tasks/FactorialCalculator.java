public class FactorialCalculator {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int factorial = 1;
        for (int i = 1; i < n + 1; i++) {
            factorial = factorial * i;
        }
        System.out.println("Factorial of " + n + ": " + factorial);

    }
}
