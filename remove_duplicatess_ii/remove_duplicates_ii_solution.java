package remove_duplicatess_ii;

class Solution {
    public int remove_duplicates_ii_solution(int[] nums) {

        int l = 0;
        int r = 0;
        int count = 0;
        while (r < nums.length && l < nums.length) {
            count = 1;
            while ((r + 1) < nums.length && nums[r] == nums[r + 1]) {
                count++;
                r++;

            }
            for (int j = 0; j < Math.min(2, count); j++) {
                nums[l] = nums[r];
                l++;
            }
            r++;

        }
        return l;
    }
}
