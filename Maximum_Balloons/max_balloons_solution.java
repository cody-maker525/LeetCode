
package Maximum_Balloons;

import java.util.HashMap;

class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> indexMap = new HashMap<>();

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == 'b' || c == 'a' || c == 'l' || c == 'o' || c == 'n') {
                if (indexMap.containsKey(c)) {
                    indexMap.put(c, indexMap.get(c) + 1);
                } else {
                    indexMap.put(c, 1);
                }
            }
        }

        // put get or default in case the letter is not
        // in the text at all
        int[] counts = {
                indexMap.getOrDefault('b', 0) / 1,
                indexMap.getOrDefault('a', 0) / 1,
                indexMap.getOrDefault('l', 0) / 2,
                indexMap.getOrDefault('o', 0) / 2,
                indexMap.getOrDefault('n', 0) / 1
        };
        int min = counts[0];
        // for each value in count compare to current min
        for (int val : counts) {
            min = Math.min(min, val);
        }
        return min;
    }
}
