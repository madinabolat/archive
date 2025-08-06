public class Fibonacci {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] fibseq = new int[n];
        fibseq[0] = 0;
        fibseq[1] = 1;
        for (int i = 2; i < n; i++) {
            fibseq[i] = fibseq[i - 1] + fibseq[i - 2];
        }
        for (int element : fibseq) {
            System.out.println(element);
        }

    }
}
