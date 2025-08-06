public class nmMatrix {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);
        double[] array = new double[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                array[j] = Math.random();
                System.out.println(array[j]);
            }
        }
    }
}
