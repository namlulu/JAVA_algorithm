package org.example;

import java.util.Scanner;

public class a02_transferLowerUpper {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String input_1 = in.nextLine();
        StringBuilder answer = new StringBuilder();

        for (char c : input_1.toCharArray()) {
            if (Character.isLowerCase(c)) {
                answer.append(Character.toUpperCase(c));
            } else {
                answer.append(Character.toLowerCase(c));
            }
        }

        System.out.println(answer);
    }
}
