public class reverseArray {
    public static void main(String[] args) {
        int[] myArray = { 10, 20, 30, 40 };
        int reversedArray[] = new int[myArray.length];
        int n = myArray.length;
        int i = 0;
        for (i = 0; i < n; i++) {
            reversedArray[i] = myArray[n - 1 - i];
        }
        for (i = 0; i < n; i++) {
            System.out.println(reversedArray[i]);
        }
    }
}
