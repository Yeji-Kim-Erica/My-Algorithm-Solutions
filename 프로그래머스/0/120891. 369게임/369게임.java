class Solution {
    public int solution(int order) {
        int sum = 0;
        String[] orderString = String.valueOf(order).split("");
        for (int i = 0; i < orderString.length; i++) {
            if (orderString[i].matches("3|6|9")) {
                sum++;
            }
        }
        return sum;
    }
}