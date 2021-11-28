package 문자열_압축;

import java.util.*;
public class Solution {
    public static int solution(String s) {
        int answer = s.length();
        for (int i = 1; i <= s.length() / 2; i++) {
            int l = i + s.length() % i;
            int repeat = 1;
            int start = 0;
            String a = s.substring(start, start + i);
            while ((start + i + i) <= s.length()) {
                start += i;
                String b = s.substring(start, start + i);
                if (a.equals(b)) {
                    repeat += 1;
                } else {
                    if (repeat > 1) {
                        l += Integer.toString(repeat).length();
                    }
                    repeat = 1;
                    l += i;
                    a = b;
                }
            }
            if (repeat > 1) {
                l += Integer.toString(repeat).length();
            }
            if (l < answer) {
                System.out.println(i);
                answer = l;
            }
        }
        return answer;
    }
}