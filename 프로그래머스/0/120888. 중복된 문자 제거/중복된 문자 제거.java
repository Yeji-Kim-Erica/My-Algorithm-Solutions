class Solution {
    public String solution(String my_string) {
        String[] StringArr = my_string.split("");
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < StringArr.length; i++) {
            if (answer.indexOf(StringArr[i]) == -1) {
                answer.append(StringArr[i]);
            }
        }
        return answer.toString();
    }
}