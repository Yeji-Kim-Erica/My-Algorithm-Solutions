import java.util.*;

class Solution {
    public int solution(String before, String after) {
        char[] beforeArr = before.toCharArray();
        char[] afterArr = after.toCharArray();
        Arrays.sort(beforeArr);
        Arrays.sort(afterArr);
        boolean result = String.valueOf(beforeArr).equals(String.valueOf(afterArr));
        return result ? 1 : 0;
    }
}