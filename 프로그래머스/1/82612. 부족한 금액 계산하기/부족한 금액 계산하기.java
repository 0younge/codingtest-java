class Solution {
    public long solution(int price, int money, int count) {
        long total = (long) price * count * (count + 1) / 2;
        long diff = total - money;
        long answer = diff > 0 ? diff : 0;

        return answer;
    }
}