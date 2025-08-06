package org.example;

public class maxmin {
    public int maxelem(int[] array){
        int maxelem = array[0];
        for (int current: array){
            maxelem = Math.max(maxelem, current);
        }
        return maxelem;
    }
    public int minelem(int[] array){
        int minelem = array[0];
        for (int current: array){
            minelem = Math.min(minelem, current);
        }
        return minelem;
    }

    public static void main(String[] args) {
        maxmin example = new maxmin();
        int[] array = {3,2,5,1,4};
        int maxelement = example.maxelem(array);
        System.out.println(maxelement);
        int minelement = example.minelem(array);
        System.out.println(minelement);
    }
}
