import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] numInOrder = Arrays.copyOf(emergency, emergency.length);
        Arrays.sort(numInOrder);
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < numInOrder.length; j++) {
                if (emergency[i] == numInOrder[j]) {
                    answer[i] = numInOrder.length - j;
                    break;
                }
            }
        }
        return answer;
    }
}