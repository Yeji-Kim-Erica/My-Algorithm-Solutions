class Solution {
    public String solution(String my_string, int num1, int num2) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++) {
            char word = my_string.charAt(i);
            if (i == num1) {
                word = my_string.charAt(num2);
            }
            if (i == num2) {
                word = my_string.charAt(num1);
            }
            sb.append(word);
        }
        return sb.toString();
    }
}