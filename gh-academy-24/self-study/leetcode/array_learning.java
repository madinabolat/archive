import java.util.Arrays;

public class array_learning {
    public static void main(String[] args) {
        int[] array = {1,2,6,4,5,6,7,2};
//        reverse(array,0,array.length-1);
//          sort(array);
        swap(array,2,3);
          System.out.println(Arrays.toString(array));

    }

    public static void reverse(int[] array, int start, int end){
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    public static void sort(int[] array){
        for (int i=0; i < array.length-1; i++){
            for (int j = 0; j< array.length - 1 -i; j++){
                if (array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }

        }
    }

    public static void swap(int[] array, int i, int j){
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
