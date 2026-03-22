class Solution {
    public int solution(String my_string) {
        int answer = 0;
        if (!my_string.replaceAll("[a-zA-Z]","").isBlank()) {
            for (String num : my_string.split("[a-zA-Z]")) {
                if (!num.isBlank()) {
                    answer += Integer.parseInt(num);   
                }
            }
        }
        return answer;
    }
}