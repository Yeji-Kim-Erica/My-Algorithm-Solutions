import java.util.*;

class Solution {
    public int[] solution(int[] num_list) {
        int listLength = num_list.length;
        int[] numListReversed = new int[listLength];
        for (int i = 0; i < listLength; i++) {
            int index = listLength - (i + 1);
            numListReversed[i] = num_list[index];
        }
        return numListReversed;
    }
}