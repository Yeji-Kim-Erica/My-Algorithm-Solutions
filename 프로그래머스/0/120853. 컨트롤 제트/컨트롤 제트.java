class Solution {
    public int solution(String s) {
        String[] numbers = s.split("-*\\d+\\sZ|\\s");
        int answer = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (!numbers[i].isEmpty())
            answer += Integer.parseInt(numbers[i]);
        }
        return answer;
    }
}