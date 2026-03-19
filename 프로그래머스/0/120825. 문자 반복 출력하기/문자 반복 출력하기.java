class Solution {
    public String solution(String my_string, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < my_string.length(); i++) {
            String element = my_string.charAt(i) + "";
            sb.append(element.repeat(n));
        }
        return sb.toString();
    }
}