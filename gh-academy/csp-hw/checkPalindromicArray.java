public class checkPalindromicArray {
    public static void main(String[] args) {
        int[] myArray = { 10, 20, 30, 40, 10 };
        int n = myArray.length;
        int i = 0;
        int counter = 0;
        for (i = 0; i < n; i++) {
            if (myArray[i] != myArray[n - 1 - i]) {
                counter++;
            }
        }
        if (counter > 0) {
            System.out.println("Not palindromic");
        }
        else {
            System.out.println("Palindromic");
        }
    }
}
