class Solution {
    public int solution(int[] numbers, int k) {
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 1) {
                index = i;
                break;
            }
        }
        for (int i = 1; i <= k; i++) {
            if (index >= numbers.length) {
                index = index - numbers.length;
            }
            index += 2;
        }
        return numbers[index - 2];
    }
}