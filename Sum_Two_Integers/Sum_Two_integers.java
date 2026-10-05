package Sum_Two_Integers;
import java.util.*;

public class Sum_Two_integers {
    
    public static int [] twoSum(int [] nums, int target){
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int i = 0; i<nums.length; i++){

        if(map.containsKey(target-nums[i])){
        return new int[] {map.get(target-nums[i]), i};            
        }
        map.put(nums[i],i);  
    }
    return new int[]{-1,-1};
    }
    public static void main(String args[]){
        int[] nums = {15, 7, 2, 11};
        int target = 9;

        int [] ans = twoSum(nums, target);

        for(int i = 0; i<ans.length; i++){
            System.out.println(ans[i]);
        }



    }
    
}

