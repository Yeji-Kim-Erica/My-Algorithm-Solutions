class Solution {
    public long solution(String numbers) {
        String[] numberStandard = {"zero","one","two","three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < numberStandard.length; i++) {
            numbers = numbers.replaceAll(numberStandard[i], i + "");
        }
        return Long.parseLong(numbers);
    }
}