package Lowercase_Vowels;

import java.util.*;

public class Lowercase_vowels_solution {

    public static void solution(String in) {
        int count = 0;
        for (int i = 0; i < in.length() - 1; i++) {
            if (String.valueOf(in.charAt(i)).matches("[a|e|i|o|u]")) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("does not have any lowercase vowels");
        } else {
            System.out.println("The string has " + count + " lowercase vowels");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();

        solution(in);
        sc.close();
    }

}
