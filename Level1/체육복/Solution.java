package 체육복;
import java.util.*;
public class Solution {
    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = n;
        int[] students = new int[n];
        for (int i = 0; i < n; i++) {
            students[i] = 1;
        }
        for (int i = 0; i < lost.length; i++) {
            students[lost[i] - 1]--;
        }
        for (int i = 0; i < reserve.length; i++) {
            students[reserve[i] - 1]++;
        }
        for (int i = 0; i < n; i++) {
            if (students[i] == 0) {
                answer--;
                if (i != 0 && students[i - 1] == 2) {
                    students[i - 1]--;
                    answer++;
                } else if (i != (n - 1) && students[i + 1] == 2) {
                    students[i + 1]--;
                    answer++;
                }
            }
        }
        return answer;
    }
}