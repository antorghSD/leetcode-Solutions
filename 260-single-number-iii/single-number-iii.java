class Solution {
    public int[] singleNumber(int[] nums) {
        int len = nums.length;
        int[] arr = new int[2];
        int count=0;
        int index=0;

        for(int i = 0; i<len; i++){
            count=0;
            for(int j =0; j<len; j++){
                 if(i!=j && nums[i]==nums[j]){
                    count++;
                 }
            }
            if(count==0){
                arr[index]=nums[i];
                index++;
            }
            
        }

        return arr;
    }
}