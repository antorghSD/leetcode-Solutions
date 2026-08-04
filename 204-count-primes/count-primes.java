class Solution {
    public int countPrimes(int n) {
          
          int count =0;
          boolean[] countPrime=new boolean[n];

          if( n<=2 ){
            return 0;
          }
        
        int index = 0;
        int[] ar = new int[n];
        countPrime[0]=false;
        countPrime[1]=false;


        for(int i = 2; i<n; i++){
            
           countPrime[i]=true;
        }

        for(int i =2; i*i<n; i++){
            if(countPrime[i]==true)
            for(int j=i*i; j<n; j+=i){
                
                     countPrime[j]=false;
                }
               
            }
            
        
        for(int i = 2; i<n; i++){
            if(countPrime[i]==true){
                
           count++;
        }
        }

          
       return count;
    }
}