import java.util.Arrays;
class Solution {
    public int findDuplicate(int[] nums) {
        
        Arrays.sort(nums);
        int len = nums.length;
     

      for(int i =len-1; i>0; i--){
        if(nums[i]==nums[i-1]){
            return nums[i];
        }
      }

      return -1;
    }
}