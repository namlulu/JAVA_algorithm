package org.example;

import java.util.Scanner;

public class wordInSentence_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String input_1 = in.nextLine();
        String answer = "";

        String[] words = input_1.split(" ");
        for (String word: words) {
            if (word.length() > answer.length()) {
                answer = word;
            }
        }

        System.out.println(answer);
    }
}