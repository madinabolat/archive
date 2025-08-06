package org.example;

import java.util.*;
public class GenerateParenthesis {
public static List<String> generateParenthesis(int n) {
            if (n==1){
                return Arrays.asList("()");
            }
            List<String> prev_list = generateParenthesis(n-1);
            HashSet<String> set = new HashSet<>();

            for (String element : prev_list){
                set.add("("+element+")");
                set.add("()"+element);
                set.add(element+"()");
            }
            List<String> n_list = new ArrayList<>(set);
            return n_list;

        }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        System.out.println(generateParenthesis(n));
    }


}
