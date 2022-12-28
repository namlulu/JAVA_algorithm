package org.example;

import java.util.Scanner;

public class transferLowerUpper_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String input_1 = in.nextLine();
        int inputLength = input_1.length();

        String answer = "";

        for (int i = 0; i < inputLength; i++) {
            String item = String.valueOf(input_1.charAt(i));
            if (item.equals(item.toLowerCase())) {
                answer += item.toUpperCase();
            } else {
                answer += item.toLowerCase();
            }
        }

        System.out.println(answer);
    }
}
