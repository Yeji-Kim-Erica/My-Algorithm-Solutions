class Solution {
    public int solution(String my_string) {
        String[] stringArr = my_string.split("\\s");
        int answer = Integer.parseInt(stringArr[0]);
        for (int i = 1; i < stringArr.length; i++) {
            String content = stringArr[i];
            if (content.equals("+") || content.equals("-")) continue;
            if (stringArr[i-1].equals("-")) {
                answer -= Integer.parseInt(content);
            } else {
                answer += Integer.parseInt(content);
            }
        }
        return answer;
    }
}