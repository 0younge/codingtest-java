class Solution {
    public int solution(int n) {
        StringBuilder base3 = new StringBuilder();
        int temp = n;
        while(temp > 0) {
            base3.append(temp % 3);
            temp /= 3;
        }
        int answer = 0;
        for(int i = 0; i < base3.length(); i++) {
            answer = answer * 3 + Character.getNumericValue(base3.charAt(i));
        }    
        return answer;
    }
}