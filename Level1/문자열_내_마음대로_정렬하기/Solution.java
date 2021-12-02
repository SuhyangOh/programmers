package 문자열_내_마음대로_정렬하기;
import java.util.*;

public class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings);
        Comparator<String> cp = new Comparator<>() {
            public int compare(String s, String ss) {
                if (s.charAt(n) == ss.charAt(n)) {
                    return 0;
                }
                return (s.charAt(n) > ss.charAt(n) ? 1 : -1);
            }
        };
        Arrays.sort(strings, cp);
        return strings;
    }
}