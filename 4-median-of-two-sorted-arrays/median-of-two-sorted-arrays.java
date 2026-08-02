
import java.util.Arrays;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int index=0;
       int[] nums = new int[len1 + len2];
     
        for(int i =0; i<len1; i++){

            nums[index]=nums1[i];
            index++;

        }
        
        for(int i =0; i<len2; i++){

              nums[index]=nums2[i];
              index++;
           }
        Arrays.sort(nums);
        
       int len = nums.length;

      if(len%2==0){
           int ll = len/2;
           int lll=ll-1;
           double k = (nums[ll]+nums[lll])/2.0;
           return k;
      }
      else{
        double k = nums[len/2];
        return k;
      }


    }
}