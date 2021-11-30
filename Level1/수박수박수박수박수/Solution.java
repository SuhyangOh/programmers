package 수박수박수박수박수;

public class Solution {
    public String solution(int n) {
        // return new String(new char [n/2+1]).replace("\0", "수박").substring(0,n);
        String answer = "";
        for (int i = 0; i < n; i++) {
            // result += i % 2 == 0 ? "수" : "박";
            if (i % 2 == 0) {
                answer += "수";
            } else {
                answer += "박";
            }
        }
        return answer;
    }
}