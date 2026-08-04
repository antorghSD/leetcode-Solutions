class Solution {
    public int missingNumber(int[] nums) {

        int len = nums.length;

       
        int flag;

        for(int i=0; i<=len; i++){
             flag = 0;
            for(int j =0; j<len; j++){
                if(i == nums[j]){
                   flag = 1;
                   break;
                }
            }
            if(flag==0){
               return i;
            }
        }
   return -1;
    }
}