class Solution {
    public int solution(int num) {
        long num1 = (long) num;
        int answer = 0;
        if(num == 1) {
            return 0;
        }
        for(int i = 1; num1 > 0; i++) {
            switch ((int)(num1 % 2)) {
                case 0:
                    num1 /= 2;
                    break;
                case 1:
                    num1 = num1 * 3 + 1; 
                    break;
            }
            if (num1 == 1) {
                if (i > 500) {
                    answer = -1;
                    break;
                }
                answer = i;
                break;
            }
        }
        return answer;
    }
}