class Solution {
    public int solution(int n) {
        int div = 1;
        
        while (++div < n) {
			if (n%div==1) {
				break;
			}
		}
        
        return div;
    }
}