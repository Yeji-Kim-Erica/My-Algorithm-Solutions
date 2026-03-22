class Solution {
    public int solution(int num, int k) {
        String answer = num + "";
        String lookingFor = k + "";
        for (int i = 0; i < answer.length(); i++) {
            if ((answer.charAt(i) + "").equals(lookingFor)) {
                return i + 1;
            }
        }
        return -1;
    }
}