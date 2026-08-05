import java.util.*;
class Solution {
    public int findDuplicate(int[] nums) {
        int len = nums.length;
        
      HashSet<Integer> set = new HashSet<>();

      for(int i =0; i<len; i++){
        if(set.contains(nums[i])){

            return nums[i] ;
        }
        set.add(nums[i]);
      } 
return -1;
    }   
}