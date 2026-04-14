class Solution {
    public int solution(int n) {
        int answer = n - 1;
        for(int i = n - 1; i > 0; i--) {
            if(n % i == 1) {
                if(answer > i) {
                    answer = i;
                }
            }
        }
        return answer;
    }
}