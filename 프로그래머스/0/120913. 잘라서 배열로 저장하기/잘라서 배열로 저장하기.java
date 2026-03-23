class Solution {
    public String[] solution(String my_str, int n) {
        int length = (int) Math.ceil(my_str.length() / (double) n);
        String[] answer = new String[length];
        for (int i = 0; i < answer.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if (my_str.isEmpty()) {
                    break;
                }
                String word = my_str.charAt(0) + "";
                sb.append(word);
                my_str = my_str.replaceFirst(word, "");
            }
            answer[i] = sb.toString();
        }
        return answer;
    }
}