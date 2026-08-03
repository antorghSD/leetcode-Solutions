  import java.util.Arrays;  
class Solution {
    
    public int[] singleNumber(int[] nums) {
        int left=0;
        int len = nums.length;
        int right= len-1;
        int[] arr = new int[2];
        int count=0;
        int index=0;
        Arrays.sort(nums);
        
        while(left<right){
             if(nums[left]==nums[left+1]){
                left+=2;
             }
             else {
                arr[index]=nums[left];
                index++;
                left++;
             }
             

        
        if(left==right){
            arr[index]=nums[left];
        }
        }

        return arr;
    }
}