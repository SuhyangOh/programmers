package _3진법;

public class Solution {
    public static int solution(int n) {
        long answer = 0;
        int three = 3;
        while (n > 0) {
            answer *= 10;
            answer += (n % three);
            n /= three;
        }
        int ans = 0;
        three = 1;
        while (answer > 0) {
            ans += ((answer % 10)* three);
            answer /= 10;
            three *= 3;
        }
        return ans;
    }
    public static void main(String[] args) {
        solution(78413450);
    }
}