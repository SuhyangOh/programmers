package 소수_찾기;
import java.util.*;
class Solution {
    public static int solution(int n) {
        int answer = -Math.floorDiv(-n,2);
        for (int i = 5; i <= n; i += 2) {
            for (int j = 3; j <= Math.sqrt(i); j+= 2) {
                if (i % j == 0) {
                    answer--;
                    break;
                }
            }
        }
        return answer;
    }
}