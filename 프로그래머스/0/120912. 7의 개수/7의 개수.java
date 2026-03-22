class Solution {
    public int solution(int[] array) {
        int answer = 0;
        for (int num : array) {
            for (String single : (num + "").split("")) {
                if (single.equals("7")) {
                    answer++;
                }
            }
        }
        return answer;
    }
}