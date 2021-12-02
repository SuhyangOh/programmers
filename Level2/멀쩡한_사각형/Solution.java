package 멀쩡한_사각형;

public class Solution {
    long gcd(long w, long h) {
        for (long i = w; i > 0; i--) {
            if (h % i == 0) {
                if (w % i == 0) {
                    return i;
                }
            }
        }
        return 1;
    }
    public long solution(int w, int h) {
        long gcd = gcd(Math.min(w,h), Math.max(w,h));
        long answer = (long) w * (long) h;
        long sq = ((w / gcd) + (h/ gcd) - 1);
        answer -= gcd * sq;
        return (long) answer;
    }
}