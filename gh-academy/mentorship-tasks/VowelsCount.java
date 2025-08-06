public class VowelsCount {
    public static void main(String[] args) {
        String a = args[0];
        int counter = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' || a.charAt(i) == 'o'
                    || a.charAt(i) == 'u') {
                counter++;
            }
        }
        System.out.println("Number of vowels: " + counter);
    }
}
