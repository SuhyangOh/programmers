package 약수의_개수와_덧셈;

public class Solution {
    int div(int x) {
        int d = 1;
        for (int i = 2; i <= x; i++) {
            if (x % i == 0) {
                d++;
            }
        }
        return d;
    }
    int answer = 0;
    public int solution(int left, int right) {
        for (int i = left; i <= right; i++) {
            // 제곱수일때만 약수의 개수가 홀이다
            // i % Math.sqrt(i) == 0
            if (div(i) % 2 == 0) {
                answer +=i;
            } else {
                answer -= i;
            }
        }
        return answer;
    }
}