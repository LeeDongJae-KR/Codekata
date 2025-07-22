class Solution {
    public int solution(int num) {
        int collatznum = num;
        
     for(int i = 0 ; i < 500 ; i++){
         if((collatznum % 2) == 0 && collatznum > 1 ){
             collatznum /= 2;
         } else if ((collatznum % 2) == 1 && collatznum > 1){
             collatznum = collatznum * 3 + 1;
         } else if (collatznum == 1){
             return i;
         } else
             return -1;
     }
        return collatznum;
    }
}