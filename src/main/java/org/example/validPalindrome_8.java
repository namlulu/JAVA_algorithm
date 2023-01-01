package org.example;

import java.util.Scanner;

public class validPalindrome_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String input_1 = in.nextLine()
                .toUpperCase()
                .replaceAll("[^A-Z]", "");
        String answer = "YES";

        int lt = 0, rt = input_1.length() - 1;

        while (lt < rt) {
            if (input_1.charAt(lt) != input_1.charAt(rt)) {
                answer = "NO";
                break;
            } else {
                lt++;
                rt--;
            }
        }

        System.out.println(answer);
    }
}
