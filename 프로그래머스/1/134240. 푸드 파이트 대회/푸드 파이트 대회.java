class Solution {
    public String solution(int[] food) {
        StringBuffer answer = new StringBuffer();
        
        for (int i = 1; i < food.length; i++) {
			answer.append((i+"").repeat(food[i]/2));
		}
        
        return answer.toString() + "0" + answer.reverse().toString();
    }
}