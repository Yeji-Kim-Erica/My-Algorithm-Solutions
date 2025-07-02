class Solution {
    public int solution(String s) {
    	String[] sArr = s.split("\\s");
        int answer = 0;
        for (int i = sArr.length - 1; i >= 0 ; i--) {
			if (sArr[i].equals("Z")) {
				sArr[i - 1] = "0";
			} else {
				answer += Integer.parseInt(sArr[i]);
			}
		}
        return answer;
    }
}