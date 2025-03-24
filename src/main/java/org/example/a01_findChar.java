package org.example;

import java.util.Scanner;

public class a01_findChar {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String input1 = in.nextLine();
        String input2 = in.nextLine();

        String lowerInput1 = input1.toLowerCase();
        char targetChar = input2.toLowerCase().charAt(0);

        int answer = 0;

        for (char c : lowerInput1.toCharArray()) {
            if (c == targetChar) {
                answer++;
            }
        }

        System.out.println(answer);
    }
}