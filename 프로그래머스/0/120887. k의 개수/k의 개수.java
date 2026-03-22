class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String find = k+"";
        for (int num = i; num <= j; num++) {
            String numString = num + "";
            if (numString.contains(find)) {
                for (String numStr : numString.split("")) {
                    if (numStr.equals(find)) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}