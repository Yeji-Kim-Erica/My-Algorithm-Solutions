class Solution {
    public int solution(String my_string) {
        String[] strings = my_string.replaceAll("[a-zA-Z]", "").split(""); 
        int answer = 0;
        for (int i = 0; i < strings.length; i++) {
            answer += Integer.parseInt(strings[i]);
        }
        return answer;
    }
}