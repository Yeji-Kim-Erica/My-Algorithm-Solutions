class Solution {
    public String solution(String rsp) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < rsp.length(); i++) {
            String element = rsp.charAt(i) + "";
            if (element.equals("2")) {
                sb.append("0");
            } else if (element.equals("0")) {
                sb.append("5");
            } else if (element.equals("5")) {
                sb.append("2");
            }
        }
        return sb.toString();
    }
}