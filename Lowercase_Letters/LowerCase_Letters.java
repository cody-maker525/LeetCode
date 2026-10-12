package Lowercase_Letters;

import java.util.*;

public class LowerCase_Letters {

    public static void lowerCase_letters(String in, String compare) {
        String clean = in.replace("[^A-Za-z]", "");
        int count = 0;
        for (int i = 0; i < compare.length() - 1; i++) {
            for (int j = 0; j < clean.length(); j++) {
                if (compare.charAt(i) == clean.charAt(j)) {
                    count++;
                }
            }

        }
        if (count == 0) {
            System.out.println("The string has no lowercase letters defined by me");
        } else {
            System.out.println("The string has " + count + " lowercase letter defined by me");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        String compare = sc.nextLine();
        lowerCase_letters(in, compare);
        sc.close();

    }

}
