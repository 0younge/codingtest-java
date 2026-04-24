class Solution {
    public int[] solution(int[] arr) {
        int[] answer;
        if(arr.length <= 1) {
            return answer = new int[] {-1};
        }
        
        int minNum = arr [0];
        for(int num : arr) {
            if(num < minNum) {
                minNum = num;
            }
        }
        
        answer = new int[arr.length - 1];
        int i = 0;
        boolean removed = false;
        
        for (int num : arr) {
            if(!removed && num == minNum) {
                removed = true;
            } else {
                answer[i++] = num;
            }
        }
        
        
        return answer;
    }
}