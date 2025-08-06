public class StringReverser {
    public static void main(String[] args) {
        String a = args[0];
        String b = "";
        int n = a.length();
        for (int i = 0; i < n; i++) {
            b = b + a.charAt(n - 1 - i);
        }
        System.out.println(b);
    }
}
