public class sumArray {
    public static void main(String[] args) {
        int[] myArray = { 10, 20, 30, 40 };
        int arrayLength = myArray.length;
        int sum = 0;
        int i = 0;
        for (i = 0; i < arrayLength; i++) {
            sum = sum + myArray[i];
        }
        System.out.println(sum);
    }
}
