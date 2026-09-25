package Roman_to_Integer;

import java.util.HashMap;

class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> roman = new HashMap<Character, Integer>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        int r = 0;
        for (int i = 0; i < s.length(); i++) {
            int cur = roman.get(s.charAt(i));

            if (i + 1 < s.length() && cur < roman.get(s.charAt(i + 1))) {

                r -= cur;
            } else {
                r += cur;
            }
        }
        return r;
    }
}