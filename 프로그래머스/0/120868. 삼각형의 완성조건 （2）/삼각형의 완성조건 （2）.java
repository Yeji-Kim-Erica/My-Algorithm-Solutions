import java.util.*;

class Solution {
    public int solution(int[] sides) {
    	// 순서 상관 X, 중복 허용 X -> HashSet
    	Set<Integer> lines = new HashSet<Integer>();
    	
    	// 배열 sides의 두 변 중 하나가 가장 긴 변일 때
    	int min = Math.min(sides[0], sides[1]);
    	int max = Math.max(sides[0], sides[1]);
    	int line = max; // 나머지 한 변
    	
    	while (min + line > max) {
    		lines.add(line);
			line--;
		}
    	
    	// 나머지 한 변이 가장 긴 변일 때
    	line = max + 1;
    	while (min + max > line) {
			lines.add(line);
			line++;
		}
    	
        return lines.size();
    }
}