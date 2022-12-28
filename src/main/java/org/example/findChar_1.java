package org.example;

import java.util.Scanner;

public class findChar_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String input_1 = in.nextLine().toLowerCase();
        String input_2 = in.nextLine().toLowerCase();

        int count = 0;

        for (int i = 0; i < input_1.length(); i++) {
            if (input_1.charAt(i) == input_2.toCharArray()[0]) {
                count += 1;
            }
        }

        System.out.println(count);
    }
}