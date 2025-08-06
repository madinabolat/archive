public class SumEvenArray {
    public static void main(String[] args) {
        int[] myArray = {10, 25, 35, 40};
        int sum = 0;
        int i;
        for (i=0; i<myArray.length; i++)
            if (myArray[i] % 2 != 0) {
                sum = sum + myArray[i];
            }
        System.out.println(sum);
    }
}
