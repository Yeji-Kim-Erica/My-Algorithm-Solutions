class Solution {
    public int solution(int n) {
        int answer = 0;
        while (n > 0) {
            int remainder = n % 10;
            answer += remainder;
            n = n / 10;
        }
        return answer;
    }
}