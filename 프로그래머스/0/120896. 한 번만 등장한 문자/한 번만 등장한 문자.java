import java.util.*;
import java.util.Map.Entry;

class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] sArr = s.split("");
        Arrays.sort(sArr);
        Map<String, Integer> wordCount = new LinkedHashMap();
        for(int i = 0; i < sArr.length; i++) {
             wordCount.put(sArr[i], wordCount.getOrDefault(sArr[i], 0) + 1);
        }
        for (Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() == 1) {
                answer.append(entry.getKey());
            }
        }
        return answer.toString();
    }
}