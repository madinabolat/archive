public class FirstSumArray {
    public static void main(String[] args) {
        int[] myArray = {10, 20, 30, 40};
        int sum = 0;
        int i;
        for (i=0; i<myArray.length; i++)
            sum = sum + myArray[i];
        System.out.println(sum);
    }
}
