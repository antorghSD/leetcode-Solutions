
class Solution {
    public int removeElement(int[] nums, int val) {

        int count =0;

        int len = nums.length;
        int index =0;


        for(int i =0; i<len; i++){
            if(val!=nums[i]){
                nums[index]=nums[i];
                index++;
                count++;
            }
        }
        return index;
        
    }
}