package 피보나치_수;

public class Solution {
    public int solution(int n) {
        int[] fib = new int[]{0, 1};
        while (n > 2) {
            int f = (fib[0] + fib[1]) % 1234567;
            fib[0] = fib[1];
            fib[1] = f;
            n--;
        }
        return (fib[0] + fib[1]) % 1234567;
    }
}