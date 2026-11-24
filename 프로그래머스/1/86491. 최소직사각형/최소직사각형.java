import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int count = sizes.length;
        int[] shorts = new int[count];
        int[] longs = new int[count];
        for (int i = 0; i < count; i++) {
            int horizontal = sizes[i][0];
            int vertical = sizes[i][1];
            shorts[i] = Math.min(horizontal, vertical);
            longs[i] = Math.max(horizontal, vertical);
        }
        Arrays.sort(shorts);
        Arrays.sort(longs);
        return shorts[count - 1] * longs[count - 1];
    }
}