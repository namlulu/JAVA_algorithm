package org.example;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class removeDuplicateChar_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String input_1 = in.nextLine();
        char[] chars = input_1.toCharArray();

        LinkedHashSet charsSet = new LinkedHashSet<String>();

        for (char c : chars) {
            charsSet.add(c);
        }

        String answer =  charsSet.stream().reduce((x, y) -> x + y.toString()).get().toString();
        System.out.println(answer);
    }
}
