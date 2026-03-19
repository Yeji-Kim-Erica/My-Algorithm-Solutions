class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++) {
            char word = my_string.charAt(i);
            if (Character.isUpperCase(word)) {
                sb.append(Character.toLowerCase(word));
            } else {
                sb.append(Character.toUpperCase(word));
            }
        }
        return sb.toString();
    }
}