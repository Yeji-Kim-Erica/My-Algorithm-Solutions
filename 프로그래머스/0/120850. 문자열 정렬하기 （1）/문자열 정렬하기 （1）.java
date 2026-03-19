import java.util.*;

class Solution {
    public int[] solution(String my_string) {
        String string = my_string.replaceAll("[a-zA-Z]", "");
        int[] answer = new int[string.length()];
        for (int i = 0; i < string.length(); i++) {
            answer[i] = Integer.parseInt(string.charAt(i) + "");
        }
        Arrays.sort(answer);
        return answer;
    }
}