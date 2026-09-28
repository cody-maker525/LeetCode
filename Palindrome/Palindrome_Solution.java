package Palindrome;

import java.util.Scanner;

public class Palindrome_Solution{

    public static boolean pal(String in){
        int i = 0;
        while(i<in.length()/2){
            int j = in.length()-1;
            if(in.charAt(i) != in.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;

    }
    public static void main(String args []){
        Scanner sc= new Scanner(System.in);
        String in = sc.nextLine();
        boolean answer = pal(in);
        System.out.println(answer);
        sc.close();
    }

}