class Solution {
    public long solution(long n) {
        long answer = 0;
        String str = String.valueOf(n);
        int[] results = new int[str.length()];
        for(int i = 0 ; i < str.length() ; i ++){
            results[i] = str.charAt(i) - '0';
        }
        
        for(int i = 0 ; i < results.length - 1 ; i++){
            int maxIdx = i;
            for(int j = i + 1 ; j < results.length ; j++){
                if(results[j] > results[maxIdx]){
                    maxIdx = j;
                }
            }
            int temp = results[i];
            results[i] = results[maxIdx];
            results[maxIdx] = temp;
            
        }
        
        for(int k = 0; k < results.length ; k++){
            answer *= 10;
            answer += results[k];
        }
        return answer;
    }
}