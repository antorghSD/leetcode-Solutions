class Solution {
    
    int n =0;
    public int reverse(int x) {
      while(x!=0){
         int dig = x % 10;
         
         if(n> Integer.MAX_VALUE/10 || (n == Integer.MAX_VALUE/10 && dig>7)){
            return 0;
         }
         if(n< Integer.MIN_VALUE/10 || (n==Integer.MIN_VALUE/10 && dig<-8)){
            return 0;
         }
         n = n*10+dig;
         x = x/10;
      }
      return n;
    }
}