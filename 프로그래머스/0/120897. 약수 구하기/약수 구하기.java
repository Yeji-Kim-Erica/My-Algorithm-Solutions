import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = {1};
        for (int i = 2; i <= n/2+1; i++) {
            if (n % i == 0) {
                int length = answer.length;
                answer = Arrays.copyOf(answer, length + 1);
                answer[length] = i;
            }
        }
        if (n != 1) {
            int length = answer.length;
            answer = Arrays.copyOf(answer, length + 1);
            answer[length] = n;
        }
        return answer;
    }
}