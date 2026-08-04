class Solution {
    public int countPrimes(int n) {
          boolean[] countPrime=new boolean[n]; 
          int count =0;
         

        for(int i = 2; i<n; i++){
            
           countPrime[i]=true;
        }

        for(int i =2; i<n; i++){
            if(countPrime[i]==true){
                count++;
                 for(int j=i*2; j<n; j+=i){
                
                     countPrime[j]=false;
                }
               
            } 
            }
          
       return count;
    }
}