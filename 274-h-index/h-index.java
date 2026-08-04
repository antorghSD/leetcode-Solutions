
class Solution {
    public int hIndex(int[] citations) {
       
        int len = citations.length;

       
         int c=0, count = 0;
         
        for(int i = 1; i<=len; i++){
            c=0;
            for(int j=0; j<len; j++){
                if(citations[j]-i>=0){
                    c++;
                }
            }
            if(c>=i){
                count++;
            }
        }
           
        
        return count;
    }
}