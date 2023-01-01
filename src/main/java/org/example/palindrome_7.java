package org.example;

import java.util.Scanner;

public class palindrome_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String input_1 = in.nextLine().toLowerCase();
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
