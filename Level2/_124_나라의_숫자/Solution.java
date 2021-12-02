package _124_나라의_숫자;

public class Solution {
    public String solution(int n) {
        String answer = "";
        while (n > 0) {
            if (n % 3 == 0) {
                answer += "4";
                n--;
            } else {
                answer += Integer.toString(n % 3);
            }
            n /= 3;
        }
        StringBuffer sb = new StringBuffer(answer);
        return sb.reverse().toString();
    }
}