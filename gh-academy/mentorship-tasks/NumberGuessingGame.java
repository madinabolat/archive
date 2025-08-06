public class NumberGuessingGame {
    public static void main(String[] args) {
        Double x = 100 * Math.random();
        Integer n = (int) Math.round(x);
        System.out.println(n);
        Integer userInput = Integer.parseInt(args[0]);
        if (userInput == n) {
            System.out.println("You guessed right!");
        }
        else if (userInput < n) {
            System.out.println("Try a higher number");
        }
        else {
            System.out.println("Try a lower number");
        }
    }
}
