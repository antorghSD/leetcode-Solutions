import java.util.Arrays;
class Solution {
    public int firstMissingPositive(int[] nums) {

        Arrays.sort(nums);

        
int m=1;
        int len = nums.length;
        for(int i=0; i<len; i++){
            if(nums[i]<=0){
              continue;
            }
             if (i > 0 && nums[i] == nums[i - 1]) {
        continue;
    }

            if(nums[i]==m){
              m++;
            }
            else {
               break;

            } 

        }
        return m;
    }
}