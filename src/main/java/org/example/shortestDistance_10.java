package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class shortestDistance_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] inputs = in.nextLine().split(" ");
        String s = inputs[0];
        String t = inputs[1];
        ArrayList<Integer> t_index = new ArrayList<Integer>();

        String answer = "";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t.charAt(0)) {
                t_index.add(i);
            }
        }

        for (int i = 0; i < s.length(); i++) {
            int small = Integer.MAX_VALUE;

            for (int j = 0; j < t_index.size(); j++) {
                int distance = Math.abs(i - t_index.get(j));

                if (distance < small) {
                    small = distance;
                }
            }

            answer += String.valueOf(small);

            if (i != s.length() - 1) {
                answer += " ";
            }
        }

        System.out.println(answer);
    }
}
