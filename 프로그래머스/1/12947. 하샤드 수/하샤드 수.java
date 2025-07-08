class Solution {
    public boolean solution(int x) {
        int i = x, div = 0;
        while (i >= 1) {
			div += i%10;
			i /= 10;
		}
        
        return x%div==0;
    }
}