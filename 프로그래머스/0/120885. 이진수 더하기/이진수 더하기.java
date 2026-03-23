class Solution {
    public String solution(String bin1, String bin2) {
        int length = bin1.length();
        int sum = 0;
        for (int i = 0; i < length; i++) {
            String num = bin1.charAt(i) + "";
            if (num.equals("1")) {
                sum += (int) Math.pow(2, Math.abs(length - 1 - i));
            }
        }
        length = bin2.length();
        for (int i = 0; i < length; i++) {
            String num = bin2.charAt(i) + "";
            if (num.equals("1")) {
                sum += (int) Math.pow(2, Math.abs(length - 1 - i));
            }
        }
        
        if (sum == 0) {
            return "0";
        }
        
        int exponent = 0;
        while (sum / (int) Math.pow(2, exponent) > 0) {
            exponent++;
        }
        
        StringBuilder answer = new StringBuilder();
        for (int i = exponent - 1; i >= 0; i--) {
            int dividend = (int) Math.pow(2, i);
            if (sum - dividend >= 0) {
                answer.append("1");
                sum -= dividend;
            } else {
                answer.append("0");
            }
        }
        return answer.toString();
    }
}