public class removeDuplFromSorted {
    public static void main(String[] args) {
        int[] myArray = { 10, 10, 30, 40, 50 };
        int n = myArray.length;
        int i = 0;
        for (i = 0; i < n - 1; i++) {
            if (myArray[i] == myArray[i + 1]) {
                myArray[i + 1] = myArray[i + 2];
            }
            else {
                myArray[i + 1] = myArray[i + 2];
            }
        }
    }
}
