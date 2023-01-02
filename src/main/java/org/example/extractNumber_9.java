package org.example;

import java.util.Scanner;

public class extractNumber_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String input_1 = in.nextLine();
        String answer = "";

        for (int i = 0; i < input_1.length(); i++) {
            char c = input_1.charAt(i);
            if (Character.isDigit(c)) {
                answer += c;
            }
        }

        System.out.println(Integer.parseInt(answer));
    }
}
