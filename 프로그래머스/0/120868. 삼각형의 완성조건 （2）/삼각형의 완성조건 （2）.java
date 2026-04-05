import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        
        int answer = 0;
        for (int i = sides[1]; i >= 1; i--) {
            if (i + sides[0] <= sides[1]) {
                break;
            }
            answer++;
        }
        
        int sum = sides[0] + sides[1];
        for (int i = sides[1] + 1; i < sum; i++) {
            if (sum <= i) {
                break;
            }
            answer++;
        }
        return answer;
    }
}