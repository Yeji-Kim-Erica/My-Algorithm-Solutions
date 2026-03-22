import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        Arrays.sort(array);
        int answer = array[0];
        int diff = Math.abs(n - array[0]);
        for (int i = 0; i < array.length; i++) {
            int newDiff = Math.abs(n - array[i]);
            if (diff > newDiff) {
                diff = newDiff;
                answer = array[i];
            }
        }
        return answer;
    }
}