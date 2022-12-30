package org.example;

import java.util.Scanner;

public class reverseSpecificWord_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String input_1 = in.nextLine();
        char[] chars = input_1.toCharArray();

        int lt = 0, rt = chars.length - 1;
        char temp;

        while (lt < rt) {
            char cl = chars[lt];
            char cr = chars[rt];

            if (!Character.isAlphabetic(cl)) {
                lt ++;
            } else if (!Character.isAlphabetic(cr)) {
                rt --;
            } else {
                temp = cl;
                chars[lt] = cr;
                chars[rt] = temp;
                lt ++;
                rt --;
            }
        }

        String answer = "";
        for (char c : chars) {
            answer += c;
        }

        System.out.println(answer);
    }
}
