package 두_정수_사이의_합;

public class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        if (a > b) {
            int aa = a;
            a = b;
            b = aa;
        }
        for (int i = a; i <= b; i++) {
            answer+= i;
        }
        return answer;
    }
}