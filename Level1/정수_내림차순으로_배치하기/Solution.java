package 정수_내림차순으로_배치하기;
import java.util.*;
class Solution {
    public long solution(long n) {
        char[] charArr = Long.toString(n).toCharArray();
        Arrays.sort(charArr);
        String result = new String(charArr);
        StringBuffer sb = new StringBuffer(result);
        String r = sb.reverse().toString();
        return Long.parseLong(r);
    }
}