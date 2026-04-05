class Solution {
    public int solution(int[][] dots) {
        int col = 0;
        int row = 0;
        
        for (int i = 1; i < dots.length; i++) {
            if (col != 0 && row != 0) {
                break;
            }
            
            if (col == 0) {
                int colDiff = dots[i-1][0] - dots[i][0];
                col = colDiff == 0 ? col : colDiff;
            }
            
            if (row == 0) {
                int rowDiff = dots[i-1][1] - dots[i][1];
                row = rowDiff == 0 ? row : rowDiff;
            }
        }
        
        return (int) Math.abs(row * col);
    }
}