import java.util.*;

class Solution {
    public int solution(String s) {
    	String[] sArr = s.split("\\s");
        
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < sArr.length ; i++) {
			if (sArr[i].equals("Z")) {
				stack.pop();
			} else {
				stack.push(Integer.parseInt(sArr[i]));
			}
		}
        
        int answer = 0;
        for (int n : stack) {
        	answer += n;
		}
        
        return answer;
    }
    
/* 이전 풀이
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
*/
    
}