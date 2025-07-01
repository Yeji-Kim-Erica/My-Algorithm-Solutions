import java.util.*;

class Solution {
    public int solution(int n) {
    	ArrayList<Integer> divisorArr = new ArrayList<Integer>();
    	
    	divisorArr.add(n);
    	
    	for (int i = 1; i <= n/2; i++) {
    		if (n%i==0) {
    			divisorArr.add(i);
			}
		}
    	
        return divisorArr.stream().mapToInt(i -> i.intValue()).sum();
    }
}