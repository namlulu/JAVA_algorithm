package org.example;

import java.util.Scanner;

public class reverseWord_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int input_1 = Integer.parseInt(in.nextLine());
        String[] dict = new String[input_1];

        for (int i = 0; i < input_1; i++) {
            String input_s = in.nextLine();
            StringBuffer sb = new StringBuffer(input_s);
            dict[i] = sb.reverse().toString();
        }

        for (String item : dict) {
            System.out.println(item);
        }
    }
}
