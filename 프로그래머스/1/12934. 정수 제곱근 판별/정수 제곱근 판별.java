class Solution {
    public long solution(long n) {
        long x = (long) Math.sqrt(n);
    
        long answer = 0;
        if (x * x == n) {
            answer =  (x + 1) * (x + 1);
        } else {
            answer =  -1;
        }
        
        return answer;
    }
}