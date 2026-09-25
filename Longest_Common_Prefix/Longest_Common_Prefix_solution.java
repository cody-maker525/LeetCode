package Longest_Common_Prefix;

import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String res = "";
        String sh = Arrays.stream(strs).min(Comparator.comparingInt(String::length)).orElse("");
        for (int j = 0; j < sh.length(); j++) {
            for (int i = 0; i < strs.length; i++) {
                if (strs[i].charAt(j) != strs[0].charAt(j)) {
                    res = strs[0].substring(0, j + 1);
                    return res;
                }
            }

        }
        return sh;
    }
}