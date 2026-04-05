class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0, 0};
        if (keyinput.length == 0) {
            return answer;
        }
        int colLimitPositive = board[1] / 2;
        int colLimitNegative = -1 * colLimitPositive;
        int rowLimitPositive = board[0] / 2;
        int rowLimitNegative = -1 * rowLimitPositive;
        for (int i = 0; i < keyinput.length; i++) {
            String input = keyinput[i];
            if (input.equals("up")) {
                answer[1] = Math.min(colLimitPositive, answer[1] + 1);
            }
            if (input.equals("down")) {
                answer[1] = Math.max(colLimitNegative, answer[1] - 1);
            }
            if (input.equals("left")) {
                answer[0] = Math.max(rowLimitNegative, answer[0] - 1);
            }
            if (input.equals("right")) {
                answer[0] = Math.min(rowLimitPositive, answer[0] + 1);
            }
        }
        return answer;
    }
}