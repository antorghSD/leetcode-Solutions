bool canPlaceFlowers(int* flowerbed, int flowerbedSize, int n) {
    
    int m=0;
      int i =0;

    

   while(i<flowerbedSize){
        if(flowerbed[i]==0){

            if(i==0){
                if (flowerbedSize ==1 || flowerbed[i+1]==0 ){
                   m++;
                flowerbed[i]=1; 
                }
                 
            }
           
           else if(i==flowerbedSize-1){
           if (flowerbed[i-1]==0) {
             m++;
            flowerbed[i]=1;
           }
              }    

           else if(flowerbed[i-1]==0 && flowerbed[i+1]==0){
                m++;
                flowerbed[i]=1;
            }
        } 
        i++;
     }
      

     if(m>=n)
     return true;
     else 
     return false;
}