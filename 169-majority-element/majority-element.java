class Solution {
    public int majorityElement(int[] nums) {
        int len = nums.length;

          int count=0;
          

          for(int j=0; j<len; j++){

          for(int i=0; i<len; i++){

                if(nums[i]==nums[j]){
                    count ++;
                    
                }
                
           }
                 if (count > len / 2)
             return nums[j];
             else 
             count = 0;
          }
          return 0;
    }
}