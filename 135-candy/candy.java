class Solution {
    public int candy(int[] ratings) {

        int len = ratings.length;

        int[] ans = new int[len];
         for(int i =0; i<len; i++){
              ans[i]=1;
        }
        

        for(int i =1; i<len; i++){
              if(ratings[i]> ratings[i-1]){
                ans[i]=ans[i-1]+1;
              }
              
               }
        
        for(int i =len-1; i>0; i--){
              if( ratings[i-1]> ratings[i]){
                ans[i - 1] = Math.max(ans[i - 1], ans[i] + 1);
              }
               
               
        }
        int count=0;

        for(int i =0; i<len; i++){
              count+=ans[i];
        }
        return count;
        
    }
}