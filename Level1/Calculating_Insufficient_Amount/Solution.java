package Calculating_Insufficient_Amount;

public class Solution {
    public long solution(int price, int money, int count) {
        // return Math.max(price * (((count + 1) * count) / 2) - money, 0);
        long answer = -1;
        long m = money;
        while (count > 0) {
            m -= price * count;
            count--;
        }
        if (m > 0) {
            return 0;
        }
        return m * -1;
    }
}