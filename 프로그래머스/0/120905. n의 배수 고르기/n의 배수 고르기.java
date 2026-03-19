import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] newList = new int[0];
        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0) {
                newList = Arrays.copyOf(newList, newList.length + 1);
                newList[newList.length - 1] = numlist[i];
            }
        }
        return newList;
    }
}