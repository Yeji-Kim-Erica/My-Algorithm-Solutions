class Solution {
    public int solution(int n, int w, int num) {
        int[][] boxes = new int[(int) Math.ceil((double) n / w)][w];
        int boxNum = 1;
        int wantedBoxLowIndex = 0;
        int wantedBoxColIndex = 0;
        int endBoxColIndex = 0;
        for (int low = 0; low < boxes.length; low++) {
            if ((low + 1) % 2 == 1) {
                for (int col = 0; col < w; col++) {
                    if (boxNum == num) {
                        wantedBoxLowIndex = low;
                        wantedBoxColIndex = col;
                    }
                    boxes[low][col] = boxNum++;
                    if (boxNum > n) {
                        endBoxColIndex = col;
                        break;
                    }
                }
            } else {
                for (int col = w - 1; col >= 0; col--) {
                    if (boxNum == num) {
                        wantedBoxLowIndex = low;
                        wantedBoxColIndex = col;
                    }
                    boxes[low][col] = boxNum++;
                    if (boxNum > n) {
                        endBoxColIndex = col;
                        break;
                    }
                }
            }
            if (boxNum > n) break;
        }
        int adjust = 0;
        if (w * boxes.length > n) {
            if (boxes.length % 2 == 1) {
                adjust = endBoxColIndex < wantedBoxColIndex ? -1 : 0;
            } else {
                adjust = endBoxColIndex > wantedBoxColIndex ? -1 : 0;
            }            
        }
        return boxes.length - wantedBoxLowIndex + adjust;
    }
}