class Solution {
    public void sortColors(int[] nums) {
int temp;
        int len = nums.length;
        for(int i = 0; i<len; i++){
            for(int j=1; j<len; j++){
                if(nums[j]<nums[j-1]){
                    temp = nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;
                }
                
            }
            
        }
        
        
    }
}