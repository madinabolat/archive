public class PalindromeChecker {
    public static void main(String[] args) {
        String a = args[0];
        int n = a.length();
        boolean lengthEven = (n % 2 == 0);
        int counter = 0;
        if (lengthEven) {
            for (int i = 0; i < n / 2; i++) {
                if (a.charAt(i) == a.charAt(n - 1 - i)) {
                    counter++;
                }
                else {
                    System.out.println("Not a Palindrome");
                    break;
                }
            }
            if (counter == n / 2) {
                System.out.println("Palindrome");
            }
        }
        else {
            for (int i = 0; i < (n - 1) / 2; i++) {
                if (a.charAt(i) == a.charAt(n - 1 - i)) {
                    counter++;
                }
                else {
                    System.out.println("Not a Palindrome");
                    break;
                }
                if (counter == (n - 1) / 2) {
                    System.out.println("Palindrome");
                }
            }
        }


    }
}
