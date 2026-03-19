class Solution {
    public int solution(int price) {
        double realPrice;
        if (price >= 500000) {
            realPrice = price * 0.8;
        } else if (price >= 300000) {
            realPrice =  price * 0.9;
        } else if (price >= 100000) {
            realPrice = price * 0.95;
        } else {
            realPrice = price;
        }
        return (int) realPrice;
    }
}